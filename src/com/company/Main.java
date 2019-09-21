package com.company;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Random;

public class Main {

    public static void main(String[] args) {

        String str = generate();
        HashMap<Character, Integer> lettersAmount= new HashMap<>();
        for(int i=0;i<str.length();i++){
            char let= str.charAt(i);
            if(!lettersAmount.containsKey(let)){
                lettersAmount.put(let,1);
            }else{
                int amount = lettersAmount.get(let)+1;
                lettersAmount.put(let,amount);
            }
        }
        for(HashMap.Entry<Character,Integer> pair:lettersAmount.entrySet()){
            System.out.println(pair.getKey()+": "+pair.getValue());
        }

        //VCS-система конроля версий
        //Git
        //Push
        //github




        //словарь
        //ключ и значение
        //key-email, value-password  ctrl /
//        HashMap<String, String> users = new HashMap<>();
//        users.put("aaaa@gmail.com", "aaa");
//        users.put("bbb@gmail.com", "bbb");
//        users.put("ccc@gmail.com", "ccc");
//
////        System.out.println(users.get("bbb@gmail.com"));
////        users.put("bbb@gmail.com","zzz");
////        System.out.println(users.get("bbb@gmail.com"));
//
//        for(HashMap.Entry<String,String> entry: users.entrySet()){
//            System.out.println(entry.getKey());
//            System.out.println(entry.getValue());
//            System.out.println("______________");
//        }


       /* HashSet<String> usernames = new HashSet<>();
        usernames.add("Valera");//не хранит дубикатов
        usernames.add("Misha");
        usernames.add("Andrey");
        usernames.add("Maxim");
        usernames.add("Valera");

        for(String name: usernames)
            System.out.println(name);*/

    }
    private static String generate(){
        String str2= "";
        Random rand=new Random();
        int count=rand.nextInt(1000)+10;
        for(int i=0;i<count;i++){
            str2 += (char) (rand.nextInt('Z'-'A')+'A');
        }
        return str2;
    }
}
