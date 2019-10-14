package edu.uic.cs474.hw1;

import org.junit.Assert;
import org.junit.Test;

import java.lang.*;

public class Test32_NullWithWildcardImport {
    public String field = null;

    @Test
    public void test() {
        String expected = "{+field:null String}";
        Assert.assertEquals(expected, new Test32_NullWithWildcardImport().toString());
    }
}
