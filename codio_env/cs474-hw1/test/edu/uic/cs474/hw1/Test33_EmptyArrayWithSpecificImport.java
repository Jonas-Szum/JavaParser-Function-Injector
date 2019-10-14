package edu.uic.cs474.hw1;

import org.junit.Assert;
import org.junit.Test;

import java.lang.String;

public class Test33_EmptyArrayWithSpecificImport {
    public String[] field = new String[0];

    @Test
    public void test() {
        String expected = "{+field:[] java.lang.String}";
        Assert.assertEquals(expected, new Test33_EmptyArrayWithSpecificImport().toString());
    }
}
