package edu.uic.cs474.hw1;

import org.junit.Assert;
import org.junit.Test;
public class Test45_SomeOtherPrimitiveFields {

    char field1 = '+';

    byte field2 = 0x10;

    short field3 = Short.MAX_VALUE;

    @Test
    public void test() {
        String expected = "{ field1:'+'; field2:0x10; field3:" + Short.MAX_VALUE + "S}";
        Assert.assertEquals(expected, new Test45_SomeOtherPrimitiveFields().toString());
    }

    public String toString() {
        edu.uic.cs474.hw1.runtime.Runtime.registerPrimitiveField(" ", "field2", "byte", this.field2, false, false, "edu.uic.cs474.hw1.Test45_SomeOtherPrimitiveFields.");
        edu.uic.cs474.hw1.runtime.Runtime.registerPrimitiveField(" ", "field1", "char", this.field1, false, false, "edu.uic.cs474.hw1.Test45_SomeOtherPrimitiveFields.");
        edu.uic.cs474.hw1.runtime.Runtime.registerPrimitiveField(" ", "field3", "short", this.field3, false, false, "edu.uic.cs474.hw1.Test45_SomeOtherPrimitiveFields.");
        return edu.uic.cs474.hw1.runtime.Runtime.getToString();
    }
}