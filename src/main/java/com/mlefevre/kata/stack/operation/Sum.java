package com.mlefevre.kata.stack.operation;

public class Sum implements Operation {

    @Override
    public int execute(int element1, int element2) {
        return element1 + element2;
    }
}
