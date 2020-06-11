package com.aptheone.stack;

import java.util.Stack;

public class StringReverse {

    public boolean isBalenced(String input) {
        if (input == null) {
            throw new IllegalArgumentException();
        }
        boolean isBalenced = false;
        Stack<Character> characterStack = new Stack<>();
        char current;
        for (char ch : input.toCharArray()) {
            if (ch == '(') {
                characterStack.push(ch);
            }
            if (ch == ')') {
                if (characterStack.empty()) return false;
                characterStack.pop();
            }
        }
        return characterStack.empty();
    }

    public String reverse(String input) {
        if (input == null) {
            throw new IllegalArgumentException();
        }
        Stack<Character> characterStack = new Stack<>();
        for (char ch : input.toCharArray()) {
            characterStack.push(ch);
        }
        StringBuffer reversed = new StringBuffer();
        while (!characterStack.isEmpty()) {
            reversed.append(characterStack.pop());
        }
        return reversed.toString();
    }
}

/*   for (int i=0; i<input.length();i++){
            characterStack.push(input.charAt(i));
        }*/