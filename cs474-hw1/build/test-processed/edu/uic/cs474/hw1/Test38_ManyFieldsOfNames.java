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

    public String toString() {
        edu.uic.cs474.hw1.runtime.Runtime.registerPrimitiveField("+", "fieldname3", "int", this.fieldname3, false, false, "edu.uic.cs474.hw1.Test38_ManyFieldsOfNames.");
        edu.uic.cs474.hw1.runtime.Runtime.registerPrimitiveField("+", "fieldname2", "int", this.fieldname2, false, false, "edu.uic.cs474.hw1.Test38_ManyFieldsOfNames.");
        edu.uic.cs474.hw1.runtime.Runtime.registerPrimitiveField("+", "fieldname1", "int", this.fieldname1, false, false, "edu.uic.cs474.hw1.Test38_ManyFieldsOfNames.");
        return edu.uic.cs474.hw1.runtime.Runtime.getToString();
    }
}