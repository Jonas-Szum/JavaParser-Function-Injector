package edu.uic.cs474.hw1;

import org.junit.Assert;
import org.junit.Test;
public class Test01_EmptyClass {

    @Test
    public void test() {
        String expected = "{}";
        Assert.assertEquals(expected, new Test01_EmptyClass().toString());
    }

    public String toString() {
        return edu.uic.cs474.hw1.runtime.Runtime.getToString();
    }
}