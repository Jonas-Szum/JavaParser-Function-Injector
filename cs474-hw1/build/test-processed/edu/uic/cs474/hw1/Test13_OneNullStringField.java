package edu.uic.cs474.hw1;

import org.junit.Assert;
import org.junit.Test;
public class Test13_OneNullStringField {

    public java.lang.String stringType = null;

    @Test
    public void test() {
        String expected = "{+stringType:null java.lang.String}";
        Assert.assertEquals(expected, new Test13_OneNullStringField().toString());
    }

    public String toString() {
        edu.uic.cs474.hw1.runtime.Runtime.registerField("+", "stringType", "java.lang.String", this.stringType, false, false, "edu.uic.cs474.hw1.Test13_OneNullStringField.");
        return edu.uic.cs474.hw1.runtime.Runtime.getToString();
    }
}