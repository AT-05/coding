package org.fundacionjala.coding.david;

import java.util.stream.Stream;

/**
 * Created by Administrator on 9/15/2017.
 */
public class Examen_final {


    public int sunOfDigits(String number) {
        int[] listNumber = Stream.of(number.split("")).mapToInt(Integer::parseInt).toArray();
        int sumResult = 0;

        while (listNumber.length > 1) {
            sumResult = 0;
            for (int item : listNumber) {
                sumResult += item;
            }
            String newNumber = String.valueOf(sumResult);
            listNumber = Stream.of(newNumber.split("")).mapToInt(Integer::parseInt).toArray();
        }
        return sumResult;
    }
}
