package edu.uic.cs474.hw1;

import org.junit.Assert;
import org.junit.Test;

public class Test19_OneArrayWithManyNulls {
    public String[] arrayType = new String[]{null,"not null",null};
    @Test
    public void test() {
        String expected = "{+arrayType:[0:null String,1:\"not null\",2:null String]}";
        Assert.assertEquals(expected, new Test19_OneArrayWithManyNulls().toString());
    }
}
