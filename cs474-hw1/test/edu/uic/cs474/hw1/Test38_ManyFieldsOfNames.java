package edu.uic.cs474.hw1;

import org.junit.Assert;
import org.junit.Test;

public class Test38_ManyFieldsOfNames {
    public int fieldname2 = 10;
    public int fieldname3 = 10;
    public int fieldname1 = 10;
    @Test
    public void test() {
        String expected = "{+fieldname1:10;+fieldname2:10;+fieldname3:10}";
        Assert.assertEquals(expected, new Test38_ManyFieldsOfNames().toString());
    }
}
