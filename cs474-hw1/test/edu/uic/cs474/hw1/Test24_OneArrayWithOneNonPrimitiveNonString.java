package edu.uic.cs474.hw1;

import org.junit.Assert;
import org.junit.Test;


public class Test24_OneArrayWithOneNonPrimitiveNonString {
    public TestClass[] testArray = new TestClass[]{new TestClass()};
    @Test
    public void test() {
        String expected = "{+testArray:[0:test]}";
        Assert.assertEquals(expected, new Test24_OneArrayWithOneNonPrimitiveNonString().toString());
    }

    private static class TestClass{
        public String toString() {
            return "test";
        }
    }
}

