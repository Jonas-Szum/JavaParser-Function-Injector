package edu.uic.cs474.hw1;

import org.junit.Assert;
import org.junit.Test;
public class Test35_ManyFieldsOfVisibility {

    int fieldname3 = 30;

    public int fieldname1 = 10;

    private int fieldname4 = 40;

    protected int fieldname2 = 20;

    @Test
    public void test() {
        String expected = "{+fieldname1:10;#fieldname2:20; fieldname3:30;-fieldname4:40}";
        Assert.assertEquals(expected, new Test35_ManyFieldsOfVisibility().toString());
    }

    public String toString() {
        edu.uic.cs474.hw1.runtime.Runtime.registerPrimitiveField("+", "fieldname1", "int", this.fieldname1, false, false, "edu.uic.cs474.hw1.Test35_ManyFieldsOfVisibility.");
        edu.uic.cs474.hw1.runtime.Runtime.registerPrimitiveField(" ", "fieldname3", "int", this.fieldname3, false, false, "edu.uic.cs474.hw1.Test35_ManyFieldsOfVisibility.");
        edu.uic.cs474.hw1.runtime.Runtime.registerPrimitiveField("-", "fieldname4", "int", this.fieldname4, false, false, "edu.uic.cs474.hw1.Test35_ManyFieldsOfVisibility.");
        edu.uic.cs474.hw1.runtime.Runtime.registerPrimitiveField("#", "fieldname2", "int", this.fieldname2, false, false, "edu.uic.cs474.hw1.Test35_ManyFieldsOfVisibility.");
        return edu.uic.cs474.hw1.runtime.Runtime.getToString();
    }
}