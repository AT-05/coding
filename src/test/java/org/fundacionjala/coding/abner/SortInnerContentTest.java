package org.fundacionjala.coding.abner;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

/**
 * Created by Administrator on 8/31/2017.
 */
public class SortInnerContentTest {


    private SortInnerContent sortInnerContent;

    /**
     * This test check Sort Inner Content.
     */
    @Test
    public void testSortInnerContent() {
        sortInnerContent = new SortInnerContent();
        String stard = "sort the inner content in descending order";
        assertEquals("srot the inner ctonnet in dsnnieedcg oredr", sortInnerContent.sortInnerContent(stard));
        assertEquals("wiat for me", sortInnerContent.sortInnerContent("wait for me"));
        assertEquals("tihs ktaa is esay", sortInnerContent.sortInnerContent("this kata is easy"));
        assertEquals("I am", sortInnerContent.sortInnerContent("I am"));

    }
}
