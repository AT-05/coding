package org.fundacionjala.coding.german;

import java.util.Arrays;


/**
 * Created by German on 8/29/2017.
 */
public class SortInnerContent {
    /**
     * @param words String
     * @return String  words in descending order and only inner
     */
    public String sortInnerConntent(String words) {
        String delimiter = " ";
        String[] temp = words.split(delimiter);
        StringBuilder temBuilder = new StringBuilder();
        for (String s : temp) {
            temBuilder.append(descendingOrderInner(s));
            temBuilder.append(" ");

        }
        temBuilder.deleteCharAt(temBuilder.length() - 1);
        return temBuilder.toString();
    }

    /**
     * @param word String
     * @return String  in descending order and only inner
     */
    private String descendingOrderInner(String word) {

        if (word.length() < 4) {
            return word;
        } else {
            String subString = word.substring(1, word.length() - 1);
            char[] temp = subString.toCharArray();
            Arrays.sort(temp);
            String temps = new String(temp);
            StringBuilder temBuilder = new StringBuilder(temps);
            temBuilder.reverse();
            temBuilder.insert(0, word.charAt(0));
            temBuilder.append(word.charAt(word.length() - 1));
            return temBuilder.toString();
        }

    }


}
