package org.fundacionjala.coding.daniel;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Administrator on 11/09/17.
 */
public class Kata4Test {
    private Kata4 kata = new Kata4();

    /**
     * Test1.
     */
    @Test
    public void stringIsTheSameIfItsLettersHasMinorThan5Letters() {
        Assert.assertEquals("This is a test", kata.spinWords("This is a test"));
    }

    /**
     * Test2.
     */
    @Test
    public void stringIsTheSameIfItsLettersHasMoreThan5Letters() {
        Assert.assertEquals("Hey wollef sroirraw", kata.spinWords("Hey fellow warriors"));
    }

    /**
     * Test3.
     */
    @Test
    public void stringIsTheSameIfItsLettersHasMoreThan6Letters() {
        Assert.assertEquals("This is rehtona test", kata.spinWords("This is another test"));
    }
}
