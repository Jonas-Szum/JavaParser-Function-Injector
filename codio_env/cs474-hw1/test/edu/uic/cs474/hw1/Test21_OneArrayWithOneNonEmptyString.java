package edu.uic.cs474.hw1;

import org.junit.Assert;
import org.junit.Test;

public class Test21_OneArrayWithOneNonEmptyString {
    public String[] arrayType = new String[]{"string1"};
    @Test
    public void test() {
        String expected = "{+arrayType:[0:\"string1\"]}";
        Assert.assertEquals(expected, new Test21_OneArrayWithOneNonEmptyString().toString());
    }
}
