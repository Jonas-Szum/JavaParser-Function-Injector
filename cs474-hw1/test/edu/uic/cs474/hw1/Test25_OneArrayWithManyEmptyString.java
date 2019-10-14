package edu.uic.cs474.hw1;

import org.junit.Assert;
import org.junit.Test;

public class Test25_OneArrayWithManyEmptyString {
    public String[] arrayType = new String[]{"", ""};
    @Test
    public void test() {
        String expected = "{+arrayType:[0:\"\",1:\"\"]}";
        Assert.assertEquals(expected, new Test25_OneArrayWithManyEmptyString().toString());
    }
}
