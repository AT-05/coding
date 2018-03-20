package org.fundacionjala.coding.german;

import java.util.Arrays;
import java.util.List;

/**
 * Created by German on 25/8/2017.
 */
public class BankOCR {

    private static final String QUESTION_MARK = "?";

    private static final int OFFSET = 3;

    private static final int ENTRY_SIZE = 9;

    private static final int NUMBER_ELEVEN = 11;

    private static final String OCR_NUMBER_FORMAT = "%s%s%s";

    private static final List<String> NUMBERS = Arrays.asList(
            String.format(OCR_NUMBER_FORMAT,
                    " _ ",
                    "| |",
                    "|_|"),
            String.format(OCR_NUMBER_FORMAT,
                    "   ",
                    "  |",
                    "  |"),
            String.format(OCR_NUMBER_FORMAT,
                    " _ ",
                    " _|",
                    "|_ "),
            String.format(OCR_NUMBER_FORMAT,
                    " _ ",
                    " _|",
                    " _|"),
            String.format(OCR_NUMBER_FORMAT,
                    "   ",
                    "|_|",
                    "  |"),
            String.format(OCR_NUMBER_FORMAT,
                    " _ ",
                    "|_ ",
                    " _|"),
            String.format(OCR_NUMBER_FORMAT,
                    " _ ",
                    "|_ ",
                    "|_|"),
            String.format(OCR_NUMBER_FORMAT,
                    " _ ",
                    "  |",
                    "  |"),
            String.format(OCR_NUMBER_FORMAT,
                    " _ ",
                    "|_|",
                    "|_|"),
            String.format(OCR_NUMBER_FORMAT,
                    " _ ",
                    "|_|",
                    " _|")
    );

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
            decode = NUMBERS.indexOf(String.format(OCR_NUMBER_FORMAT,
                    split[0].substring(i, i + OFFSET),
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
        if (stringOCR.contains("?")) {
            return String.format("%s ILL", stringOCR);
        }
        return !isValidCheckSum(stringOCR) ? String.format("%s ERR", stringOCR) : stringOCR;
    }
}
