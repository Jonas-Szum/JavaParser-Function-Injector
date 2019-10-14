package edu.uic.cs474.hw1;

import org.junit.Assert;
import org.junit.Test;
import java.util.Random;
public class Test46_OneFieldReferenceObjectWithWeirdIdentity {

    private Test46_OneFieldReferenceObjectWithWeirdIdentity other;

    @Test
    public void test() {
        other = this;
        String expected = "{-other:...}";
        Assert.assertEquals(expected, this.toString());
    }

    public boolean equals(Object o) {
        return false;
    }

    @Override
    public int hashCode() {
        return new Random().nextInt();
    }

    public String toString() {
        edu.uic.cs474.hw1.runtime.Runtime.registerField("-", "other", "Test46_OneFieldReferenceObjectWithWeirdIdentity", this.other, false, false, "edu.uic.cs474.hw1.Test46_OneFieldReferenceObjectWithWeirdIdentity.");
        return edu.uic.cs474.hw1.runtime.Runtime.getToString();
    }
}