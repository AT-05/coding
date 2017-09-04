package org.fundacionjala.coding.Franco;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 8/25/2017.
 */
public class AccountNumber {
    private static final int NUMBER_SIZE = 3;
    private static final List<String> ACCOUNT_NUMBERS = new ArrayList<>();

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
     * @return int value of the given form, if not a digit returns -1.
     */
    public int getDigit(String number) {
        for (int i = 0; i < ACCOUNT_NUMBERS.size(); i++) {
            if (ACCOUNT_NUMBERS.get(i).equals(number)) {
                return i;
            }
        }
        return -1;
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

        for (int i = 0; i < lines.get(0).length(); i += NUMBER_SIZE) {
            String number = lines.get(0).substring(i, i + NUMBER_SIZE)
                    .concat(lines.get(1).substring(i, i + NUMBER_SIZE))
                    .concat(lines.get(2).substring(i, i + NUMBER_SIZE));
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
        int checksum = 0;

        int i = 0, j = 9;
        final int numberPositionLength = numberPosition.length;

        while (i < numberPositionLength && j > 0) {
            checksum += Integer.parseInt(numberPosition[i]) * j;
            i++;
            j--;
        }
        return checksum % 11 == 0;
    }

    /**
     * This method evaluates entry of an account number.
     *
     * @param accountNumber to evaluate.
     * @return whether the account number is valida, illegible or does not
     * complies checksum.
     */
    public String finding(String accountNumber) {
        StringBuilder result = new StringBuilder();
        int counter = 0;

        final String[] values = accountNumber.split("");

        for (int i = 0; i < values.length; i++) {
            if (values[i].equals("-")) {
                result.append("?");
                i += 1;
                counter += 1;
            } else {
                result.append(values[i]);
            }
        }

        final boolean isValid = (counter == 0);
        result = (isValid) ? ((checkSum(accountNumber)) ? result : result.append(" ERR")) : result.append(" ILL");
        return result.toString();
    }
}
