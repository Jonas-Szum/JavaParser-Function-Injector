package edu.uic.cs474.hw1;

import org.junit.Assert;
import org.junit.Test;
public class Test47_SomeArraysOfPrimitives {

    public int[] field1 = { 0, 1 };

    public long[] field2 = { 0, 1 };

    public float[] field3 = { 0.1f, 1.2f };

    public double[] field4 = { 0.1, 1.2 };

    @Test
    public void test() {
        String expected = "{+field1:[0:0,1:1];+field2:[0:0L,1:1L];+field3:[0:0.1,1:1.2];+field4:[0:0.1D,1:1.2D]}";
        Assert.assertEquals(expected, new Test47_SomeArraysOfPrimitives().toString());
    }

    public String toString() {
        edu.uic.cs474.hw1.runtime.Runtime.registerPrimitiveField("+", "field4", "double", this.field4, false, false, "edu.uic.cs474.hw1.Test47_SomeArraysOfPrimitives.");
        edu.uic.cs474.hw1.runtime.Runtime.registerPrimitiveField("+", "field1", "int", this.field1, false, false, "edu.uic.cs474.hw1.Test47_SomeArraysOfPrimitives.");
        edu.uic.cs474.hw1.runtime.Runtime.registerPrimitiveField("+", "field2", "long", this.field2, false, false, "edu.uic.cs474.hw1.Test47_SomeArraysOfPrimitives.");
        edu.uic.cs474.hw1.runtime.Runtime.registerPrimitiveField("+", "field3", "float", this.field3, false, false, "edu.uic.cs474.hw1.Test47_SomeArraysOfPrimitives.");
        return edu.uic.cs474.hw1.runtime.Runtime.getToString();
    }
}