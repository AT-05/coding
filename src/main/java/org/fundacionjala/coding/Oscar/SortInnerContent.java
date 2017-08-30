package org.fundacionjala.coding.Oscar;

import java.util.Arrays;

/**
 * Created by Oz64 on 30/08/2017.
 */

public class SortInnerContent {
    /**
     * This method order the inner content of the words of the string descendent.
     *
     * @param content is the string with several words.
     * @return change the content of the string words.
     */
    public String sortInnerContent(String content) {
        String[] arrayString = content.split(" ");
        for (int index = 0; index < arrayString.length; index++) {
            arrayString[index] = sort(arrayString[index]);
        }
        return String.join(" ", arrayString);
    }

    /**
     * This method change the content of one word.
     *
     * @param word is the word for change the content.
     * @return the word with sort descendent.
     */
    public String sort(String word) {
        char[] letters = word.toCharArray();
        if (letters.length > 3) {
            Arrays.sort(letters, 1, letters.length - 1);
            for (int index = 1; index <= (letters.length / 2) - 1; index++) {
                char aux = letters[index];
                letters[index] = letters[letters.length - index - 1];
                letters[letters.length - index - 1] = aux;
            }
        }
        return String.valueOf(letters);
    }
}
