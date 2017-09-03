package org.fundacionjala.coding.oscar;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Oz64 on 25/08/2017.
 */
public class KataOCR {
    private static final int NUMBER_SIZE = 3;
    private static final int ACCOUNT_LENGTH = 27;
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
     * This function return the number scan.
     * If it is not possible to recognize the number, return "?"
     *
     * @param numberScan this is the string of the number scanned.
     * @return the number or ?.
     */
    public String returnNumberOfStringMap(String numberScan) {
        return NUMBER_MAP.containsKey(numberScan) ? NUMBER_MAP.get(numberScan).toString() : "?";
    }

    /**
     * This function compare the number scanned with the key of the map
     * and return the account number.
     *
     * @param account is the string of the account.
     * @return the account number.
     */
    public String scanString(String account) {
        StringBuilder numberInt = new StringBuilder();
        for (int index = 0; index <= ACCOUNT_LENGTH - 3; index += NUMBER_SIZE) {
            StringBuilder sb = new StringBuilder();
            sb.append(account.substring(index, index + NUMBER_SIZE))
                    .append(account.substring(index + ACCOUNT_LENGTH, index + ACCOUNT_LENGTH + NUMBER_SIZE))
                    .append(account.substring(index + ACCOUNT_LENGTH * 2, index + ACCOUNT_LENGTH * 2 + NUMBER_SIZE));
            numberInt.append(returnNumberOfStringMap(sb.toString()));
        }
        return numberInt.toString();
    }

    /**
     * This function return the account number if checksum is valid
     * otherwise call the function validateAccount.
     *
     * @param stringAccount is the number of the account.
     * @return account number
     */
    public String checksum(String stringAccount) {
        int result = 0, mult = 9;
        for (int index = 0; index < stringAccount.length(); index++) {
            result += mult * Integer.parseInt(stringAccount.substring(index, index + 1));
            mult--;
        }
        return (result % 11 == 0) ? stringAccount : accountIsInvalidOrIllegible(stringAccount);
    }

    /**
     * This function is for identify when an account has a invalid checksum or is illegible.
     *
     * @param account is the number of the account.
     * @return the account number with ILL or ERR to end.
     */
    public String accountIsInvalidOrIllegible(String account) {
        return (account.indexOf("?") == -1) ? String.format("%s ERR", account) : String.format("%s ILL", account);
    }
}
