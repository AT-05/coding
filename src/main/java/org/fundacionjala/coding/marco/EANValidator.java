package org.fundacionjala.coding.marco;
import java.util.stream.Stream;

/**
 * This was made by Marco Mendez august 29, 2017.
 */
public class EANValidator {


    public static final int ZERO = 0;
    public static final int ONO = 1;
    public static final int THREE = 3;
    public static final int TEN = 10;

    /**
     * This method return checkSum validated.
     *
     * @param valor string.
     * @return boolean.
     */
    public boolean validator(String valor) {
        int[] vector = Stream.of(valor.split("")).mapToInt(Integer::parseInt).toArray();
        int sum = ZERO;
        for (int i = ZERO; i < vector.length - ONO; i++) {
            sum += (i + 1) % 2 == 0 ? vector[i] * THREE : vector[i];
        }
        int checkSum = (sum % TEN) == ZERO ? ZERO : (TEN - (sum % TEN));
        return (checkSum == vector[vector.length - ONO]);
    }

}
