package org.fundacionjala.coding.daniel;

import java.util.Arrays;
import java.util.Collections;
import java.util.stream.Collectors;

/**
 * class Kata 5.
 */
class Kata5 {

    /**
     * Constructor kata 5.
     */

    protected Kata5() {

    }

    /**
     * @param words a sentence or words.
     * @return A sorted inner content of every word
     * of the string in descending order.
     */
    public static String sortTheInnerContent(String words) {
        return Arrays.asList(words.split(" ")).stream()
                .map(word -> word.length() < 3 ? word : word.charAt(0)
                        + sortChars(word) + word.charAt(word.length() - 1))
                .collect(Collectors.joining(" "));
    }

    /**
     * @param word A string.
     * @return A string sorted.
     */
    public static String sortChars(String word) {
        String[] chars = word.substring(1, word.length() - 1).split("");
        Arrays.sort(chars, Collections.reverseOrder());
        return String.join("", chars);
    }

}
