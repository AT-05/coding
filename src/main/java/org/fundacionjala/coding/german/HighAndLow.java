package org.fundacionjala.coding.german;

import java.util.Collections;
import java.util.LinkedList;

/**
 *
 */

public class HighAndLow {

    /**
     *
     *  @param numbers String
     * @return String
     */

    public String highAndLow(String numbers) {
        String[] arrayNumbers = numbers.split(" ");
        LinkedList<Integer> objList = new LinkedList<>();
        for (String number : arrayNumbers) {
            objList.add(Integer.parseInt(number));
        }
        Collections.sort(objList);
        return String.format("%s %s", objList.getLast(), objList.getFirst());
    }

}
