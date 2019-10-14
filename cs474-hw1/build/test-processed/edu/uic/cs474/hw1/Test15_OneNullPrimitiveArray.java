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

    public String toString() {
        edu.uic.cs474.hw1.runtime.Runtime.registerPrimitiveField("+", "arrayType", "int", this.arrayType, false, false, "edu.uic.cs474.hw1.Test15_OneNullPrimitiveArray.");
        return edu.uic.cs474.hw1.runtime.Runtime.getToString();
    }
}