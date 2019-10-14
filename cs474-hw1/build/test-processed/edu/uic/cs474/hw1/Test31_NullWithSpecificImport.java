package edu.uic.cs474.hw1;

import org.junit.Assert;
import org.junit.Test;
import java.lang.String;
public class Test31_NullWithSpecificImport {

    public String field = null;

    @Test
    public void test() {
        String expected = "{+field:null java.lang.String}";
        Assert.assertEquals(expected, new Test31_NullWithSpecificImport().toString());
    }

    public String toString() {
        edu.uic.cs474.hw1.runtime.Runtime.registerField("+", "field", "java.lang.String", this.field, false, false, "edu.uic.cs474.hw1.Test31_NullWithSpecificImport.");
        return edu.uic.cs474.hw1.runtime.Runtime.getToString();
    }
}