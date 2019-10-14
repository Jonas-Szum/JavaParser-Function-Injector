package edu.uic.cs474.hw1;

import org.junit.Assert;
import org.junit.Test;

public class Test37_ManyFieldsOfStatic {
    public int fieldname3 = 2;
    public int fieldname4 = 3;
    public static int fieldname1 = 0;
    public static int fieldname2 = 1;
    @Test
    public void test() {
        String expected = "{+edu.uic.cs474.hw1.Test37_ManyFieldsOfStatic.fieldname1:0;+edu.uic.cs474.hw1.Test37_ManyFieldsOfStatic.fieldname2:1;+fieldname3:2;+fieldname4:3}";
        Assert.assertEquals(expected, new Test37_ManyFieldsOfStatic().toString());
    }
}
