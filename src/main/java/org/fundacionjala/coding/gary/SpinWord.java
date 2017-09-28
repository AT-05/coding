package org.fundacionjala.coding.gary;

/**
 * Created by Gary on 29/8/2017.
 */
public class SpinWord {

    private static final String DELIMITER = " ";

    private static final int WORD_SIZE = 5;

    /**
     * the method that converts.
     * @param chain to convert.
     * @return converted chain.
     */
    public String spinWords(String chain) {
        String[] separateWords = chain.split(DELIMITER);
        for (int position = 0; position < separateWords.length; position++) {
            if (separateWords[position].length() >= WORD_SIZE) {
                separateWords[position] = new StringBuilder(separateWords[position])
                        .reverse()
                        .toString();
            }
        }

        return String.join(DELIMITER, separateWords);
    }
}
