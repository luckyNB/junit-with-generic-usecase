package com.bridgelabz;

public class MaxNumberFinder<X> {
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

    public static <X extends Comparable> X findingMaxGenerics(X a1, X a2, X a3) {
        X max = a1;
        if (a1.hashCode() > a2.hashCode() && a1.hashCode() > a3.hashCode()) {
            max = a1;
        } else if (a2.hashCode() > a1.hashCode() && a2.hashCode() > a3.hashCode()) {
            max = a2;
        }
        else
            max=a3;
        return max;
    }
}
