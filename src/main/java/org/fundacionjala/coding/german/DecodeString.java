package org.fundacionjala.coding.german;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by German on 25/8/2017.
 */
public class DecodeString {
    private String stringOCR;
    private StringBuilder stringOCROut;
    private List<Integer> listOCR;
    private static final String QUESTION_MARK = "?";
    private static final List<String> STRING_LIST = new ArrayList<>();

    static {

        STRING_LIST.add(String.format("%s%s%s", " _ ",
                "| |",
                "|_|"));


        STRING_LIST.add(String.format("%s%s%s", "   ",
                "  |",
                "  |"));

        STRING_LIST.add(String.format("%s%s%s", " _ ",
                " _|",
                "|_ "));

        STRING_LIST.add(String.format("%s%s%s", " _ ",
                " _|",
                " _|"));

        STRING_LIST.add(String.format("%s%s%s", "   ",
                "|_|",
                "  |"));

        STRING_LIST.add(String.format("%s%s%s", " _ ",
                "|_ ",
                " _|"));

        STRING_LIST.add(String.format("%s%s%s", " _ ",
                "|_ ",
                "|_|"));

        STRING_LIST.add(String.format("%s%s%s", " _ ",
                "  |",
                "  |"));

        STRING_LIST.add(String.format("%s%s%s", " _ ",
                "|_|",
                "|_|"));

        STRING_LIST.add(String.format("%s%s%s", " _ ",
                "|_|",
                " _|"));

    }


    /**
     * this is comment of function.
     *
     * @param stringOCR **this is string for decode**
     */
    public DecodeString(String stringOCR) {
        this.stringOCR = stringOCR;
        listOCR = new ArrayList<>();
    }

    /**
     * this method return a String to number.
     *
     * @param number **this is string for decode**
     * @return int number
     */
    public int number(String number) {
        for (int i = 0; i < STRING_LIST.size(); i++) {
            if (STRING_LIST.get(i).equals(number)) {
                return i;
            }

        }
        return -1;
    }

    /**
     * parseAccount method.
     *
     * @return String
     */
    public String parseAccount() {
        this.stringOCROut = new StringBuilder();
        String[] divede = stringOCR.split("\n");
        int decode;
        for (int i = 0; i < divede[0].length(); i += 3) {
            decode = number(String.format("%s%s%s", divede[0].substring(i, i + 3),
                    divede[1].substring(i, i + 3),
                    divede[2].substring(i, i + 3)));
            listOCR.add(decode);
            if (decode >= 0) {
                stringOCROut.append(decode);

            } else {
                stringOCROut.append(QUESTION_MARK);
            }


        }
        return stringOCROut.toString();
    }


    /**
     * isValidCheckSum method.
     * Verity Check sum is correct
     *
     * @return boolean
     */

    public boolean isValidCheckSum() {
        boolean res = false;
        int mod11 = 0;
        if (!listOCR.isEmpty() && listOCR.size() == 9) {
            for (int i = 0; i < 9; i++) {
                if (listOCR.get(i) < 0) {
                    return false;
                }
                mod11 = mod11 + listOCR.get(i) * (9 - i);

            }
            res = mod11 % 11 == 0;
        }
        return res;
    }

    /**
     * is ILL method.
     *
     * @return boolean
     */
    private boolean isIll() {

        return stringOCROut.indexOf(QUESTION_MARK) >= 0;

    }

    /**
     * status method.
     *
     * @return String
     */
    public String status() {

        if (!this.isValidCheckSum()) {
            if (this.isIll()) {
                stringOCROut.append(" ILL");
            } else {
                stringOCROut.append(" ERR");
            }
        }
        return stringOCROut.toString();
    }
}
