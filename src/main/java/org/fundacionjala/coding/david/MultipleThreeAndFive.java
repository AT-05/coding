package org.fundacionjala.coding.david;

/**
 *
 */
public class MultipleThreeAndFive {

    /**
     *Test.
     * @param newNumero test.
     * @return test.
     */
    public int multipleThreeAndFive(int newNumero) {
        int result = 0;
        for (int i = 1; i < newNumero; i++) {
            result = (i % 3 == 0 || i % 5 == 0) ? result + i : result;
        }
        return result;
    }

}
