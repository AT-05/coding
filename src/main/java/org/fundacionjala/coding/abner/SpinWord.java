package org.fundacionjala.coding.abner;


import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * This class spn the word
 * Created by Abner on 8/30/2017.
 */
public class SpinWord {

    /**
     * This function spin words.
     * @param word string to spin.
     * @return string turned.
     */
    public String spinWords(String word) {

        String[] arr = word.split(" ");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].length() > 4) {
                String[] listString = arr[i].split("");
                List<String> list = Arrays.asList(listString);
                Collections.reverse(list);
                String[] arraa = list.toArray(new String[]{});
                arr[i] = String.join("", arraa);
            }
        }
        return String.join(" ", arr);
    }

}
