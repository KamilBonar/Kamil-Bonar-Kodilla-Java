package com.kodilla.stream.beautifier;

public class SignBetween {
    static String word = "";
    static String word1 = "";
    public static String signBetween(String text) {
        for (int n = 0; n < text.length(); n++) {
            char actualValue = text.charAt(n);
            String word = actualValue + "-";
            word1 = word1 + word;
        }
       return word1;
    }
}
