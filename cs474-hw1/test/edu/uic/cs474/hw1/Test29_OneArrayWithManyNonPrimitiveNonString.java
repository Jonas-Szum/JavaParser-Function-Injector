package edu.uic.cs474.hw1;

import org.junit.Assert;
import org.junit.Test;


public class Test29_OneArrayWithManyNonPrimitiveNonString {
    public TestClass[] testArray = new TestClass[]{new TestClass(),new TestClass()};
    @Test
    public void test() {
        String expected = "{+testArray:[0:test class,1:test class]}";
        Assert.assertEquals(expected, new Test29_OneArrayWithManyNonPrimitiveNonString().toString());
    }
    private static class TestClass {
        public String toString() {
            return "test class";
        }
    }
}