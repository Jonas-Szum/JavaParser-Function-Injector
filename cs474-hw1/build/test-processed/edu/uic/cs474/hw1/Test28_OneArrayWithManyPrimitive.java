package edu.uic.cs474.hw1;

import org.junit.Assert;
import org.junit.Test;
public class Test28_OneArrayWithManyPrimitive {

    public int[] arrayType = new int[] { 0, 1, 2, 3 };

    @Test
    public void test() {
        String expected = "{+arrayType:[0:0,1:1,2:2,3:3]}";
        Assert.assertEquals(expected, new Test28_OneArrayWithManyPrimitive().toString());
    }

    public String toString() {
        edu.uic.cs474.hw1.runtime.Runtime.registerPrimitiveField("+", "arrayType", "int", this.arrayType, false, false, "edu.uic.cs474.hw1.Test28_OneArrayWithManyPrimitive.");
        return edu.uic.cs474.hw1.runtime.Runtime.getToString();
    }
}