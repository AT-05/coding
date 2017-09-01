package org.fundacionjala.coding.Marco;

import java.util.Arrays;

/**
 * This kata was made by marco mendez august 29, 2017.
 */
public class SortInnerContent {

    public static final int ZERO = 0;
    public static final int ONE = 1;
    public static final String QUOTE_SPACE = " ";
    public static final String REGEX = "";

    /**
     * This method do the convect of a string.
     *
     * @param string test.
     * @return test.
     */
    public String sortInnerContent(String string) {
        String[] world = string.split(QUOTE_SPACE);
        StringBuilder result = new StringBuilder();
        for (String value : world) {
            if (value.length() == ONE) {
                result.append(value);
                result.append(" ");
            } else {
                result.append(value.substring(ZERO, ONE));
                String[] aux = value.substring(1, value.length() - ONE).split(REGEX);
                Arrays.sort(aux);
                result.append((new StringBuffer(string.join(REGEX, aux)).reverse().toString()));
                result.append(value.substring(value.length() - ONE, value.length()));
                result.append(QUOTE_SPACE);
            }

        }
        return result.toString().trim();
    }
}
