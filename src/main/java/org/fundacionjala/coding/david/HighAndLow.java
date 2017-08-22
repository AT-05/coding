package org.fundacionjala.coding.david;

import java.util.Collections;
import java.util.LinkedList;

/**
 *
 */
public class HighAndLow {

    /**
     * Test.
     * @param numbers test.
     * @return test.
     */
    public String highAndLow(String numbers) {
        String[] arrayNumbers = numbers.split(" ");
        LinkedList<Integer> objList = new LinkedList<>();
        LinkedList<Integer> objList2 =  new LinkedList<>();

        for (String number : arrayNumbers) {
            objList.add(Integer.parseInt(number));
        }
        Collections.sort(objList);
        return String.format("%s %s", objList.getLast(), objList.getFirst());
    }

}
