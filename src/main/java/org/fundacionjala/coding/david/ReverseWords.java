package org.fundacionjala.coding.david;

import java.util.StringJoiner;

/**
 * * The class scanner word and reversed.
 */
public class ReverseWords {

    private static final int NUMBER_FOUR = 4;

    /**
     * This method realize reverse of words.
     *
     * @param words String.
     * @return One word reverse.
     */
    public String reverseToStartInFivePosition(String words) {

        String delimiter = " ";
        String[] listWord = words.split(delimiter);
        StringJoiner listReverseWord = new StringJoiner(delimiter);
        for (String itemWord : listWord) {
            listReverseWord.add(itemWord.length() > NUMBER_FOUR ? new StringBuilder(itemWord).reverse()
                    : itemWord);
        }

        return listReverseWord.toString();
    }
}
