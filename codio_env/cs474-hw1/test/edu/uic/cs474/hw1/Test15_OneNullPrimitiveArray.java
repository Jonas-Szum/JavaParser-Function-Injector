package edu.uic.cs474.hw1;

import org.junit.Assert;
import org.junit.Test;
public class Test15_OneNullPrimitiveArray {
    public int[] arrayType = null;
    @Test
    public void test() {
        String expected = "{+arrayType:null int[]}";
        Assert.assertEquals(expected, new Test15_OneNullPrimitiveArray().toString());
    }
}
