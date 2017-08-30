package org.fundacionjala.coding.marco;

import java.util.stream.Stream;

/**
 * This was made by Marco Mendez august 29, 2017.
 */
public class EANValidator {


    public static final int ZERO = 0;
    public static final int THREE = 3;
    public static final int TEN = 10;
    public static final int ONE = 1;
    public static final int TWO = 2;

    /**
     * This method return checkSum validated.
     *
     * @param valor string.
     * @return boolean.
     */
    public boolean validator(String valor) {
        int[] vector = Stream.of(valor.split("")).mapToInt(Integer::parseInt).toArray();
        int sum = ZERO;
        for (int i = ZERO; i < vector.length - ONE; i++) {
            sum += i + ONE % TWO == ZERO ? vector[i] * THREE : vector[i];
        }
        int checkSum = sum % TEN == ZERO ? ZERO : TEN - sum % TEN;
        return (checkSum == vector[vector.length - ONE]);
    }

}
