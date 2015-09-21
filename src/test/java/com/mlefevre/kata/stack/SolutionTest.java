package com.mlefevre.kata.stack;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class SolutionTest {

    @Test
    public void mainTest() {
        Solution solution = new Solution();
        int res = solution.process("12+4*621*++");

        assertEquals(20, res);
    }

    @Test
    public void mainTest_WrongOperation() {
        Solution solution = new Solution();
        int res = solution.process("12+4*621*+-");

        assertEquals(-1, res);
    }

}
