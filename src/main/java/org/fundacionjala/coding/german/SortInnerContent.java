package org.fundacionjala.coding.german;

import java.util.Arrays;
import java.util.StringJoiner;

/**
 * Created by German on 8/29/2017.
 */
public class SortInnerContent {

    private static final String DELIMITER = " ";

    private static final int WORD_SIZE = 3;

    /**
     * @param words String
     * @return String  words in descending order and only inner
     */
    public String sortInnerConntent(String words) {
        String[] temp = words.split(DELIMITER);
        StringJoiner stringJoiner = new StringJoiner(DELIMITER);
        for (String s : temp) {
            stringJoiner.add(descendingOrderInner(s));
        }
        return stringJoiner.toString();
    }

    /**
     * @param word String
     * @return String  in descending order and only inner
     */
    private String descendingOrderInner(String word) {

        if (word.length() >= WORD_SIZE) {
            char[] innerContent = word.substring(1, word.length() - 1).toCharArray();
            Arrays.sort(innerContent);
            StringBuilder temBuilder = new StringBuilder(new String(innerContent));
            temBuilder.reverse();
            temBuilder.insert(0, word.charAt(0));
            temBuilder.append(word.charAt(word.length() - 1));
            return temBuilder.toString();
        }
        return word;

    }

}
