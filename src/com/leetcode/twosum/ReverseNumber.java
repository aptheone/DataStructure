package com.leetcode.twosum;

public class ReverseNumber {

    public static void main(String[] args) {
        System.out.println(reverseNumber(12356565));
    }

    public static int reverseNumber(int num) {
        int resverse = 0;
        while (num>0) {
            resverse = (resverse * 10) + num % 10;
            num /= 10;
                if (resverse > Integer.MAX_VALUE || resverse<Integer.MIN_VALUE){
                    return 0;
                }
        }
    return resverse;
    }

}
