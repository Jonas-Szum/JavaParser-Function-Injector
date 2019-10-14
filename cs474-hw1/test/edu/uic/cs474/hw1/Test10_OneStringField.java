package edu.uic.cs474.hw1;

import org.junit.Assert;
import org.junit.Test;

public class Test10_OneStringField {
    public String stringField = "Contents of the string field";
    @Test
    public void test() {
        String expected = "{+stringField:\"Contents of the string field\"}";
        Assert.assertEquals(expected, new Test10_OneStringField().toString());
    }
}
