package edu.uic.cs474.hw1;

import org.junit.Assert;
import org.junit.Test;

public class Test36_ManyFieldsOfFinal {
    public final int fieldname1 = 1;
    public int fieldname3 = 3;
    public int fieldname4 = 4;
    public final int fieldname2 = 2;
    @Test
    public void test() {
        String expected = "{+fieldname1=1;+fieldname2=2;+fieldname3:3;+fieldname4:4}";
        Assert.assertEquals(expected, new Test36_ManyFieldsOfFinal().toString());
    }
}
