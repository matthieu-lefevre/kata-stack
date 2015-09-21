package com.mlefevre.kata.stack;

import java.util.ArrayList;
import java.util.List;

public class Stack {

    private List<Integer> stack = new ArrayList<Integer>();


    public void push(int element) {
        stack.add(element);
    }

    public int pop() {
        int element = stack.get(stack.size()-1);
        stack.remove(stack.size()-1);
        return element;
    }

}
