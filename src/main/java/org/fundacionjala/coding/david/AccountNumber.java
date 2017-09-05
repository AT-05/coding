package org.fundacionjala.coding.david;

import java.util.ArrayList;
import java.util.List;

/**
 * The AccountNumber class is utilize for Bank.
 */

public class AccountNumber {

    private static final int NUMBER_SIZE = 3;
    private static final List<String> NUMBER_LIST = new ArrayList<>();
    private static final int NUMBER_ELEVEN = 11;

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
    public String compare(String numero) {
        StringBuilder variable = new StringBuilder();
        for (int i = 0; i < NUMBER_LIST.size(); i++) {
            if (NUMBER_LIST.get(i).equals(numero)) {
                return variable.append(i).toString();
            }
        }
        return "?";
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
        return sum % NUMBER_ELEVEN == 0;
    }

    /**
     * This method realize Scann number.
     *
     * @param number is one number.
     * @return one value.
     */
    public String scannNumber(String number) {
        return number.contains("?") ? number.concat(" ILL") : !checkNumber(number) ? number.concat(" ERR") : number;

    }

}
