package com.leetcode.twosum;

import java.util.Scanner;

public class FibonacciSequence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a number :");
        int number = scanner.nextInt();
        while (number < 0) {
            System.out.println("Please enter positive number greate than zero");
            number = scanner.nextInt();
        }
        printFibonacci(number);
    }

    private static void printFibonacci(int number) {
        int fibonacci =0, number1 = 1, number2 = 0;
        if (number == 0) {
            System.out.println("fibonacci : " + number);
        }
        for (int i = 1; i <= number; i++) {
            fibonacci = number1 + number2;
            number1 = number2;
            number2 = fibonacci;
            System.out.println(fibonacci);
        }
    }
}
