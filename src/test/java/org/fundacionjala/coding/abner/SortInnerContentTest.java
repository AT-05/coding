package org.fundacionjala.coding.abner;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Administrator on 8/31/2017.
 */
public class SortInnerContentTest {

    /**
     * This test check Sort Inner Content.
     */
    @Test
    public void testSortInnerContent() {
        SortInnerContent sortInnerContent = new SortInnerContent();
        String stard = "sort the inner content in descending order";
        assertEquals("srot the inner ctonnet in dsnnieedcg oredr", sortInnerContent.sortInnerContent(stard));
        assertEquals("wiat for me", sortInnerContent.sortInnerContent("wait for me"));
        assertEquals("tihs ktaa is esay", sortInnerContent.sortInnerContent("this kata is easy"));
        assertEquals("I am", sortInnerContent.sortInnerContent("I am"));
    }
}
