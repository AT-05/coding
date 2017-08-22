package org.fundacionjala.coding.franco;

/**
 * Created by Administrator on 8/21/2017.
 */
public class Multiples {
    /**
     * @param maxNumber is the highest number to compare with.
     * @return the total sum of the multiples of 3 and 5.
     */
    public int multiplesOf3And5(int maxNumber) {
        int i = 0, totalSum = 0;
        while (i < maxNumber) {
            totalSum = i % 3 == 0 || i % 5 == 0 ? totalSum + i : totalSum;
            i++;
        }
        return totalSum;
    }
}
