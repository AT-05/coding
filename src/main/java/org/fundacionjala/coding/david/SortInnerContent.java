package org.fundacionjala.coding.david;

import java.util.Arrays;

/**
 * This Class Word Reverse.
 */
public class SortInnerContent {

    /**
     * This method word reverse only content of Word.
     * @param words is value number.
     * @return a value word reverse.
     */
    public String sortInnerReverse(String words) {

        String delimiter = " ";
        String[] listWord = words.split(delimiter);
        StringBuilder listReverseWord = new StringBuilder();
        String wordFirs, wordLast, wordContent;
        int posStart, posEnd;
        for (int c = 0; c < listWord.length; c++, listReverseWord.append(delimiter)) {

            if (listWord[c].length() > 1) {
                wordFirs = listWord[c].substring(0, 1);
                posEnd = listWord[c].length();
                posStart = posEnd - 1;
                wordLast = listWord[c].substring(posStart, posEnd);
                wordContent = listWord[c].substring(1, listWord[c].length() - 1);
                listReverseWord.append(wordFirs);
                String[] listOrder = wordContent.split("");
                Arrays.sort(listOrder);
                listReverseWord.append(new StringBuilder(String.join("", listOrder)).reverse().toString());
                listReverseWord.append(wordLast);
            } else {
                listReverseWord.append(listWord[c]);
            }
        }

        return listReverseWord.toString().trim();
    }
}

