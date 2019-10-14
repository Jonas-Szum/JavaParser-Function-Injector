package edu.uic.cs474.hw1;

import org.junit.Assert;
import org.junit.Test;

public class Test48_OtherArraysOfPrimitives {
    char[] field1 = {'+','-','\n'};
    byte[] field2 = {0x0, 0x7F};
    short[] field3 = {0,1};

    @Test
    public void test() {
        String expected = "{ field1:[0:'+',1:'-',2:'\\n']; field2:[0:0x00,1:0x7F]; field3:[0:0S,1:1S]}";
        Assert.assertEquals(expected, new Test48_OtherArraysOfPrimitives().toString());
    }
}
