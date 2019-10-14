package edu.uic.cs474.hw1;

import org.junit.Assert;
import org.junit.Test;

public class Test14_OneFieldWithNonPrimitiveNonString {
    public TestHelper field = new TestHelper();
    @Test
    public void test() {
        String expected = "{+field:helper}";
        Assert.assertEquals(expected, new Test14_OneFieldWithNonPrimitiveNonString().toString());
    }

    private static class TestHelper {
        public String toString() { return "helper"; }
    }
}
