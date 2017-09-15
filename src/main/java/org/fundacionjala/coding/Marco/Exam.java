package org.fundacionjala.coding.Marco;

/**
 * This is my finish exam, this was made by marco mendez september 15, 2017
 */
public class Kata_Exam {
    /**
     * This method calculate digital root.
     *
     * @param value test.
     * @return test.
     */
    public int Root(int value) {
        while (value >= 10) {

            String[] vectorNumber = String.valueOf(value).split("");
            value = 0;
            for (String aVectorNumber : vectorNumber) {
                value += Integer.parseInt(aVectorNumber);
            }

        }
        return value;
    }

}
