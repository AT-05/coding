package org.fundacionjala.coding.Gary;

/**
 * Created by Gary on 29/8/2017.
 */
public class Spin {
    private static final String DELIMITER = " ";
    private String[] separateWords;

    /**
     * the method that converts.
     * @param chain to convert.
     * @return converted chain.
     */
    public String spinWords(String chain) {
        separateWords = new String[]{};
        separateWords = chain.split(DELIMITER);
        StringBuilder builder;
        for (int position = 0; position < separateWords.length; position++) {

            if (separateWords[position].length() >= 5) {
                builder = new StringBuilder(separateWords[position]);
                separateWords[position] = builder.reverse().toString();
            }
        }

        return String.join(DELIMITER, separateWords);
    }
}
