package org.fundacionjala.coding.abner;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

/**
 * Created by Administrator on 8/31/2017.
 */
public class SortInnerContentTest {


    private SortInnerContent spinWord;

    /**
     * This test check Sort Inner Content.
     */
    @Test
    public void sortInnert() {
        spinWord = new SortInnerContent();
        String stard = "sort the inner content in descending order";
        assertEquals("srot the inner ctonnet in dsnnieedcg oredr", spinWord.sortInnert(stard));
        assertEquals("wiat for me", spinWord.sortInnert("wait for me"));
        assertEquals("tihs ktaa is esay", spinWord.sortInnert("this kata is easy"));
        assertEquals("I am", spinWord.sortInnert("I am"));

    }
}
