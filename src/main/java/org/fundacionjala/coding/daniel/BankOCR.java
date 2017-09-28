package org.fundacionjala.coding.daniel;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 8/25/2017.
 */
public class BankOCR {
    private static final int CONS_ZERO = 0;
    private static final int CONS_ONE = 1;
    private static final int CONS_TWO = 2;
    private static final int CONS_THREE = 3;
    private static final int CONS_NINE = 9;
    private static final int CONS_ELEVEN = 11;
    private static final List<String> ACCOUNT_NUMBERS = new ArrayList<>();
    private static final String NOT_EXIST_CHAR = "?";

    static {
        ACCOUNT_NUMBERS.add(" _ " + "| |" + "|_|");
        ACCOUNT_NUMBERS.add("   " + "  |" + "  |");
        ACCOUNT_NUMBERS.add(" _ " + " _|" + "|_ ");
        ACCOUNT_NUMBERS.add(" _ " + " _|" + " _|");
        ACCOUNT_NUMBERS.add("   " + "|_|" + "  |");
        ACCOUNT_NUMBERS.add(" _ " + "|_ " + " _|");
        ACCOUNT_NUMBERS.add(" _ " + "|_ " + "|_|");
        ACCOUNT_NUMBERS.add(" _ " + "  |" + "  |");
        ACCOUNT_NUMBERS.add(" _ " + "|_|" + "|_|");
        ACCOUNT_NUMBERS.add(" _ " + "|_|" + " _|");
    }

    /**
     * This method outputs equivalent number of an account number given in
     * pipes and underscores.
     *
     * @param number is formed by pipes and underscores.
     * @return value of the given form, if not a digit returns symbol "?".
     */
    public String getDigit(String number) {
        for (int i = CONS_ZERO; i < ACCOUNT_NUMBERS.size(); i++) {
            if (ACCOUNT_NUMBERS.get(i).equals(number)) {
                return String.valueOf(i);
            }
        }
        return NOT_EXIST_CHAR;
    }

    /**
     * This method maps a pipes and underscores given in a String
     * to its actual number representation.
     *
     * @param lines is a list of String pipes and underscores.
     * @return account number.
     */
    public String mapEntryOCRToNumber(List<String> lines) {
        StringBuilder result = new StringBuilder();

        for (int i = CONS_ZERO; i < lines.get(CONS_ZERO).length(); i += CONS_THREE) {
            String number = lines.get(CONS_ZERO).substring(i, i + CONS_THREE)
                    .concat(lines.get(CONS_ONE).substring(i, i + CONS_THREE))
                    .concat(lines.get(CONS_TWO).substring(i, i + CONS_THREE));
            result.append(getDigit(number));
        }
        return result.toString();
    }

    /**
     * This method calculates checksum of an account number.
     *
     * @param accountNumber is formed by 9 numbers.
     * @return whether the account number is valid or not.
     */
    public boolean checkSum(String accountNumber) {
        final String[] numberPosition = accountNumber.split("");
        int checksum = CONS_ZERO;
        int i = CONS_ZERO, j = CONS_NINE;
        final int numberPositionLength = numberPosition.length;

        while (i < numberPositionLength && j > CONS_ZERO) {
            checksum += Integer.parseInt(numberPosition[i]) * j;
            i++;
            j--;
        }
        return checksum % CONS_ELEVEN == CONS_ZERO;
    }

    /**
     * This method evaluates entry of an account number.
     *
     * @param actNum to evaluate.
     * @return whether the account number is valid, illegible or does not
     * complies checksum.
     */
    public String finding(String actNum) {
        return actNum.contains(NOT_EXIST_CHAR) ? String.format("%s ILL", actNum)
                : !checkSum(actNum) ? String.format("%s ERR", actNum) : actNum;
    }
}
