package org.fundacionjala.coding.abner;

/**
 * Created by Abner on 17/08/2017.
 */
public class HighAndLow {
    private int high, low;


    /**
     * This function search the high and low value.
     *
     * @param cad cad Chain entry de string.
     * @return values the high and low
     */
    public String highAndLowGet(String cad) {
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
        return String.format("%d %d", high, low);
    }

}
