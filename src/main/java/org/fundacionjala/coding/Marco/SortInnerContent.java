package org.fundacionjala.coding.Marco;

import java.util.Arrays;
import java.util.StringJoiner;

/**
 * This kata was made by marco mendez august 29, 2017.
 */
public class SortInnerContent {

    private static final int ZERO = 0;
    private static final int ONE = 1;
    private static final String QUOTE_SPACE = " ";
    private static final String REGEX = "";

    /**
     * This method do the convect of a string.
     *
     * @param string test.
     * @return test.
     */
    public String sortInnerContent(String string) {
        String[] words = string.split(QUOTE_SPACE);
        StringJoiner result = new StringJoiner(QUOTE_SPACE);
        for (String value : words) {
            if (value.length() >= 3) {
                String[] aux = value.substring(1, value.length() - ONE).split(REGEX);
                Arrays.sort(aux);
                String word = value.substring(ZERO, ONE)
                        .concat(new StringBuilder(String.join(REGEX, aux)).reverse().toString())
                        .concat(value.substring(value.length() - ONE, value.length()));
                result.add(word);

            } else {
                result.add(value);
            }
        }
        return result.toString();
    }
}
