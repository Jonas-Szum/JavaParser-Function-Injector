package edu.uic.cs474.hw1;

import org.junit.Assert;
import org.junit.Test;
public class Test16_OneNullFieldWithNonPrimitiveNonString {

    public java.util.List field = null;

    @Test
    public void test() {
        String expected = "{+field:null java.util.List}";
        Assert.assertEquals(expected, new Test16_OneNullFieldWithNonPrimitiveNonString().toString());
    }

    public String toString() {
        edu.uic.cs474.hw1.runtime.Runtime.registerField("+", "field", "java.util.List", this.field, false, false, "edu.uic.cs474.hw1.Test16_OneNullFieldWithNonPrimitiveNonString.");
        return edu.uic.cs474.hw1.runtime.Runtime.getToString();
    }
}