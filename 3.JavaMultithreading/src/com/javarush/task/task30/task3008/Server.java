package com.javarush.task.task30.task3008;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketAddress;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class Server {
    private final static Map<String, Connection> connectionMap = new ConcurrentHashMap<>();


    public static void main(String[] args) throws IOException {


        ServerSocket serverSocket = new ServerSocket(ConsoleHelper.readInt());
        Socket socket = null;

        System.out.println("Сервер запущен");
        try {
            while (true) {

                socket = serverSocket.accept();
                Handler handler = new Handler(socket);
                handler.start();
            }
        }catch (IOException e){
            System.out.println("ошибка сервер сокет");
            serverSocket.close();

        }


    }

    public static void sendBroadcastMessage(Message message){
        for (String s : connectionMap.keySet()) {
            try {
                connectionMap.get(s).send(message);
            } catch (IOException e) {
                System.out.println("сбой при отправки сообщения");
                e.printStackTrace();
            }
        }

    }

    private static class Handler extends Thread{
        private Socket socket;

        public Handler(Socket socket) {
            this.socket = socket;
        }

         private String serverHandshake(Connection connection) throws IOException, ClassNotFoundException{
            
                while (true) {
                    connection.send(new Message(MessageType.NAME_REQUEST));
                    Message answer = connection.receive();
                    if (answer.getType() != MessageType.USER_NAME) continue;
                    String userName = answer.getData();
                    if (userName == null || userName.isEmpty()) continue;
                    if (connectionMap.containsKey(userName)) continue;

                    connectionMap.put(userName,connection);
                    connection.send(new Message(MessageType.NAME_ACCEPTED));
                    return userName;
                }
        }

        private void notifyUsers(Connection connection, String userName) throws IOException{
            for (String s : connectionMap.keySet()) {
                if (!(s.equals(userName))){
                    connection.send(new Message(MessageType.USER_ADDED,  s));
                }
            }

        }

        private void serverMainLoop(Connection connection, String userName) throws IOException, ClassNotFoundException{

            while (true){
                Message message = connection.receive();

                    if (message.getType() == MessageType.TEXT) {
                        String outString = userName + ": " + message.getData();
                        sendBroadcastMessage(new Message(MessageType.TEXT, outString));

                    }
                    else{
                        ConsoleHelper.writeMessage("Ошибка: Не текстовое сообщение");
                    }


            }
        }

        public void run(){
            ConsoleHelper.writeMessage("Установлено соединение с удаленным сервером " + socket.getRemoteSocketAddress());
            String userName;
            try(Connection connection = new Connection(socket)){
               userName = serverHandshake(connection);
                sendBroadcastMessage(new Message(MessageType.USER_ADDED, userName));
                notifyUsers(connection,userName);
                serverMainLoop(connection,userName);
                connection.close();

                if (userName != null){
                    connectionMap.remove(userName);
                    sendBroadcastMessage(new Message(MessageType.USER_REMOVED, userName));
                }
                ConsoleHelper.writeMessage("Соединение с сервером закрыто");
            }catch (IOException | ClassNotFoundException e ){
                ConsoleHelper.writeMessage("ошибка обмена данных с удаленным сервером");
            }


        }
    }





}
