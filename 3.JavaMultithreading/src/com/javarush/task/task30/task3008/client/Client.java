package com.javarush.task.task30.task3008.client;

import com.javarush.task.task30.task3008.Connection;
import com.javarush.task.task30.task3008.ConsoleHelper;
import com.javarush.task.task30.task3008.Message;
import com.javarush.task.task30.task3008.MessageType;

import java.io.IOException;
import java.net.Socket;

public class Client {
    protected Connection connection;
    private volatile boolean clientConnected = false;

    public static void main(String[] args) {
        Client client = new Client();
        client.run();
    }

    protected String getServerAddress(){
        ConsoleHelper.writeMessage("Введите адрес сервера (localhost если сервер запущен локально):");
            return ConsoleHelper.readString();
    }

    protected int getServerPort(){
        ConsoleHelper.writeMessage("Введите номер порта сервера:");
        return ConsoleHelper.readInt();
    }

    protected String getUserName() throws IOException, ClassNotFoundException {
//        while (true) {
//            connection.send(new Message(MessageType.NAME_REQUEST));
//            Message answer = connection.receive();
//            if (answer.getType() != MessageType.USER_NAME) continue;
//            String userName = answer.getData();
//            if (userName == null || userName.isEmpty()) continue;
//            return userName;
//        }
        ConsoleHelper.writeMessage("Введите ваше имя:");
        return ConsoleHelper.readString();

    }

    protected boolean shouldSendTextFromConsole(){
        return true;
    }

    protected SocketThread getSocketThread(){
        return new SocketThread();
    }

    protected void sendTextMessage(String text){
        try {
            connection.send(new Message(MessageType.TEXT,text));
        } catch (IOException e) {
            ConsoleHelper.writeMessage("sendTextMessage Class Client отправляется что то не то");
            clientConnected = false;
        }
    }

    public  void run(){
        SocketThread thread = getSocketThread();
        thread.setDaemon(true);
        thread.start();

        synchronized (this){
                try {
                    this.wait();
                } catch (InterruptedException e) {
                    ConsoleHelper.writeMessage("проблема в клиенте при запуске нити");
                    System.exit(1);
                }
                ConsoleHelper.writeMessage(clientConnected ? "Соединение установлено. Для выхода наберите команду 'exit'." : "Произошла ошибка во время работы клиента.");
                // по идее сверху надо добавить continue;

                while (clientConnected){
                    String line = ConsoleHelper.readString();
                    if (line.equals("exit")) break;
                    if (shouldSendTextFromConsole()) sendTextMessage(line);
                }



        }

    }



    public class SocketThread extends Thread{
        @Override
        public void run() {
            try {
                Socket socket = new Socket(getServerAddress(),getServerPort());
                connection = new Connection(socket);
                clientHandshake();
                clientMainLoop();
            } catch (IOException | ClassNotFoundException e ) {
                notifyConnectionStatusChanged(false);
            }


        }

        protected void processIncomingMessage(String message){
            ConsoleHelper.writeMessage(message);
        }

        protected void informAboutAddingNewUser(String userName){
            ConsoleHelper.writeMessage("Участник с именем" + userName +" присоединился к чату");
        }
        protected void informAboutDeletingNewUser(String userName){
            ConsoleHelper.writeMessage("Участник с именем" + userName +" покинул чат");
        }

        protected void notifyConnectionStatusChanged(boolean clientConnected){
            Client.this.clientConnected = clientConnected;
            synchronized (Client.this){
                Client.this.notify();
            }
        }

        protected void clientHandshake() throws IOException, ClassNotFoundException{
                while (!clientConnected){
                    Message answer = connection.receive();
                    if (answer.getType() == MessageType.NAME_REQUEST) connection.send(new Message(MessageType.USER_NAME,getUserName()));
                    else if (answer.getType() == MessageType.NAME_ACCEPTED) notifyConnectionStatusChanged(true);
                    else throw new IOException("Unexpected MessageType");
                }
        }

        protected  void clientMainLoop() throws IOException, ClassNotFoundException{
            while (true){
                Message answer = connection.receive();
                if (answer.getType() == MessageType.TEXT) processIncomingMessage(answer.getData());
                else if (answer.getType() == MessageType.USER_ADDED) informAboutAddingNewUser(answer.getData());
                else if (answer.getType() == MessageType.USER_REMOVED) informAboutDeletingNewUser(answer.getData());
                else throw new IOException("Unexpected MessageType");

            }

        }

    }


}
