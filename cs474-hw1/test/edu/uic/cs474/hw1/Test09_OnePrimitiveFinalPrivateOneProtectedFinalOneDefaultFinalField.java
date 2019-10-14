package edu.uic.cs474.hw1;

import org.junit.Assert;
import org.junit.Test;

public class Test09_OnePrimitiveFinalPrivateOneProtectedFinalOneDefaultFinalField {
    final int field3 = 3;
    protected final int field2 = 2;
    private final int field1 = 1;
    @Test
    public void test() {
        String expected = "{#field2=2; field3=3;-field1=1}";
        Assert.assertEquals(expected, new Test09_OnePrimitiveFinalPrivateOneProtectedFinalOneDefaultFinalField().toString());
    }
}
