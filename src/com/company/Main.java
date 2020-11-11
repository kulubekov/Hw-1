package com.company;

import java.util.Scanner;

public class Main {

    private static Scanner in = new Scanner(System.in);


    public static void main(String[] args) {
        // write your code here
        String hiWorld;
        hiWorld = "Привет Мир!";
        final int num = 12;
        String word = hiWorld + num;
        System.out.println(word);
        if (num < 0) {
            System.out.println("Отрицательное число");
        } if (num > 0) {
            System.out.println("Положительное число");
        }else {
            System.out.println("Вы сохранили ноль");
        }
        String s = in.nextLine();
        System.out.println("Здравствуйте " + s);
    }
}