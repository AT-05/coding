package org.fundacionjala.coding.daniel;

import java.util.Arrays;
import java.util.Collections;
import java.util.stream.Collectors;

/**
 * class Kata 5.
 */
class Kata5 {

    /**
     * @param words a sentence or words.
     * @return A sorted inner content of every word
     * of the string in descending order.
     */
    public String sortTheInnerContent(String words) {
        return Arrays.asList(words.split(" ")).stream()
                .map(word -> word.length() < 3 ? word : new StringBuilder()
                        .append(word.charAt(0)).append(sortChars(word))
                        .append(word.charAt(word.length() - 1)).toString())
                .collect(Collectors.joining(" "));
    }

    /**
     * @param word A string.
     * @return A string sorted.
     */
    public String sortChars(String word) {
        String[] chars = word.substring(1, word.length() - 1).split("");
        Arrays.sort(chars, Collections.reverseOrder());
        return String.join("", chars);
    }

}
