package org.fundacionjala.coding.david;

import java.util.ArrayList;
import java.util.List;

/**
 * The AccountNumber class is utilize for Bank.
 */

public class AccountNumber {

    private static final int NUMBER_SIZE = 3;
    private static final List<String> NUMBER_LIST = new ArrayList<>();

    static {

        NUMBER_LIST.add(" _ ".concat("| |").concat("|_|"));
        NUMBER_LIST.add("   ".concat("  |").concat("  |"));
        NUMBER_LIST.add(" _ ".concat(" _|").concat("|_ "));
        NUMBER_LIST.add(" _ ".concat(" _|").concat(" _|"));
        NUMBER_LIST.add("   ".concat("|_|").concat("  |"));
        NUMBER_LIST.add(" _ ".concat("|_ ").concat(" _|"));
        NUMBER_LIST.add(" _ ".concat("|_ ").concat("|_|"));
        NUMBER_LIST.add(" _ ".concat("  |").concat("  |"));
        NUMBER_LIST.add(" _ ".concat("|_|").concat("|_|"));
        NUMBER_LIST.add(" _ ".concat("|_|").concat(" _|"));


    }

    /**
     * This method map to number.
     *
     * @param listNumber test.
     * @return test.
     */
    public String mapToNumber(List<String> listNumber) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < listNumber.get(0).length(); i += NUMBER_SIZE) {
            String number = listNumber.get(0).substring(i, i + NUMBER_SIZE)
                    .concat(listNumber.get(1).substring(i, i + NUMBER_SIZE)
                            .concat(listNumber.get(2).substring(i, i + NUMBER_SIZE)));
            result.append(compare(number));
        }
        return result.toString();
    }

    /**
     * this method realize compare with number one.
     *
     * @param numero string.
     * @return one number comparative.
     */
    public int compare(String numero) {
        for (int i = 0; i < NUMBER_LIST.size(); i++) {
            if (NUMBER_LIST.get(i).equals(numero)) {
                return i;
            }
        }
        return -1;
    }

    /**
     * This method realize check number.
     *
     * @param number string.
     * @return true or false.
     */
    public boolean checkNumber(String number) {
        int numberPosition = 1;
        int sum = 0;
        int posInitial = 8;
        int posEnd = 9;
        for (int i = 9; i > 0; i--, posInitial--, posEnd--, numberPosition++) {
            int numberAux = Integer.parseInt(number.substring(posInitial, posEnd));
            sum = sum + (numberAux * numberPosition);
        }
        return sum % 11 == 0;
    }

    /**
     * This method realize Scann number.
     *
     * @param number is one number.
     * @return one value.
     */
    public String scannNumber(String number) {

        String[] listNumber = number.split("");
        StringBuilder numberError = new StringBuilder();
        StringBuilder numberString = new StringBuilder();
        int status = 1;
        for (int i = 0; i < listNumber.length; i++) {

            if (listNumber[i].toString().equals("-")) {
                i++;
                status = 2;
                numberString.append("?");
            } else {
                numberString.append(listNumber[i].toString());
            }
            numberError.append(listNumber[i]);
        }

        boolean checkNumber = checkNumber(numberError.toString());

        if (status == 1 && checkNumber) {
            return numberString.toString();
        } else if (status == 2) {
            return numberString.toString().concat(" ILL");
        }
        return numberString.toString().concat(" ERR");
    }

}
