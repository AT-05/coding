package org.fundacionjala.coding.abner;

/**
 * Created by Samuel on 17/08/2017.
 */
public class HighAndLow {
    private int high, low;

    /**
     *
     */


    /**
     *
     * @param cad Chain entry de string.
     */
    public HighAndLow(String cad) {
        String[] arr = cad.split(" ");

        if (arr.length > 0) {
            high = Integer.parseInt(arr[0]);
            low = Integer.parseInt(arr[0]);
        }
        for (int i = 1; i < arr.length; i++) {
            if (Integer.parseInt(arr[i]) > high) {
                high = Integer.parseInt(arr[i]);
            }

            if (Integer.parseInt(arr[i]) < low) {
                low = Integer.parseInt(arr[i]);
            }
        }

    }

    /**
     *
     * @return value high.
     */
    public int getHigh() {
        return high;
    }

    /**
     *
     * @return value low.
     */
    public int getLow() {
        return low;
    }
}
