package com.frost;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<>();
        while (true) {
            String input = reader.readLine();
            list.add(input);
            if (input.equals("")) {
                break;
            }
        }

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).length() % 2 == 0) {
                System.out.println(list.get(i) + " " + list.get(i));
            } else {
                System.out.println(list.get(i) + " " + list.get(i) + " " + list.get(i));

            }
        }
    }
}



                                         //  Мой Варик

//public class Main {
//    public static void main(String[] args) throws IOException {
//        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//
//        ArrayList<String> strings = new ArrayList<String>();
//        while (true) {
//            String string = reader.readLine();
//            if (string == null || string.isEmpty()) break;
//            strings.add(string);
//        }
//
//        ArrayList<String> resultStrings = new ArrayList<>();
//        for (int i = 0; i < strings.size(); i++) {
//            if(strings.get(i).length() % 2 == 0){
//                resultStrings.add(strings.get(i));
//                resultStrings.add(strings.get(i));
//            }
//
//            if(strings.get(i).length() % 2 != 0) {
//                resultStrings.add(strings.get(i));
//                resultStrings.add(strings.get(i));
//                resultStrings.add(strings.get(i));
//
//            }
//        }
//
//        for (int i = 0; i < resultStrings.size() - 1; i++) {
//            if(resultStrings.get(i) == resultStrings.get(i + 1)){
//                System.out.print(resultStrings.get(i) + " ");
//            }else{
//                System.out.println(resultStrings.get(i));
//            }
//
//        }
//
//    }}
