package edu.uic.cs474.hw1;

import org.junit.Assert;
import org.junit.Test;

public class Test07_OnePrimitiveDefaultField {
    int fieldname = 20;
    @Test
    public void test() {
        String expected = "{ fieldname:20}";
        Assert.assertEquals(expected, new Test07_OnePrimitiveDefaultField().toString());
    }
}
