package edu.uic.cs474.hw1;

import org.junit.Assert;
import org.junit.Test;

public class Test11_OneStringFieldWithNewline {
    public String stringField = "Contents of the string\nfield";

    @Test
    public void test() {
        String expected = "{+stringField:\"Contents of the string\\nfield\"}";
        Assert.assertEquals(expected, new Test11_OneStringFieldWithNewline().toString());
    }
}
