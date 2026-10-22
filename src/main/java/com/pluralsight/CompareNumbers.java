package com.pluralsight;

public class CompareNumbers {
    public static void main(String[] args) {
        System.out.println(IsEven(5));
        System.out.println(IsPositive(6));


    }

    public static boolean IsEven(int number) {
        return number % 2 == 0;


    }

    public static boolean IsPositive(double number) {
        return number > 0;


    }
}
