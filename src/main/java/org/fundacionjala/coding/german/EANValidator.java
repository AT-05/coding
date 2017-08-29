package org.fundacionjala.coding.german;

/**
 * Created by Administrator on 8/29/2017.
 */
public class EANValidator {
    /**
     * @param number String
     * @return boolean
     */
    public boolean validate(String number) {
        boolean res = false;
        int sumPar = sumPar(number);
        int sumImpar = sumImpar(number);
        int checkSum = sumImpar + sumPar;
        if ((checkSum) % 10 == 0) {
            if (number.charAt(12) == '0') {
                res = true;
            }

        } else {
            if ((10 - (checkSum % 10) == ((int) number.charAt(12) - 48))) {
                res = true;
            } else {
                res = false;
            }
        }
        return res;
    }

    /**
     * @param number String
     * @return int
     */
    private int sumImpar(String number) {
        int res = 0;
        for (int i = 0; i < number.length() - 1; i += 2) {
            res = res + ((int) number.charAt(i) - 48);
        }
        return res;
    }

    /**
     * @param number String
     * @return int
     */
    private int sumPar(String number) {
        int res = 0;
        for (int i = 1; i < number.length() - 1; i += 2) {
            res = res + ((int) number.charAt(i) - 48) * 3;
        }
        return res;
    }
}
