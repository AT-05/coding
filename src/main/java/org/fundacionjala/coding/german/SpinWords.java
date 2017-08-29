package org.fundacionjala.coding.german;

/**
 * Created by Administrator on 8/29/2017.
 */
public class SpinWords {
    /**
     * @param words String
     * @return String
     */
    public String spinWords(String words) {
        String delimiter = " ";
        String[] temp = words.split(delimiter);
        StringBuilder temBuilder = new StringBuilder();
        for (String s : temp) {
            if (s.length() >= 5) {
                temBuilder.append(new StringBuilder(s).reverse().toString());

            } else {
                temBuilder.append(s);
            }
            temBuilder.append(" ");

        }
        temBuilder.deleteCharAt(temBuilder.length() - 1);
        return temBuilder.toString();
    }

}
