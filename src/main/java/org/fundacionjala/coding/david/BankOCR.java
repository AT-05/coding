package org.fundacionjala.coding.david;

import java.util.ArrayList;
import java.util.List;

/**
 * The BankOCR class is utilize for Bank.
 */
public class BankOCR {

    private static final int NUMBER_SIZE = 3;

    private static final int ENTRY_SIZE = 9;

    private static final int NUMBER_ELEVEN = 11;

    private static final String QUESTION_MARK = "?";

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
     * @param number string.
     * @return one number comparative.
     */
    public String compare(String number) {
        StringBuilder variable = new StringBuilder();
        for (int i = 0; i < NUMBER_LIST.size(); i++) {
            if (NUMBER_LIST.get(i).equals(number)) {
                return variable.append(i).toString();
            }
        }
        return QUESTION_MARK;
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
        for (int i = ENTRY_SIZE; i > 0; i--, numberPosition++) {
            sum += Integer.parseInt(number.substring(i - 1, i)) * numberPosition;
        }
        return sum % NUMBER_ELEVEN == 0;
    }

    /**
     * This method realize Scan number.
     *
     * @param number is one number.
     * @return one value.
     */
    public String scanNumber(String number) {
        return number.contains("?") ? number.concat(" ILL")
                : !checkNumber(number) ? number.concat(" ERR") : number;
    }

}
