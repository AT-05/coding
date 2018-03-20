package org.fundacionjala.coding.german;

/**
 *
 */
public class Multiples {

    private static final int MULTIPLE_THREE = 3;

    private static final int MULTIPLE_FIVE = 5;

    /**
     * @param number **this is id of table**
     * @return <code>int</code>
     */
    public int multipleThreeAndFive(int number) {
        int result = 0;
        for (int i = 1; i < number; i++) {
            result = i % MULTIPLE_THREE == 0 || i % MULTIPLE_FIVE == 0 ? result + i : result;
        }
        return result;
    }

 }
