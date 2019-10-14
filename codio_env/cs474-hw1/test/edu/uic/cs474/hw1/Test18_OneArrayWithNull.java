package edu.uic.cs474.hw1;

import org.junit.Assert;
import org.junit.Test;

public class Test18_OneArrayWithNull {
    public String[] arrayType = new String[1];
    @Test
    public void test() {
        String expected = "{+arrayType:[0:null String]}";
        Assert.assertEquals(expected, new Test18_OneArrayWithNull().toString());
    }
}
