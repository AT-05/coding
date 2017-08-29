package org.fundacionjala.coding.german;

/**
 *
 */
public class MultipleThreeAndFive {



    /**
     *
     * @param newNumero **this is id of table**
     * @return <code>int</code>
     */

    public int multipleThreeAndFive(int newNumero) {
        int result = 0;
        for (int i = 1; i < newNumero; i++) {
            result = (i % 3 == 0 || i % 5 == 0) ? result + i : result;
        }
        return result;
    }


 }
