package org.fundacionjala.coding.german;

/**
 * Created by German on 16/09/2017.
 */
public class Persist {
    /**
     * This method takes in a positive parameter num.
     * and returns its multiplicative persistence
     *
     * @param num positive
     * @return multiplicative persistence
     */
    public int persistence(int num) {
        return num >= 10 ? 1 + persistence(mulDig(num)) : 0;
    }

    /**
     * This method  multiply the digits in number.
     *
     * @param number int
     * @return int multiply the digits
     */
    private int mulDig(int number) {
        return number >= 10 ? (number % 10) * mulDig(number / 10) : number;

    }
}
