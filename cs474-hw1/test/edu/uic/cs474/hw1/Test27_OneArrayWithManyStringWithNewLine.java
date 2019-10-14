package edu.uic.cs474.hw1;

import org.junit.Assert;
import org.junit.Test;

public class Test27_OneArrayWithManyStringWithNewLine {
    public String[] arrayType = new String[]{"string1\n", "string2\nstring3"};
    @Test
    public void test() {
        String expected = "{+arrayType:[0:\"string1\\n\",1:\"string2\\nstring3\"]}";
        Assert.assertEquals(expected, new Test27_OneArrayWithManyStringWithNewLine().toString());
    }
}
