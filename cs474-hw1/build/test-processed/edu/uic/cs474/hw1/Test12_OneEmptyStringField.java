package edu.uic.cs474.hw1;

import org.junit.Assert;
import org.junit.Test;
public class Test12_OneEmptyStringField {

    public String stringType = "";

    @Test
    public void test() {
        String expected = "{+stringType:\"\"}";
        Assert.assertEquals(expected, new Test12_OneEmptyStringField().toString());
    }

    public String toString() {
        edu.uic.cs474.hw1.runtime.Runtime.registerField("+", "stringType", "String", this.stringType, false, false, "edu.uic.cs474.hw1.Test12_OneEmptyStringField.");
        return edu.uic.cs474.hw1.runtime.Runtime.getToString();
    }
}