package com.bridgelabz;

public class MaxNumberFinder {
    public static Integer findingMaxNumber(Integer num1, Integer num2, Integer num3) {
        Integer max = num1;
        if (num2.compareTo(max) > 0) {
            max = num2;
        }
        if (num3.compareTo(max) > 0) {
            max = num3;
        }
        return max;
    }

    public static Float findingMaxNumber(Float num1, Float num2, Float num3) {
        Float max = num1;
        if (num2.compareTo(max) > 0) {
            max = num2;
        }
        if (num3.compareTo(max) > 0) {
            max = num3;
        }
        return max;
    }
    public static String findingMaxNumber(String str1, String str2, String str3) {
        String max = str1;
        if (str2.compareTo(max) > 0) {
            max = str2;
        }
        if (str3.compareTo(max) > 0) {
            max = str3;
        }
        return max;
    }
}
