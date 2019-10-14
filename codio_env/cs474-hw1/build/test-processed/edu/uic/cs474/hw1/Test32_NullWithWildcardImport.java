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

    public String toString() {
        edu.uic.cs474.hw1.runtime.Runtime.registerField("+", "field", "String", this.field, false, false, "edu.uic.cs474.hw1.Test32_NullWithWildcardImport.");
        return edu.uic.cs474.hw1.runtime.Runtime.getToString();
    }
}