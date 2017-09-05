package org.fundacionjala.coding.franco;

import java.util.Arrays;
import java.util.StringJoiner;

/**
 * Created by Administrator on 8/30/2017.
 */
public class SortInnerContent {

    public static final int CONS_ZERO = 0;
    public static final int CONS_ONE = 1;
    public static final int CONS_TWO = 2;

    /**
     * This method sorts the inner content of a word
     * or set of words in descending order.
     *
     * @param word which inner content will be sort.
     * @return the first letter, inner letters sorted in descending order
     * and the last letter of the word.
     */
    public String sortInnerContent(String word) {
        StringBuilder result = new StringBuilder();

        if (word.length() > CONS_TWO) {
            StringBuilder innerLettersReversed = new StringBuilder();

            final String innerLetters = word.substring(CONS_ONE, word.length() - CONS_ONE);
            final char[] lettersToSort = innerLetters.toCharArray();

            Arrays.sort(lettersToSort);
            innerLettersReversed.append(new String(lettersToSort));
            innerLettersReversed.reverse();

            result = result.append(word.substring(CONS_ZERO, CONS_ONE))
                    .append(innerLettersReversed.toString())
                    .append(word.substring(word.length() - CONS_ONE, word.length()));
        } else {
            result = result.append(word);
        }
        return result.toString();
    }

    /**
     * This method takes a sentence and works each word with sortInnerContent method.
     *
     * @param sentence to work with.
     * @return the sentence with its words inner content sorted in descending order.
     */
    public String sortWordsInnerContent(String sentence) {
        final StringJoiner result = new StringJoiner(" ");

        final String[] words = sentence.split(" ");
        for (int i = CONS_ZERO; i < words.length; i++) {
            result.add(sortInnerContent(words[i]));
        }
        return result.toString();
    }
}
