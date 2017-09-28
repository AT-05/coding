package org.fundacionjala.coding.german;

/**
 * Created by German on 16/09/2017.
 */
public class Persist {

    private static final int NUMBER_TEN = 10;

    /**
     * This method takes in a positive parameter num.
     * and returns its multiplicative persistence
     *
     * @param num positive
     * @return multiplicative persistence
     */
    public int persistence(int num) {
        return num >= NUMBER_TEN ? 1 + persistence(mulDig(num)) : 0;
    }

    /**
     * This method  multiply the digits in number.
     *
     * @param number int
     * @return int multiply the digits
     */
    private int mulDig(int number) {
        return number >= NUMBER_TEN ? (number % NUMBER_TEN) * mulDig(number / NUMBER_TEN) : number;
    }
}
