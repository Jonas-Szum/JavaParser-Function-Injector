package edu.uic.cs474.hw1;

import org.junit.Assert;
import org.junit.Test;

public class Test30_OutsideClassReturnsNewLine {
    private Helper helper = new Helper();

    @Test
    public void test() {
        String expected = "{-helper:This is\\na line change}";
        Assert.assertEquals(expected, new Test30_OutsideClassReturnsNewLine().toString());
    }

    private static class Helper {
        public String toString() {
            return "This is\na line change";
        }
    }
}
