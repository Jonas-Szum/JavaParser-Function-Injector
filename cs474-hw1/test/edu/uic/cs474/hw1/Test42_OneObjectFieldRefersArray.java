package edu.uic.cs474.hw1;

import org.junit.Assert;
import org.junit.Test;

public class Test42_OneObjectFieldRefersArray {
    public Object field = new int[2];

    @Test
    public void test() {
        Test42_OneObjectFieldRefersArray test = new Test42_OneObjectFieldRefersArray();
        String expected = "{+field:[0:0,1:0]}";
        Assert.assertEquals(expected, test.toString());
    }
}
