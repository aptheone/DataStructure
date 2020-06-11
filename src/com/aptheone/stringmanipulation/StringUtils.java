package com.aptheone.stringmanipulation;

import java.util.*;

public class StringUtils {

    public static final int ASCII_SIZE = 256;

    public static int countVowels(String str) {
        if (str == null) {
            return 0;
        }
        String vowels = "aeiou";
        int count = 0;
        for (char ch : str.toLowerCase().toCharArray()) {
            if (vowels.indexOf(ch) != -1) {
                count++;
            }
        }
        return count;
    }

    public static String reverse(String str) {
        if (str == null) {
            return "";
        }
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = str.length() - 1; i >= 0; i--) {
            stringBuilder.append(str.charAt(i));
        }
        return stringBuilder.toString();

    }

    public static String reverseWordsUsingAPI(String sentence) {
        if (sentence == null) {
            return "";
        }
        String[] words = sentence.trim().split(" ");
        Collections.reverse(Arrays.asList(words));
        return String.join(" ", words);
    }

    public static String reverseWords(String sentence) {
        if (sentence == null) {
            return "";
        }
        String[] words = sentence.trim().split(" ");
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = words.length - 1; i >= 0; i--) {
            // stringBuilder.append(reverse(words[i])).append(" ");
            stringBuilder.append(words[i]).append(" ");
        }
        return stringBuilder.toString().trim();
    }

    public static boolean areRotations(String str1, String str2) {
        if (str1 == null || str2 == null) {
            return false;
        }
        return (str1.length() == str2.length() && (str1 + str1).contains(str2));
    }

    public static String removeDuplicate(String str) {
        if (str == null || str.isEmpty()) {
            return "";
        }
        StringBuilder output = new StringBuilder();
        Set<Character> seen = new HashSet<>();
        for (char ch : str.toCharArray()) {
            if (!seen.contains(ch)) {
                seen.add(ch);
                output.append(ch);
            }
        }
        return output.toString();
    }

    public static char getMaxASCIIOccurringChar(String str) {
        if (str == null || str.isEmpty()) {
            throw new IllegalArgumentException();
        }
        int[] frequecies = new int[ASCII_SIZE];
        for (int i = 0; i < str.trim().length(); i++) {
            frequecies[str.charAt(i)]++;
        }

        int max = 0;
        char result = ' ';
        for (int i = 0; i < frequecies.length; i++) {
            if (frequecies[i] > max) {
                max = frequecies[i];
                result = (char) i;
            }
        }
        return result;
    }

    public static List<Character> getMaxOccurringChar(String str) {
        if (str == null) {
            throw new IllegalArgumentException();
        }
        Map<Character, Integer> maps = new HashMap<>();
        List<Character> characters = new ArrayList<>();
        int maxOccurring = 0;
        for (char ch : str.toCharArray()) {
            if (maps.containsKey(ch)) {
                maps.put(ch, maps.get(ch) + 1);
            } else {
                maps.put(ch, 1);
            }
            if (maps.get(ch) > maxOccurring) {
                maxOccurring = maps.get(ch);
            }
        }
        for (Map.Entry<Character, Integer> entries : maps.entrySet()) {
            if (entries.getValue() == maxOccurring) {
                characters.add(entries.getKey());
            }
        }
        return characters;
    }

    public static String sentenseCapitalization(String sentense) {
        if (sentense == null || sentense.isEmpty()) {
            return "";
        }
        String[] words = sentense
                .trim()
                .replaceAll(" +", " ")
                .split(" ");
        for (int i = 0; i < words.length; i++) {
            words[i] = words[i].substring(0, 1).toUpperCase() + words[i].substring(1).toLowerCase();
        }
        return String.join(" ", words);
    }

    public static boolean isPalindrom(String str){
        if (str==null || str.isEmpty()){
            return false;
        }
        int left=0;
        int right =str.length()-1;
        while (left<right){
            if (str.charAt(left++)!=str.charAt(right--)){
                return false;
            }
        }
        return true;
    }

    /*public static boolean areRotations(String str1, String str2) {
        if (str1.length() !=str2.length()){
            return false;
        }
        if (!(str1+str1).contains(str2))
            return false

        return true;
    }
*/

}
