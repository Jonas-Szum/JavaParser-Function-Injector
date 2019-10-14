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
}
