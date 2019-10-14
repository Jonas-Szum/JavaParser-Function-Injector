package edu.uic.cs474.hw1;

import org.junit.Assert;
import org.junit.Test;
public class Test08_OneStaticPrimitiveFinalProtectedOneStaticPrimitiveFinalPublicField {

    public static final int field1 = 1;

    protected static final int field2 = 2;

    @Test
    public void test() {
        String expected = "{+edu.uic.cs474.hw1.Test08_OneStaticPrimitiveFinalProtectedOneStaticPrimitiveFinalPublicField.field1=1;#edu.uic.cs474.hw1.Test08_OneStaticPrimitiveFinalProtectedOneStaticPrimitiveFinalPublicField.field2=2}";
        Assert.assertEquals(expected, new Test08_OneStaticPrimitiveFinalProtectedOneStaticPrimitiveFinalPublicField().toString());
    }

    public String toString() {
        edu.uic.cs474.hw1.runtime.Runtime.registerPrimitiveField("+", "field1", "int", this.field1, true, true, "edu.uic.cs474.hw1.Test08_OneStaticPrimitiveFinalProtectedOneStaticPrimitiveFinalPublicField.");
        edu.uic.cs474.hw1.runtime.Runtime.registerPrimitiveField("#", "field2", "int", this.field2, true, true, "edu.uic.cs474.hw1.Test08_OneStaticPrimitiveFinalProtectedOneStaticPrimitiveFinalPublicField.");
        return edu.uic.cs474.hw1.runtime.Runtime.getToString();
    }
}