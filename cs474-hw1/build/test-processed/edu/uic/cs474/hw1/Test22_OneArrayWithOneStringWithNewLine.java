package edu.uic.cs474.hw1;

import org.junit.Assert;
import org.junit.Test;
public class Test22_OneArrayWithOneStringWithNewLine {

    public String[] arrayType = new String[] { "string\n1" };

    @Test
    public void test() {
        String expected = "{+arrayType:[0:\"string\\n1\"]}";
        Assert.assertEquals(expected, new Test22_OneArrayWithOneStringWithNewLine().toString());
    }

    public String toString() {
        edu.uic.cs474.hw1.runtime.Runtime.registerField("+", "arrayType", "String", this.arrayType, false, false, "edu.uic.cs474.hw1.Test22_OneArrayWithOneStringWithNewLine.");
        return edu.uic.cs474.hw1.runtime.Runtime.getToString();
    }
}