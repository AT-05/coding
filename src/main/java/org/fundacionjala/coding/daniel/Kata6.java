package org.fundacionjala.coding.daniel;

/**
 * Created by Administrator on 29/08/17.
 */
public class Kata6 {

    private static int factor = 3;

    /**
     * validates EAN Code of 13 digits.
     *
     * @param eanCode a number of 13 digits.
     * @return true if the checksum is valid.
     */
    public boolean validate(final String eanCode) {

        int checksum = eanCode
                .chars()
                .limit(eanCode.length() - 1)
                .map(i -> Character.getNumericValue((char) i))
                .reduce(0, (sum, i) -> {
                    factor = factor == 1 ? 3 : 1;
                    return sum + i * factor;
                });
        checksum = (checksum % 10 == 0 ? 0 : 10 - (checksum % 10));
        return checksum == Character.getNumericValue(eanCode.charAt(eanCode.length() - 1));
    }
}
