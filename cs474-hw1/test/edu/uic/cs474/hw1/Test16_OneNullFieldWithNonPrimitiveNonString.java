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
}
