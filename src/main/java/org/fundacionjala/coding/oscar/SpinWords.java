package org.fundacionjala.coding.oscar;

/**
 * Created by Oz64 on 29/08/2017.
 */
public class SpinWords {

    private static final String DELIMITER = " ";

    private static final int WORD_SIZE = 5;

    /**
     * This method checks when the length is greater or equal to 5 in a word, that word is reversed.
     *
     * @param stringWords the string with the words
     * @return the string with the word reversed if is necessary.
     */
    public String spinWord(String stringWords) {
        String[] words = stringWords.split(DELIMITER);
        for (int index = 0; index < words.length; index++) {
            if (words[index].length() >= WORD_SIZE) {
                StringBuilder builder = new StringBuilder(words[index]);
                words[index] = builder.reverse().toString();
            }
        }
        return String.join(DELIMITER, words);
    }
}
