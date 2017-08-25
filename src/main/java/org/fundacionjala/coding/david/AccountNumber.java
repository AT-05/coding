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
     * Test.
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
     * this methos realize compare with number one.
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
}
