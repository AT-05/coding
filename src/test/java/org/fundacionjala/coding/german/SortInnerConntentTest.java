package org.fundacionjala.coding.german;

import org.junit.Before;
import org.junit.Test;


import static org.junit.Assert.assertEquals;

/**
 * Created by German on 8/29/2017.
 */
public class SortInnerConntentTest {
    private SortInnerContent sortInnerContent;

    /**
     * This method execute before any test.
     */
    @Before
    public void setUp() {
        sortInnerContent = new SortInnerContent();
    }

    /**
     * Verify  sortInnerConntent method.
     */
    @Test
    public void testSortInnerConntentMethod() {
        String result = sortInnerContent.sortInnerConntent("sort the inner content in descending order");
        assertEquals("srot the inner ctonnet in dsnnieedcg oredr", result);
    }

    /**
     * Verify  sortInnerConntent method.
     */
    @Test
    public void testSortInnerConntentMethodOneWordChange() {
        assertEquals("wiat for me", sortInnerContent.sortInnerConntent("wait for me"));
    }

    /**
     * Verify  sortInnerConntent method.
     */
    @Test
    public void testSortInnerConntentMethodAllWordsChange() {
        assertEquals("tihs ktaa is esay", sortInnerContent.sortInnerConntent("this kata is easy"));
    }

    /**
     * Verify  sortInnerConntent method.
     */
    @Test
    public void testSortInnerConntentMethodWordsNotChange() {
        assertEquals("I am", sortInnerContent.sortInnerConntent("I am"));
    }
}

