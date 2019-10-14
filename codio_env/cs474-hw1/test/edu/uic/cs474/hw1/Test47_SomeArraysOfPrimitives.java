package edu.uic.cs474.hw1;

import org.junit.Assert;
import org.junit.Test;

public class Test47_SomeArraysOfPrimitives {
    public int[] field1 = {0,1};
    public long[] field2 = {0,1};
    public float[] field3 = {0.1f,1.2f};
    public double[] field4 = {0.1,1.2};

    @Test
    public void test() {
        String expected = "{+field1:[0:0,1:1];+field2:[0:0L,1:1L];+field3:[0:0.1,1:1.2];+field4:[0:0.1D,1:1.2D]}";
        Assert.assertEquals(expected, new Test47_SomeArraysOfPrimitives().toString());
    }
}
