package edu.uic.cs474.hw1;

import org.junit.Assert;
import org.junit.Test;
public class Test44_OneObjectFieldRefersString {

    private Object field = "this is a string inside an object field";

    @Test
    public void test() {
        Test44_OneObjectFieldRefersString test = new Test44_OneObjectFieldRefersString();
        String expected = "{-field:\"" + field + "\"}";
        Assert.assertEquals(expected, test.toString());
    }

    public String toString() {
        edu.uic.cs474.hw1.runtime.Runtime.registerField("-", "field", "Object", this.field, false, false, "edu.uic.cs474.hw1.Test44_OneObjectFieldRefersString.");
        return edu.uic.cs474.hw1.runtime.Runtime.getToString();
    }
}