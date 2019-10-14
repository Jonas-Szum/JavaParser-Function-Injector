package edu.uic.cs474.hw1;

import org.junit.Assert;
import org.junit.Test;
public class Test06_OnePrimitiveProtectedField {

    protected int fieldname = 20;

    @Test
    public void test() {
        String expected = "{#fieldname:20}";
        Assert.assertEquals(expected, new Test06_OnePrimitiveProtectedField().toString());
    }

    public String toString() {
        edu.uic.cs474.hw1.runtime.Runtime.registerPrimitiveField("#", "fieldname", "int", this.fieldname, false, false, "edu.uic.cs474.hw1.Test06_OnePrimitiveProtectedField.");
        return edu.uic.cs474.hw1.runtime.Runtime.getToString();
    }
}