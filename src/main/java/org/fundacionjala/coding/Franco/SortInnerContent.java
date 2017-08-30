package org.fundacionjala.coding.Franco;

import java.util.Arrays;

/**
 * Created by Administrator on 8/30/2017.
 */
public class SortInnerContent {

    public static final int CONSTANT = 2;
    public static final int BEGIN_INDEX = 0;
    public static final int END_INDEX = 1;

    /**
     * This method validates of a word has more than two letters.
     *
     * @param word to validate.
     * @return true if the word length is greater than two.
     */
    public boolean validateWord(String word) {
        return word.length() > CONSTANT;
    }

    /**
     * This method sorts the inner content of a word in descending order.
     *
     * @param word which inner content will be sort.
     * @return the first letter, inner letters sorted in descending order
     * and the last letter of the word.
     */
    public String sortInnerContent(String word) {
        StringBuilder result = new StringBuilder();

        if (validateWord(word)) {
            StringBuilder innerLettersReversed = new StringBuilder();

            String innerLetters = word.substring(1, word.length() - 1);
            char[] lettersToSort = innerLetters.toCharArray();
            Arrays.sort(lettersToSort);

            for (int i = 0; i < lettersToSort.length; i++) {
                innerLettersReversed.append(lettersToSort[i]);
            }

            innerLettersReversed.reverse();

            result = result.append(word.substring(BEGIN_INDEX, END_INDEX))
                    .append(innerLettersReversed.toString())
                    .append(word.substring(word.length() - 1, word.length()));
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
        StringBuilder result = new StringBuilder();

        String[] words = sentence.split(" ");
        for (int i = 0; i < words.length; i++) {
            String wordWorked = sortInnerContent(words[i]);
            result = (i < words.length - 1) ? result.append(wordWorked).append(" ") : result.append(wordWorked);
        }
        return result.toString();
    }
}
