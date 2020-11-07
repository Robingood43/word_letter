package com.company;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Random random= new Random();
        String str = "Hello my name is Kirill";
        String[] strArray = str.trim().split("\t\n\r,.");
        for (String temp : strArray) {
            System.out.println(temp);
        }
        for (String w : str.split("\\s+")) {
            char[] b = w.toCharArray();
            for (int i = 1; i < b.length - 1; i++) {
                int j = random.nextInt(b.length - 2) + 1;
                char t = b[i];
                b[i] = b[j];
                b[j] = t;
            }
            System.out.print(new String(b)+" ");
        }
    }
}