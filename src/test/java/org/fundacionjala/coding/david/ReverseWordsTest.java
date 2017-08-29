package org.fundacionjala.coding.david;


import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Administrator on 8/29/2017.
 */
public class ReverseWordsTest {
    @Test
    public void ReverseToStartInFivePosition()
    {
        ReverseWords reverseWordsTest = new ReverseWords();
        final String actualResul =reverseWordsTest.ReverseToStartInFivePosition("hola querida amiga que novedades");
        String expectedResult = "hola adireuq agima euq sedadevon";
        Assert.assertEquals(expectedResult,actualResul);
    }
}