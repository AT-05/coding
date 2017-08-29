package org.fundacionjala.coding.Franco;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Administrator on 8/29/2017.
 */
public class SortInnerContentTest {
    @Test
    public void testSortWordInnerContent(){
        SortInnerContent sortInnerContent1 = new SortInnerContent();

        final String expectedResult = "srot";
        final String actualResult = sortInnerContent1.sortWordInnerContent("sort");

        assertEquals(expectedResult, actualResult);
    }
}