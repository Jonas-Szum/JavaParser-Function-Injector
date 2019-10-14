package edu.uic.cs474.hw1;

import org.junit.Assert;
import org.junit.Test;

import java.lang.String;

public class Test31_NullWithSpecificImport {
    public String field = null;

    @Test
    public void test() {
        String expected = "{+field:null java.lang.String}";
        Assert.assertEquals(expected, new Test31_NullWithSpecificImport().toString());
    }
}
