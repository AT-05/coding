package org.fundacionjala.coding.marco;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * This kata was made by marco mendez august 29, 2017.
 */
public class SortInnerContentTest {

    private SortInnerContent sort;

    /**
     * This method start the variable.
     */
    @Before
    public void ini() {
        sort = new SortInnerContent();
    }

    /**
     * Test example 1.
     */
    @Test
    public void testSortInnerContent1() {
        String expectResult = "srot the inner ctonnet in dsnnieedcg oredr";
        String actualResult = "sort the inner content in descending order";
        assertEquals(expectResult, sort.sortInnerContent(actualResult));

    }

    /**
     * Test example 2.
     */
    @Test
    public void testSortInnerContent2() {
        String expectResult = "wiat for me";
        String actualResult = "wait for me";
        assertEquals(expectResult, sort.sortInnerContent(actualResult));

    }

    /**
     * Test example 3.
     */
    @Test
    public void testSortInnerContent3() {
        String expectResult = "tihs ktaa is esay";
        String actualResult = "this kata is easy";
        assertEquals(expectResult, sort.sortInnerContent(actualResult));

    }

    /**
     * Test example 4.
     */
    @Test
    public void testSortInnerContent4() {
        String expectResult = "I am";
        String actualResult = "I am";
        assertEquals(expectResult, sort.sortInnerContent(actualResult));

    }
}
