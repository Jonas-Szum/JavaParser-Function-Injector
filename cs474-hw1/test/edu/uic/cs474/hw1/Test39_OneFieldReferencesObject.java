package edu.uic.cs474.hw1;

import org.junit.Assert;
import org.junit.Test;

public class Test39_OneFieldReferencesObject {
    public Test39_OneFieldReferencesObject ref;
    @Test
    public void test() {
        Test39_OneFieldReferencesObject obj = new Test39_OneFieldReferencesObject();
        obj.ref = obj;
        String expected = "{+ref:...}";
        Assert.assertEquals(expected, obj.toString());
    }
}


