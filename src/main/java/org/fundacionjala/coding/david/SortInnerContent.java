package org.fundacionjala.coding.david;

import java.util.Arrays;
import java.util.StringJoiner;

/**
 * This Class Word Reverse.
 */
public class SortInnerContent {

    public static final int NUMBER_ONE = 1;
    public static final int NUMBER_ZERO = 0;

    /**
     * This method word reverse only content of Word.
     *
     * @param words is value number.
     * @return a value word reverse.
     */
    public String sortInnerReverse(String words) {

        String delimiter = " ";
        String[] listWord = words.split(delimiter);
        StringJoiner listReverse = new StringJoiner(delimiter);
        for (String word : listWord) {
            listReverse.add((word.length() > NUMBER_ONE) ? getReverserWord(word) : word);
        }
        return listReverse.toString();
    }

    /**This Method  realize reverse word.
     * @param word is word.
     * @return word reverse.
     */
    public String getReverserWord(String word) {
        String[] listOrder = word.substring(NUMBER_ONE, word.length() - NUMBER_ONE).split("");
        Arrays.sort(listOrder);

        return String.format("%s%s%s", word.substring(NUMBER_ZERO, NUMBER_ONE), new StringBuilder(String.join("",
                listOrder)).reverse().toString(), word.substring(word.length() - NUMBER_ONE, word.length()));

    }
}

