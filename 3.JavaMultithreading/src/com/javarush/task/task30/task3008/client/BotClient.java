package com.javarush.task.task30.task3008.client;

import com.javarush.task.task30.task3008.ConsoleHelper;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;

public class BotClient extends Client {
    public static void main(String[] args) {
        BotClient botClient = new BotClient();
        botClient.run();
    }

    @Override
    protected SocketThread getSocketThread() {
        return new BotSocketThread();
    }

    protected boolean shouldSendTextFromConsole(){
        return false;
    }

    protected String getUserName() throws IOException, ClassNotFoundException {

        String userName = "date_bot_"+(int) (Math.random()*100);
        return userName;

    }

    public class BotSocketThread extends SocketThread{

        @Override
        protected void clientMainLoop() throws IOException, ClassNotFoundException {
            sendTextMessage("Привет чатику. Я бот. Понимаю команды: дата, день, месяц, год, время, час, минуты, секунды.");

            super.clientMainLoop();

        }

        @Override
        protected void processIncomingMessage(String message) {
//            HashMap<String, String> formats = new HashMap<String, String>() {
//                {
//                    put("дата", "d.MM.YYYY");
//                    put("день", "d");
//                    put("месяц", "MMMM");
//                    put("год", "YYYY");
//                    put("время", "H:mm:ss");
//                    put("час", "H");
//                    put("минуты", "m");
//                    put("секунды", "s");
//                }
//            };
//            if (message.contains(": ")) {
//                String[] array = message.split(": ");
//                if (array.length == 2 && array[1] != null) {
//                    String name = array[0];
//                    String text = array[1];
//
//                    formats.forEach((k, v) -> {
//                        if (text.equals(k)) {
//                            SimpleDateFormat simpleDateFormat = new SimpleDateFormat(v);
//
//                            sendTextMessage("Информация для " + name + ": " + simpleDateFormat.format(Calendar.getInstance().getTime()));
//
//                        }
//                    });
//                }
//            }


            if (message != null) {
                ConsoleHelper.writeMessage(message);
                SimpleDateFormat format = null;
                if (message.contains(": ")) {
                    String[] massiv = message.split(": ");
                    if (massiv.length == 2 && massiv[1] != null) {
                        String name = massiv[0];
                        String text = massiv[1];
                        switch (text) {
                            case "дата":
                                format = new SimpleDateFormat("d.MM.YYYY");
                                break;
                            case "день":
                                format = new SimpleDateFormat("d");
                                break;
                            case "месяц":
                                format = new SimpleDateFormat("MMMM");
                                break;
                            case "год":
                                format = new SimpleDateFormat("YYYY");
                                break;
                            case "время":
                                format = new SimpleDateFormat("H:mm:ss");
                                break;
                            case "час":
                                format = new SimpleDateFormat("H");
                                break;
                            case "минуты":
                                format = new SimpleDateFormat("m");
                                break;
                            case "секунды":
                                format = new SimpleDateFormat("s");
                                break;

                        }
                        if (format != null) {
                            sendTextMessage(String.format("Информация для %s: %s", name, format.format(Calendar.getInstance().getTime())));
                        }
                    }
                }
            }
        }
    }
}
