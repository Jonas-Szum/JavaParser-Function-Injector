package edu.uic.cs474.hw1;

import org.junit.Assert;
import org.junit.Test;

public class Test12_OneEmptyStringField {
    public String stringType = "";
    @Test
    public void test() {
        String expected = "{+stringType:\"\"}";
        Assert.assertEquals(expected, new Test12_OneEmptyStringField().toString());
    }
}
