package org.fundacionjala.coding.abner;

import java.util.Arrays;

/**
 * Created by Administrator on 8/31/2017.
 */
public class SortInnerContent {

    /**
     * This function Sort Inner Content.
     *
     * @param cad this string not sort inner content.
     * @return this string is Sort Inner Content.
     */
    public String sortInnert(String cad) {
        String delimiter = " ";
        String[] vector = cad.split(delimiter);
        for (int i = 0; i < vector.length; i++) {
            if (vector[i].length() > 3) {
                StringBuilder result = new StringBuilder();
                result.append(vector[i].substring(0, 1));

                String[] betweenString = vector[i].substring(1, vector[i].length() - 1).split("");
                Arrays.sort(betweenString);

                result.append(new StringBuilder(String.join("", betweenString)).reverse());
                result.append(vector[i].substring(vector[i].length() - 1, vector[i].length()));
                vector[i] = result.toString();
            }
        }
        return String.join(" ", vector);

    }
}
