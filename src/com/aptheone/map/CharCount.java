package com.aptheone.map;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class CharCount<Char> {
    public char firstNonRepeatedCharacter(String sentence) {
        Map<Character, Integer> maps = new HashMap<>();
        char[] chars = sentence.toCharArray();
        for (char ch : chars) {
            Integer count = maps.containsKey(ch) ? maps.get(ch) : 0;
            maps.put(ch, count + 1);
        }
        System.out.println(maps);
        for (char ch : chars) {
            if (maps.get(ch) == 1) {
                return ch;
            }
        }
        return Character.MIN_VALUE;
    }

    public char firstRepeatedCharacter(String sentence) {
        Set<Character> characterSet = new HashSet<>();
        char[] chars = sentence.toCharArray();
        for (char ch : chars) {
            if (characterSet.contains(ch)) {
                return ch;
            }
            characterSet.add(ch);
        }
        return Character.MIN_VALUE;
    }
}