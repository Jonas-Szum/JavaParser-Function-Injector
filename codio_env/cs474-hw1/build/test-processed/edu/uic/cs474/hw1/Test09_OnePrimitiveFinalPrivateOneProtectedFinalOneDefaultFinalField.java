package edu.uic.cs474.hw1;

import org.junit.Assert;
import org.junit.Test;
public class Test09_OnePrimitiveFinalPrivateOneProtectedFinalOneDefaultFinalField {

    final int field3 = 3;

    protected final int field2 = 2;

    private final int field1 = 1;

    @Test
    public void test() {
        String expected = "{#field2=2; field3=3;-field1=1}";
        Assert.assertEquals(expected, new Test09_OnePrimitiveFinalPrivateOneProtectedFinalOneDefaultFinalField().toString());
    }

    public String toString() {
        edu.uic.cs474.hw1.runtime.Runtime.registerPrimitiveField("-", "field1", "int", this.field1, true, false, "edu.uic.cs474.hw1.Test09_OnePrimitiveFinalPrivateOneProtectedFinalOneDefaultFinalField.");
        edu.uic.cs474.hw1.runtime.Runtime.registerPrimitiveField(" ", "field3", "int", this.field3, true, false, "edu.uic.cs474.hw1.Test09_OnePrimitiveFinalPrivateOneProtectedFinalOneDefaultFinalField.");
        edu.uic.cs474.hw1.runtime.Runtime.registerPrimitiveField("#", "field2", "int", this.field2, true, false, "edu.uic.cs474.hw1.Test09_OnePrimitiveFinalPrivateOneProtectedFinalOneDefaultFinalField.");
        return edu.uic.cs474.hw1.runtime.Runtime.getToString();
    }
}