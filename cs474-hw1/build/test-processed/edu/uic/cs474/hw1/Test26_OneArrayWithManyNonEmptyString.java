package edu.uic.cs474.hw1;

import org.junit.Assert;
import org.junit.Test;
public class Test26_OneArrayWithManyNonEmptyString {

    public String[] arrayType = new String[] { "string1", "string2" };

    @Test
    public void test() {
        String expected = "{+arrayType:[0:\"string1\",1:\"string2\"]}";
        Assert.assertEquals(expected, new Test26_OneArrayWithManyNonEmptyString().toString());
    }

    public String toString() {
        edu.uic.cs474.hw1.runtime.Runtime.registerField("+", "arrayType", "String", this.arrayType, false, false, "edu.uic.cs474.hw1.Test26_OneArrayWithManyNonEmptyString.");
        return edu.uic.cs474.hw1.runtime.Runtime.getToString();
    }
}