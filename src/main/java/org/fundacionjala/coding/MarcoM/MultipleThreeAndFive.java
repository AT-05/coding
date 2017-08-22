package org.fundacionjala.coding.MarcoM;

/**
 * Created by Administrator on 8/22/2017.
 */
public class MultipleThreeAndFive {

    /**
     * test.
     *
     * @param value test
     * @return test
     */
    public  int multipleThreeAndFive(int value) {
        int sum = 0;
        for (int i = 0; i < value; i++) {
            sum = (i % 3 == 0 || i % 5 == 0) ? sum + i : sum;
        }
        return sum;
    }

}
