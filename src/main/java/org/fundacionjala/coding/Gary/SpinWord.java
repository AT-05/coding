package org.fundacionjala.coding.Gary;

/**
 * Created by Gary on 29/8/2017.
 */
public class SpinWord {

    private static final String DELIMITER = " ";

    /**
     * the method that converts.
     * @param chain to convert.
     * @return converted chain.
     */
    public String spinWords(String chain) {
        String[] separateWords = chain.split(DELIMITER);
        for (int position = 0; position < separateWords.length; position++) {
            if (separateWords[position].length() >= 5) {
                separateWords[position] = new StringBuilder(separateWords[position])
                        .reverse()
                        .toString();
            }
        }

        return String.join(DELIMITER, separateWords);
    }
}
