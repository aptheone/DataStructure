package com.aptheone.array;

import java.util.Scanner;

public class TestArray {

    public static void main(String[] args) {

        Array structures = new Array(3);
        structures.insert(10);
        structures.insert(20);
        structures.insert(30);
        structures.insert(40);
        structures.insert(6);
        structures.insert(-1);
        structures.insert(30);
        structures.insert(1);
        System.out.println("MAX : "+ structures.max());
        System.out.println("MIN : "+ structures.min());
        System.out.println(structures.indexOf(40));
        structures.removeAt(0);
        structures.printArray();

        int[] items1= {7, 1, 5, 2, 3, 6};
        int[] items2= {3, 8, 6, 20, 7};
        System.out.println("-------------");
        structures.intersect1(items1, items2);
        /*
         * int[] newArray= structures.intersect(items1, items2);
         * System.out.println("-------------"); for (int i = 0; i < newArray.length;
         * i++) { System.out.println(newArray[i]); }
         */

    }

    /* Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter item to insert : ");
        int item =scanner.nextInt();*/

}
