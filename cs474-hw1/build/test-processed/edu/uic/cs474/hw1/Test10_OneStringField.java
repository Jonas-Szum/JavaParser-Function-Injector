package edu.uic.cs474.hw1;

import org.junit.Assert;
import org.junit.Test;
public class Test10_OneStringField {

    public String stringField = "Contents of the string field";

    @Test
    public void test() {
        String expected = "{+stringField:\"Contents of the string field\"}";
        Assert.assertEquals(expected, new Test10_OneStringField().toString());
    }

    public String toString() {
        edu.uic.cs474.hw1.runtime.Runtime.registerField("+", "stringField", "String", this.stringField, false, false, "edu.uic.cs474.hw1.Test10_OneStringField.");
        return edu.uic.cs474.hw1.runtime.Runtime.getToString();
    }
}