package org.fundacionjala.coding.oscar;

/**
 * Created by Oz64 on 15/09/2017.
 */
public class Persist {
    /**
     * This method return the number of times that multiply.
     *
     * @param number as integer.
     * @return the times that multiply as integer.
     */
    public int persistence(int number) {
        int total = 0;
        if (number < 10) {
            return 0;
        } else {
            String[] numbers = String.valueOf(number).split("");
            int resp = Integer.parseInt(numbers[0]);
            for (int index = 1; index < numbers.length; index++) {
                resp *= Integer.parseInt(numbers[index]);
                total = resp;
            }
            return persistence(total) + 1;
        }
    }
}
