package com.mlefevre.kata.stack;

import com.mlefevre.kata.stack.operation.Operation;
import com.mlefevre.kata.stack.operation.Operations;
import com.mlefevre.kata.stack.utils.CharUtils;

public class Solution {


    public int process(String chain) {
        Stack stack = new Stack();

        for(char c : chain.toCharArray()) {
            if(CharUtils.isNumeric(c)) {
                stack.push(CharUtils.toInt(c));
            } else {
                Operation operation = Operations.get(c);
                if(null == operation) {
                    return -1;
                }
                int res = operation.execute(stack.pop(), stack.pop());
                stack.push(res);
            }
        }
        return stack.pop();
    }

}
