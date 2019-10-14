package edu.uic.cs474.hw1;

import org.junit.Assert;
import org.junit.Test;

public class Test05_OnePrimitivePrivateField {
    private int fieldname = 20;
    @Test
    public void test() {
        String expected = "{-fieldname:20}";
        Assert.assertEquals(expected, new Test05_OnePrimitivePrivateField().toString());
    }
}
