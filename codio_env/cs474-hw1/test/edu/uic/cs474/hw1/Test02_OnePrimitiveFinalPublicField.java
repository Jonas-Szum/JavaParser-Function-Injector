package edu.uic.cs474.hw1;

import org.junit.Assert;
import org.junit.Test;

public class Test02_OnePrimitiveFinalPublicField {
    public final int fieldName = 20;
    @Test
    public void test() {
        String expected = "{+fieldName=20}";
        Assert.assertEquals(expected, new Test02_OnePrimitiveFinalPublicField().toString());
    }
}
