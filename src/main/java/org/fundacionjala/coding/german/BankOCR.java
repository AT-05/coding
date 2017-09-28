package org.fundacionjala.coding.german;

import java.util.ArrayList;
import java.util.List;

import static java.lang.String.format;

/**
 * Created by German on 25/8/2017.
 */
public class BankOCR {

    private static final String QUESTION_MARK = "?";

    private static final int OFFSET = 3;

    private static final int ENTRY_SIZE = 9;

    private static final int NUMBER_ELEVEN = 11;

    private static final List<String> NUMBERS = new ArrayList<>();
    static {
        NUMBERS.add(format("%s%s%s",
                " _ ",
                "| |",
                "|_|"));

        NUMBERS.add(format("%s%s%s",
                "   ",
                "  |",
                "  |"));

        NUMBERS.add(format("%s%s%s",
                " _ ",
                " _|",
                "|_ "));

        NUMBERS.add(format("%s%s%s",
                " _ ",
                " _|",
                " _|"));

        NUMBERS.add(format("%s%s%s",
                "   ",
                "|_|",
                "  |"));

        NUMBERS.add(format("%s%s%s",
                " _ ",
                "|_ ",
                " _|"));

        NUMBERS.add(format("%s%s%s",
                " _ ",
                "|_ ",
                "|_|"));

        NUMBERS.add(format("%s%s%s",
                " _ ",
                "  |",
                "  |"));

        NUMBERS.add(format("%s%s%s",
                " _ ",
                "|_|",
                "|_|"));

        NUMBERS.add(format("%s%s%s",
                " _ ",
                "|_|",
                " _|"));
    }

    /**
     * This method return a String numbers.
     *
     * @param stringOCR for decode
     * @return String
     */
    public String parseAccount(String stringOCR) {
        StringBuilder stringOCROut = new StringBuilder();
        String[] split = stringOCR.split("\n");
        int decode;
        for (int i = 0; i < split[0].length(); i += OFFSET) {
            decode = NUMBERS.indexOf(format("%s%s%s", split[0].substring(i, i + OFFSET),
                    split[1].substring(i, i + OFFSET),
                    split[2].substring(i, i + OFFSET)));
            stringOCROut.append(decode < 0 ? QUESTION_MARK : decode);
        }
        return stringOCROut.toString();
    }

    /**
     * isValidCheckSum method.
     * Verity stringOCR Check sum is correct
     *
     * @param stringOCR for decode
     * @return boolean
     */

    public boolean isValidCheckSum(String stringOCR) {
        int sum = 0;
        for (int i = 0; i < ENTRY_SIZE; i++) {
            sum += Character.getNumericValue(stringOCR.charAt(i)) * (ENTRY_SIZE - i);
        }
        return sum % NUMBER_ELEVEN == 0;

    }

    /**
     * status method .
     * add ILL unreadable
     * or ERR if checkSum is false to stringOCR
     *
     * @param stringOCR for decode
     * @return String
     */
    public String status(String stringOCR) {
        return isValidCheckSum(stringOCR)
                ? format("%s", stringOCR) : !stringOCR.contains("?")
                ? format("%s ERR", stringOCR) : format("%s ILL", stringOCR);
    }
}
