package org.fundacionjala.coding.MarcoM;

import java.util.Arrays;

/**
 * Created by Administrator on 8/22/2017.
 */
public class HighAndLow {

    /**
     * test.
     * @param numbers test
     * @return test
     */
    public  String highAndLow(String numbers) {
        String[] arrayNumbers = numbers.split(" ");
        Arrays.sort(arrayNumbers);
        return String.format("%s %s", arrayNumbers[arrayNumbers.length - 1], arrayNumbers[0]);
    }



}
