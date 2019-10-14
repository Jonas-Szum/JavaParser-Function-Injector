package edu.uic.cs474.hw1;

import org.junit.Assert;
import org.junit.Test;

public class Test13_OneNullStringField {
    public java.lang.String stringType = null;
    @Test
    public void test() {
        String expected = "{+stringType:null java.lang.String}";
        Assert.assertEquals(expected, new Test13_OneNullStringField().toString());
    }
}
