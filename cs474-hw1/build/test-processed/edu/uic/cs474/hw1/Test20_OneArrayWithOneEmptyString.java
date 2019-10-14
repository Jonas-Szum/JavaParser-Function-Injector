package edu.uic.cs474.hw1;

import org.junit.Assert;
import org.junit.Test;
public class Test20_OneArrayWithOneEmptyString {

    public String[] arrayType = new String[] { "" };

    @Test
    public void test() {
        String expected = "{+arrayType:[0:\"\"]}";
        Assert.assertEquals(expected, new Test20_OneArrayWithOneEmptyString().toString());
    }

    public String toString() {
        edu.uic.cs474.hw1.runtime.Runtime.registerField("+", "arrayType", "String", this.arrayType, false, false, "edu.uic.cs474.hw1.Test20_OneArrayWithOneEmptyString.");
        return edu.uic.cs474.hw1.runtime.Runtime.getToString();
    }
}