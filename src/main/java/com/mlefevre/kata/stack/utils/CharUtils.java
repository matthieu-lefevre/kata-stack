package com.mlefevre.kata.stack.utils;

public final class CharUtils {

    public static boolean isNumeric(char c) {
        return Character.isDigit(c);
    }

    public static int toInt(char c) {
        return Integer.parseInt(String.valueOf(c));
    }

}
