package com.example.util;

public class StringUtil {

    public static String reverseLetters(String str) {
        if (str == null || str.isEmpty()) {
            return "";
        }
        int start = 0;
        int end = str.length() - 1;
        char[] output = str.toCharArray();

        while (start < end) {

            boolean isStartLetter = Character.isLetter(output[start]);
            boolean isEndLetter = Character.isLetter(output[end]);


            if (!isStartLetter) {
                start++;
                continue;
            }

            if (!isEndLetter) {
                end--;
                continue;
            }

            char temp = output[start];
            output[start] = output[end];
            output[end] = temp;
            start++;
            end--;

        }


        return new String(output);
    }



}
