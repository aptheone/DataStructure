package com.aptheone.map;

import java.util.Map;
import java.util.Set;

public class TestCharCount {

    public static void main(String[] args) {
        String sentence ="a green apple";
        CharCount charCount = new CharCount();
        System.out.println(charCount.firstNonRepeatedCharacter(sentence));
        System.out.println(charCount.firstRepeatedCharacter(sentence));
    }
}
