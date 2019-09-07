package com.javarush.task.task19.task1905;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* 
Закрепляем адаптер
*/

public class Solution {
    public static Map<String,String> countries = new HashMap<String,String>();
static {
    countries.put("UA","Ukraine");
    countries.put("RU","Russia");
    countries.put("CA","Canada");
}
    public static void main(String[] args) {
//        Contact contact = new Contact() {
//            @Override
//            public String getName() {
//                return "Ivanov, Ivan";
//            }
//
//            @Override
//            public String getPhoneNumber() {
//                return "+380(50)123-4567";
//            }
//        };
//
//        Customer customer = new Customer() {
//            @Override
//            public String getCompanyName() {
//                return "JavaRush Ltd.";
//            }
//
//            @Override
//            public String getCountryName() {
//                return "Ukraine";
//            }
//        };
//
//
//        DataAdapter da = new DataAdapter(customer, contact);
//
//        System.out.println(da.getDialString());


    }

    public static class DataAdapter implements RowItem{
        private Customer customer;
        private Contact contact;

        public DataAdapter(Customer customer, Contact contact) {
            this.customer = customer;
            this.contact = contact;
        }

        @Override
        public String getCountryCode() {
            String countryCode =null;
            for (Map.Entry entry:countries.entrySet()){
                String key =(String) entry.getKey();
                String value =(String) entry.getValue();
                if (value.equals(customer.getCountryName())){
                    countryCode = key;
                }

            }
            return countryCode;
        }

        @Override
        public String getCompany() {
            return customer.getCompanyName();
        }

        @Override
        public String getContactFirstName() {
            String[] str = contact.getName().split(", ",2);
            return str[1];
        }

        @Override
        public String getContactLastName() {
            String[] str = contact.getName().split(", ",2);
            return str[0];
        }

        @Override
        public String getDialString() {
            String[] str = contact.getPhoneNumber().split("");
            ArrayList<String> list = new ArrayList<>();
            for (int i = 0; i <str.length ; i++) {
                if (str[i].equals("+") | str[i].equals("-") | str[i].equals("(") | str[i].equals(")")){
                }
                else{
                    list.add(str[i]);
                }
            }
            String result = "";
            for (String s:list){
                result += s;
            }
            return "callto://+" + result;

        }
    }

    public static interface RowItem {
        String getCountryCode();        //For example: UA
        String getCompany();            //For example: JavaRush Ltd.
        String getContactFirstName();   //For example: Ivan
        String getContactLastName();    //For example: Ivanov
        String getDialString();         //For example: callto://+380501234567
    }

    public static interface Customer {
        String getCompanyName();        //For example: JavaRush Ltd.
        String getCountryName();        //For example: Ukraine
    }

    public static interface Contact {
        String getName();               //For example: Ivanov, Ivan
        String getPhoneNumber();        //For example: +38(050)123-45-67 or +3(805)0123-4567 or +380(50)123-4567 or ...
    }
}