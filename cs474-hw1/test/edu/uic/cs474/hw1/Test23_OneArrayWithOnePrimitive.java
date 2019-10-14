package edu.uic.cs474.hw1;

import org.junit.Assert;
import org.junit.Test;

public class Test23_OneArrayWithOnePrimitive {
    public int[] arrayType = new int[]{1};
    @Test
    public void test() {
        String expected = "{+arrayType:[0:1]}";
        Assert.assertEquals(expected, new Test23_OneArrayWithOnePrimitive().toString());
    }
}
