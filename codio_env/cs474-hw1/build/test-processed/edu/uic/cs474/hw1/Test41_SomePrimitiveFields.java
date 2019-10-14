package edu.uic.cs474.hw1;

import org.junit.Assert;
import org.junit.Test;
public class Test41_SomePrimitiveFields {

    public int field1 = 1;

    public long field2 = Long.MAX_VALUE;

    public float field3 = Float.MIN_VALUE;

    public double field4 = Double.MAX_VALUE;

    @Test
    public void test() {
        String expected = "{+field1:1;+field2:" + Long.MAX_VALUE + "L;+field3:" + Float.MIN_VALUE + ";+field4:" + Double.MAX_VALUE + "D}";
        Assert.assertEquals(expected, new Test41_SomePrimitiveFields().toString());
    }

    public String toString() {
        edu.uic.cs474.hw1.runtime.Runtime.registerPrimitiveField("+", "field4", "double", this.field4, false, false, "edu.uic.cs474.hw1.Test41_SomePrimitiveFields.");
        edu.uic.cs474.hw1.runtime.Runtime.registerPrimitiveField("+", "field3", "float", this.field3, false, false, "edu.uic.cs474.hw1.Test41_SomePrimitiveFields.");
        edu.uic.cs474.hw1.runtime.Runtime.registerPrimitiveField("+", "field1", "int", this.field1, false, false, "edu.uic.cs474.hw1.Test41_SomePrimitiveFields.");
        edu.uic.cs474.hw1.runtime.Runtime.registerPrimitiveField("+", "field2", "long", this.field2, false, false, "edu.uic.cs474.hw1.Test41_SomePrimitiveFields.");
        return edu.uic.cs474.hw1.runtime.Runtime.getToString();
    }
}