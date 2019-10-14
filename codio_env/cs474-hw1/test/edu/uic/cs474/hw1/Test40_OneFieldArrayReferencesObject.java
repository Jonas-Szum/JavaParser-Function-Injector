package edu.uic.cs474.hw1;

import org.junit.Assert;
import org.junit.Test;

public class Test40_OneFieldArrayReferencesObject {
    public Test40_OneFieldArrayReferencesObject[] ref;
    @Test
    public void test() {
        Test40_OneFieldArrayReferencesObject obj = new Test40_OneFieldArrayReferencesObject();
        obj.ref = new Test40_OneFieldArrayReferencesObject[]{obj};
        String expected = "{+ref:[0:...]}";
        Assert.assertEquals(expected, obj.toString());
    }
}
