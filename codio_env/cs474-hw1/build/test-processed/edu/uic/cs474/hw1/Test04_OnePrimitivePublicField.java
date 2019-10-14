package edu.uic.cs474.hw1;

import org.junit.Assert;
import org.junit.Test;
public class Test04_OnePrimitivePublicField {

    public int fieldname = 20;

    @Test
    public void test() {
        String expected = "{+fieldname:20}";
        Assert.assertEquals(expected, new Test04_OnePrimitivePublicField().toString());
    }

    public String toString() {
        edu.uic.cs474.hw1.runtime.Runtime.registerPrimitiveField("+", "fieldname", "int", this.fieldname, false, false, "edu.uic.cs474.hw1.Test04_OnePrimitivePublicField.");
        return edu.uic.cs474.hw1.runtime.Runtime.getToString();
    }
}