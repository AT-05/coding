package org.fundacionjala.coding.david;
import java.util.Collections;
import java.util.LinkedList;

/**
 * This class calculate number High and Low.
 */
public class HighAndLow {

    /**
     * This Method return two values Hish and low.
     * @param numbers are values string.
     * @return value string.
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
