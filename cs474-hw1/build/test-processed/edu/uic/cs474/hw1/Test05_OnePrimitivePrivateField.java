package edu.uic.cs474.hw1;

import org.junit.Assert;
import org.junit.Test;
public class Test05_OnePrimitivePrivateField {

    private int fieldname = 20;

    @Test
    public void test() {
        String expected = "{-fieldname:20}";
        Assert.assertEquals(expected, new Test05_OnePrimitivePrivateField().toString());
    }

    public String toString() {
        edu.uic.cs474.hw1.runtime.Runtime.registerPrimitiveField("-", "fieldname", "int", this.fieldname, false, false, "edu.uic.cs474.hw1.Test05_OnePrimitivePrivateField.");
        return edu.uic.cs474.hw1.runtime.Runtime.getToString();
    }
}