package com.leetcode.twosum;

public class LongestPalindrome {

    public static void main(String[] args) {
        int result = longestPalindrome("abccccdd");
        System.out.println(result);
    }

    private static int longestPalindrome(String string) {

        int[] char_counts = new int[128];
        for (char ch : string.toCharArray()) {
            char_counts[ch]++;
        }

        int result = 0;
        for (int char_count : char_counts) {
            result += char_count / 2 * 2;

            if (result % 2 == 0 && char_count % 2 == 1) {
                result += 1;
            }
        }

        return result;
    }

}
