package org.fundacionjala.coding.oscar;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Oz64 on 25/08/2017.
 */
public class KataOCR {
    private static final int NUMBER_SIZE = 3;
    private static final Map<String, Integer> NUMBER_MAP;

    static {
        NUMBER_MAP = new HashMap<>();
        NUMBER_MAP.put("     |  |", 1);
        NUMBER_MAP.put(" _  _||_ ", 2);
        NUMBER_MAP.put(" _  _| _|", 3);
        NUMBER_MAP.put("   |_|  |", 4);
        NUMBER_MAP.put(" _ |_  _|", 5);
        NUMBER_MAP.put(" _ |_ |_|", 6);
        NUMBER_MAP.put(" _   |  |", 7);
        NUMBER_MAP.put(" _ |_||_|", 8);
        NUMBER_MAP.put(" _ |_| _|", 9);
        NUMBER_MAP.put(" _ | ||_|", 0);
    }

    /**
     * This function return the number scan but in integer.
     *
     * @param numberScan this is the string of the number scanned.
     * @return the number in integer.
     */
    public int returnNumberOfStringMap(String numberScan) {
        int number = -1;
        for (Map.Entry<String, Integer> entry : NUMBER_MAP.entrySet()) {
            if (entry.getKey().equals(numberScan)) {
                number = entry.getValue();
            }

        }
        return number;
    }

    /**
     * This function compare the number scanned with the key of the map.
     * and return the account number
     *
     * @param account is the string of the account.
     * @return the account number in integer.
     */
    public String scanString(String account) {
        String numberString = "";
        String numberInt = "";
        for (int index = 0; index < 25; index += NUMBER_SIZE) {
            numberString = numberString.concat(account.substring(index, index + NUMBER_SIZE))
                    .concat(account.substring(index + 27, index + 27 + NUMBER_SIZE))
                    .concat(account.substring(index + 54, index + 54 + NUMBER_SIZE));
            numberInt = numberInt.concat(String.valueOf(returnNumberOfStringMap(numberString)));
            numberString = "";
        }
        return numberInt;
    }

    /**
     * This function return true if the account number is valid.
     *
     * @param stringAccount is the number of the account.
     * @return false or true
     */
    public boolean isValidatedWithChecksum(String stringAccount) {
        int result = 0;
        int mult = 9;
        for (int index = 0; index < stringAccount.length(); index++) {
            result += mult * (Integer.parseInt(stringAccount.substring(index, index + 1)));
            mult--;
        }
        return result % 11 == 0;

    }
}
