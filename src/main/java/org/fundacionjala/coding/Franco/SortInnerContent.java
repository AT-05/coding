package org.fundacionjala.coding.Franco;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * Created by Administrator on 8/29/2017.
 */
public class SortInnerContent {
    public String sortWordInnerContent(String word){
        StringBuilder result = new StringBuilder();
        char[] innerLetters = word.substring(1, word.length() - 1).toCharArray();
        Arrays.sort(innerLetters);
        StringBuilder innerLettersReversed = new StringBuilder(innerLetters.toString());
        innerLettersReversed.reverse();
        result = result.append(word.substring(0))
                .append(innerLetters.toString())
                .append(word.substring(word.length() - 1));
        return result.toString();
    }
}
