package com.mlefevre.kata.stack.operation;


import java.util.HashMap;
import java.util.Map;

public class Operations {

    private static Map<Character, Operation> availableOperations = new HashMap<Character, Operation>();
    static {
        availableOperations.put('+', new Sum());
        availableOperations.put('*', new Multiply());
    }


    private Operations() {}


    public static Operation get(char operator) {
        return availableOperations.get(operator);
    }

}
