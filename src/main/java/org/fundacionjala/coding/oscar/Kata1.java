package org.fundacionjala.kata;

import java.util.Arrays;

/**
 * Created by Oz64 on 17/08/2017.
 */
public class Kata1 {

    static public String HighAndLow(String stringNumbers) {
        String[] stringNumsArray = stringNumbers.split(" ");
        Arrays.sort(stringNumsArray);

        String result  = stringNumsArray[stringNumsArray.length - 1] + " " + stringNumsArray[0];

        return result;
    }
}
