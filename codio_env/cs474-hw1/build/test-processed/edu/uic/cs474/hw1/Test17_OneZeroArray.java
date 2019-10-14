package edu.uic.cs474.hw1;

import org.junit.Assert;
import org.junit.Test;
public class Test17_OneZeroArray {

    public int[] arrayType = new int[2];

    @Test
    public void test() {
        String expected = "{+arrayType:[0:0,1:0]}";
        Assert.assertEquals(expected, new Test17_OneZeroArray().toString());
    }

    public String toString() {
        edu.uic.cs474.hw1.runtime.Runtime.registerPrimitiveField("+", "arrayType", "int", this.arrayType, false, false, "edu.uic.cs474.hw1.Test17_OneZeroArray.");
        return edu.uic.cs474.hw1.runtime.Runtime.getToString();
    }
}