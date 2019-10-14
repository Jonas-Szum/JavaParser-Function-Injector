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

    public String toString() {
        edu.uic.cs474.hw1.runtime.Runtime.registerField("+", "ref", "Test39_OneFieldReferencesObject", this.ref, false, false, "edu.uic.cs474.hw1.Test39_OneFieldReferencesObject.");
        return edu.uic.cs474.hw1.runtime.Runtime.getToString();
    }
}