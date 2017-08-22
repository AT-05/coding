package org.fundacionjala.coding.david;

import java.util.Collections;
import java.util.LinkedList;

public class Solution {

    public String highAndLow(String numbers) {
        String[] arrayNumbers = numbers.split(" ");
        LinkedList<Integer> objList = new LinkedList<>();
        for (String number : arrayNumbers) {
            objList.add(Integer.parseInt(number));
        }
        Collections.sort(objList);
        return String.format("%s %s", objList.getLast(), objList.getFirst());
    }

    public static int multipleThreeAndFive(int newNumero) {
        int result = 0;
        for (int i = 1; i < newNumero; i++) {
            result = (i % 3 == 0 || i % 5 == 0) ? result + i : result;
        }
        return result;
    }

}
