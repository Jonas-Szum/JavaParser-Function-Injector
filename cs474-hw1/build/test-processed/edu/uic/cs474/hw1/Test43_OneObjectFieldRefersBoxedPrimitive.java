package edu.uic.cs474.hw1;

import org.junit.Assert;
import org.junit.Test;
public class Test43_OneObjectFieldRefersBoxedPrimitive {

    private Integer field = new Integer(20);

    @Test
    public void test() {
        String expected = "{-field:20}";
        Assert.assertEquals(expected, new Test43_OneObjectFieldRefersBoxedPrimitive().toString());
    }

    public String toString() {
        edu.uic.cs474.hw1.runtime.Runtime.registerField("-", "field", "Integer", this.field, false, false, "edu.uic.cs474.hw1.Test43_OneObjectFieldRefersBoxedPrimitive.");
        return edu.uic.cs474.hw1.runtime.Runtime.getToString();
    }
}