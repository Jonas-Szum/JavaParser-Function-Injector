package edu.uic.cs474.hw1;

import org.junit.Assert;
import org.junit.Test;

public class Test45_SomeOtherPrimitiveFields {
    char field1 = '+';
    byte field2 = 0x10;
    short field3 = Short.MAX_VALUE;

    @Test
    public void test() {
        String expected = "{ field1:'+'; field2:0x10; field3:"+Short.MAX_VALUE+"S}";
        Assert.assertEquals(expected, new Test45_SomeOtherPrimitiveFields().toString());
    }
}
