package org.fundacionjala.coding.german;

import org.junit.Test;


import static org.junit.Assert.assertEquals;

/**
 * Created by German on 8/29/2017.
 */
public class SortInnerConntentTest {
    /**
     * Verify  sortInnerConntent method.
     */
    @Test
    public void testSortInnerConntentMethod() {
        SortInnerContent sortInnerContent = new SortInnerContent();
        String result = sortInnerContent.sortInnerConntent("sort the inner content in descending order");
        assertEquals("srot the inner ctonnet in dsnnieedcg oredr", result);
    }

    /**
     * Verify  sortInnerConntent method.
     */
    @Test
    public void testSortInnerConntentMethodOneWordChange() {
        SortInnerContent sortInnerContent = new SortInnerContent();
        assertEquals("wiat for me", sortInnerContent.sortInnerConntent("wait for me"));
    }

    /**
     * Verify  sortInnerConntent method.
     */
    @Test
    public void testSortInnerConntentMethodAllWordsChange() {
        SortInnerContent sortInnerContent = new SortInnerContent();
        assertEquals("tihs ktaa is esay", sortInnerContent.sortInnerConntent("this kata is easy"));
    }

    /**
     * Verify  sortInnerConntent method.
     */
    @Test
    public void testSortInnerConntentMethodWordsNotChange() {
        SortInnerContent sortInnerContent = new SortInnerContent();
        assertEquals("I am", sortInnerContent.sortInnerConntent("I am"));
    }
}

