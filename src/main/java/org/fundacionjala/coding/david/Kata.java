package org.fundacionjala.coding.david;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * This class realize change number.
 */
public class Kata {

    /**
     * This method realize change sortTwisted37.
     *
     * @param listNumber is arrays.
     * @return a arrays.
     */
    public Integer[] sortTwisted37(Integer[] listNumber) {

        List<Integer> newList = Arrays.asList(listNumber);
        newList = changeNumber(newList);
        Collections.sort(newList);
        newList = changeNumber(newList);

        return newList.toArray(new Integer[newList.size()]);
    }

    /**
     * This method change replace number 3 and 7.
     *
     * @param newList is arrays of integer.
     * @return a new arrays.
     */
    public List<Integer> changeNumber(List<Integer> newList) {
        for (int c = 0; c < newList.size(); c++) {
            int change1 = Integer.parseInt(String.valueOf(newList.get(c)).replace("3", "X").
                    replace("7", "3").replace("X", "7"));
            newList.set(c, change1);
        }
        return newList;
    }
}
