package org.fundacionjala.coding.Franco;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 8/29/2017.
 */
public class SpinWords {
    String[] words;

    public String[] spinWord(String stringOfWords) {
        words = stringOfWords.split(" ");
        for (int i = 0; i < words.length; i++) {
            if (words[i].length() > 5) {
                StringBuilder reverseWord = new StringBuilder(words[i]);
                reverseWord.reverse();
                words[i] = reverseWord.toString();
            }
        }
        return words;
    }

    public String fillString(String[] arrayofWords) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < arrayofWords.length; i++) {
            if (i < arrayofWords.length - 1) {
                result = result.append(arrayofWords[i]).append(" ");
            } else {
                result = result.append(arrayofWords[i]);
            }
        }
        return result.toString();
    }
}
