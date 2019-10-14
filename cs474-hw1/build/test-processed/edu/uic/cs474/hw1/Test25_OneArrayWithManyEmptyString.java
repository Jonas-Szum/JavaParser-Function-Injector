package edu.uic.cs474.hw1;

import org.junit.Assert;
import org.junit.Test;
public class Test25_OneArrayWithManyEmptyString {

    public String[] arrayType = new String[] { "", "" };

    @Test
    public void test() {
        String expected = "{+arrayType:[0:\"\",1:\"\"]}";
        Assert.assertEquals(expected, new Test25_OneArrayWithManyEmptyString().toString());
    }

    public String toString() {
        edu.uic.cs474.hw1.runtime.Runtime.registerField("+", "arrayType", "String", this.arrayType, false, false, "edu.uic.cs474.hw1.Test25_OneArrayWithManyEmptyString.");
        return edu.uic.cs474.hw1.runtime.Runtime.getToString();
    }
}