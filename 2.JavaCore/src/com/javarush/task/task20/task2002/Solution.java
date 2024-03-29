package com.javarush.task.task20.task2002;

import java.io.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/* 
Читаем и пишем в файл: JavaRush
*/
public class Solution {
    public static void main(String[] args) {
        //you can find your_file_name.tmp in your TMP directory or adjust outputStream/inputStream according to your file's actual location
        //вы можете найти your_file_name.tmp в папке TMP или исправьте outputStream/inputStream в соответствии с путем к вашему реальному файлу
        try {
            File yourFile = File.createTempFile("your_file_name", null);
            OutputStream outputStream = new FileOutputStream(yourFile);
            InputStream inputStream = new FileInputStream(yourFile);

            JavaRush javaRush = new JavaRush();
            //initialize users field for the javaRush object here - инициализируйте поле users для объекта javaRush тут
            User user = new User();
            user.setFirstName("ss");
            user.setLastName("vvv");
            user.setBirthDate(new Date(2020,01,02));
            user.setMale(true);
            user.setCountry(User.Country.UKRAINE);

            javaRush.save(outputStream);
            outputStream.flush();

            JavaRush loadedObject = new JavaRush();
            loadedObject.load(inputStream);
            //here check that the codeGym object is equal to the loadedObject object - проверьте тут, что javaRush и loadedObject равны
            System.out.println(javaRush.equals(loadedObject));

            outputStream.close();
            inputStream.close();

        } catch (IOException e) {
            //e.printStackTrace();
            System.out.println("Oops, something is wrong with my file");
        } catch (Exception e) {
            //e.printStackTrace();
            System.out.println("Oops, something is wrong with the save/load method");
        }
    }

    public static class JavaRush {
        public List<User> users = new ArrayList<>();

        public void save(OutputStream outputStream) throws Exception {
            //implement this method - реализуйте этот метод
            PrintWriter writer = new PrintWriter(outputStream);
            if (users.size() > 0){
                for (User user:users){
                    writer.println(user.getFirstName());
                    writer.println(user.getLastName());
                    writer.println(user.getBirthDate().getTime());
                    writer.println(user.isMale());
                    writer.println(user.getCountry().getDisplayName());
                }
                writer.flush();
            }
            writer.close();
            outputStream.close();
        }

        public void load(InputStream inputStream) throws Exception {
            //implement this method - реализуйте этот метод
            BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));
            //ArrayList<User> list = new ArrayList<>();


                String firstName;
                while ((firstName = reader.readLine()) != null) {
                    User user = new User();
                    user.setFirstName(firstName);
                    user.setLastName(reader.readLine());
                    //Date date = new Date(Long.parseLong(reader.readLine()));
                    user.setBirthDate(new Date(Long.parseLong(reader.readLine())));
                    user.setMale(Boolean.parseBoolean(reader.readLine()));
                    String country = reader.readLine();
                    switch (country){
                        case "Ukraine" :
                            user.setCountry(User.Country.UKRAINE);
                            break;
                        case "Russia" :
                            user.setCountry(User.Country.RUSSIA);
                            break;
                        case "Other" :
                            user.setCountry(User.Country.OTHER);
                            break;
                    }
                    users.add(user);
                }




            reader.close();
            inputStream.close();
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            JavaRush javaRush = (JavaRush) o;

            return users != null ? users.equals(javaRush.users) : javaRush.users == null;

        }

        @Override
        public int hashCode() {
            return users != null ? users.hashCode() : 0;
        }
    }
}
