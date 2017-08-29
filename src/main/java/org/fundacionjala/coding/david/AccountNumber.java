package org.fundacionjala.coding.david;

import java.util.ArrayList;
import java.util.List;

/**
 * The AccounNumber class is utilice for Bank.
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
     * This method map to number
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
     * @param number
     * @return
     */
    public String scannNumber(String number) {
        String message = "";
        StringBuilder numberString = new StringBuilder();
        int status = 1;
            int posInitial = 0;
            int posEnd = 1;
            for (int i = 1; i <= 9; i++, posInitial++, posEnd++) {
                String numberAux = number.substring(posInitial, posEnd);
                if (numberAux.matches("[+-]?\\d*(\\.\\d+)?") && numberAux.equals("") == false) {
                    numberString.append(numberAux);
                } else {
                    status = 2;
                    numberString.append("?");
                }
            }

        message = (status == 1) ? (checkNumber(numberString.toString())? numberString.toString():numberString.toString().concat(" ERR")) : message;
        message = (status == 2) ? numberString.toString().concat(" ILL") : message;
      
        return message;
    }
}
