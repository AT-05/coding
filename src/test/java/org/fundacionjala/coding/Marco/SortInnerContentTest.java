package org.fundacionjala.coding.Marco;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * This kata was made by marco mendez august 29, 2017.
 */
public class SortInnerContentTest {
    /**
     * Test example 1.
     */
    @Test
    public void testSortInnerContent1() {
        SortInnerContent sort = new SortInnerContent();
        String expectResult = "srot the inner ctonnet in dsnnieedcg oredr";
        String actualResult = "sort the inner content in descending order";
        assertEquals(expectResult, sort.sortInnerContent(actualResult));

    }

    /**
     * Test example 2.
     */
    @Test
    public void testSortInnerContent2() {
        SortInnerContent sort = new SortInnerContent();
        String expectResult = "wiat for me";
        String actualResult = "wait for me";
        assertEquals(expectResult, sort.sortInnerContent(actualResult));

    }

    /**
     * Test example 3.
     */
    @Test
    public void testSortInnerContent3() {
        SortInnerContent sort = new SortInnerContent();
        String expectResult = "tihs ktaa is esay";
        String actualResult = "this kata is easy";
        assertEquals(expectResult, sort.sortInnerContent(actualResult));

    }

    /**
     * Test example 4.
     */
    @Test
    public void testSortInnerContent4() {
        SortInnerContent sort = new SortInnerContent();
        String expectResult = "I am";
        String actualResult = "I am";
        assertEquals(expectResult, sort.sortInnerContent(actualResult));

    }
}
