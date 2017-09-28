package org.fundacionjala.coding.abner;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * This class spn the word.
 */
public class SpinWord {

    private static final int MAX_CHARS = 4;

    /**
     * This function spin words.
     *
     * @param word string to spin.
     * @return string turned.
     */
    public String spinWords(String word) {
        String delimiter = " ";
        String[] arr = word.split(delimiter);
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].length() > MAX_CHARS) {
                List<String> wordAsList = Arrays.asList(arr[i].split(""));
                Collections.reverse(wordAsList);
                arr[i] = String.join("", wordAsList.toArray(new String[]{}));
            }
        }
        return String.join(delimiter, arr);
    }

}
