package org.fundacionjala.coding.franco;

/**
 * This class calculate number multiple of three and five.
 */
public class Multiples {

    private static final int MULTIPLE_THREE = 3;

    private static final int MULTIPLE_FIVE = 5;

    /**
     * @param maxNumber is the highest number to compare with.
     * @return the total sum of the multiples of 3 and 5.
     */
    public int multiplesOf3And5(int maxNumber) {
        int i = 0;
        int totalSum = 0;
        while (i < maxNumber) {
            totalSum = i % MULTIPLE_THREE == 0 || i % MULTIPLE_FIVE == 0 ? totalSum + i : totalSum;
            i++;
        }
        return totalSum;
    }
}
