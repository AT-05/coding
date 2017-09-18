package org.fundacionjala.coding.abner;

import java.util.Arrays;
import java.util.stream.Stream;

/**
 * This class search.
 * Created by Abner on 17/08/2017.
 */
public class HighAndLow {
    // private int high, low;


    /**
     * This function search the high and low value.
     *
     * @param cad cad Chain entry de string.
     * @return values the high and low
     */

    public String highAndLowGet(String cad) {
        int[] arrayCad = Stream.of(cad.split(" ")).mapToInt(Integer::parseInt).toArray();
        Arrays.sort(arrayCad);
        return String.format("%d %d", arrayCad[arrayCad.length - 1], arrayCad[0]);
    }


}
