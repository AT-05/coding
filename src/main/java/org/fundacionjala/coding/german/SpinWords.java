package org.fundacionjala.coding.german;

import java.util.StringJoiner;

/**
 * Created by German on 8/29/2017.
 */
public class SpinWords {

    private static final String DELIMITER = " ";

    private static final int WORD_SIZE = 5;

    /**
     * @param words String
     * @return String
     */
    public String spinWords(String words) {
        String[] temp = words.split(DELIMITER);
        StringJoiner stringJoiner = new StringJoiner(DELIMITER);
        for (String s : temp) {
            stringJoiner.add(s.length() >= WORD_SIZE ? new StringBuilder(s).reverse().toString() : s);
        }
        return stringJoiner.toString();
    }

}
