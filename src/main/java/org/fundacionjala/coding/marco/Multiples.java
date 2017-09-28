package org.fundacionjala.coding.marco;

/**
 * Created by Administrator on 8/22/2017.
 */
public class Multiples {

    private static final int MULTIPLE_THREE = 3;

    private static final int MULTIPLE_FIVE = 5;

    /**
     * test.
     *
     * @param value test
     * @return test
     */
    public  int multipleThreeAndFive(int value) {
        int sum = 0;
        for (int i = 0; i < value; i++) {
            sum = (i % MULTIPLE_THREE == 0 || i % MULTIPLE_FIVE == 0) ? sum + i : sum;
        }
        return sum;
    }

}
