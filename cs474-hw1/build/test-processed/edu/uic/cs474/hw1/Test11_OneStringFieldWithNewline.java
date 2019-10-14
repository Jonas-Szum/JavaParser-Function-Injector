package edu.uic.cs474.hw1;

import org.junit.Assert;
import org.junit.Test;
public class Test11_OneStringFieldWithNewline {

    public String stringField = "Contents of the string\nfield";

    @Test
    public void test() {
        String expected = "{+stringField:\"Contents of the string\\nfield\"}";
        Assert.assertEquals(expected, new Test11_OneStringFieldWithNewline().toString());
    }

    public String toString() {
        edu.uic.cs474.hw1.runtime.Runtime.registerField("+", "stringField", "String", this.stringField, false, false, "edu.uic.cs474.hw1.Test11_OneStringFieldWithNewline.");
        return edu.uic.cs474.hw1.runtime.Runtime.getToString();
    }
}