package org.fundacionjala.coding.german;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by seus on 25/8/2017.
 */
public class DecodeString {
    private String stringOCR;
    private String stringOCROut;
    private List<String> listt;
    private List<Integer> listOCR;

    /**
     * this is comment of function.
     *
     * @param stringOCR **this is string for decode**
     */
    public DecodeString(String stringOCR) {
        this.stringOCR = stringOCR;
        listt = new ArrayList<>();
        listOCR = new ArrayList<>();
        listt.add(String.format("%s%s%s", " _ ",
                "| |",
                "|_|"));


        listt.add(String.format("%s%s%s", "   ",
                "  |",
                "  |"));

        listt.add(String.format("%s%s%s", " _ ",
                " _|",
                "|_ "));

        listt.add(String.format("%s%s%s", " _ ",
                " _|",
                " _|"));

        listt.add(String.format("%s%s%s", "   ",
                "|_|",
                "  |"));

        listt.add(String.format("%s%s%s", " _ ",
                "|_ ",
                " _|"));

        listt.add(String.format("%s%s%s", " _ ",
                "|_ ",
                "|_|"));

        listt.add(String.format("%s%s%s", " _ ",
                "  |",
                "  |"));

        listt.add(String.format("%s%s%s", " _ ",
                "|_|",
                "|_|"));

        listt.add(String.format("%s%s%s", " _ ",
                "|_|",
                " _|"));

    }

    /**
     * this is comment of function.
     *
     * @return <code>String[]</code>
     */
    public String[] divideString() {
        String[] res = stringOCR.split("\n");
        return res;
    }

    /**
     * this is comment of function.
     *
     * @param number **this is string for decode**
     * @return <code>int</code>
     */
    public int numero(String number) {
        for (int i = 0; i < listt.size(); i++) {
            if (listt.get(i).equals(number)) {
                return i;
            }

        }
        return -1;
    }

    /**
     * Some library method.
     *
     * @return <code>String</code>
     */
    public String parseAccount() {
        StringBuilder buf = new StringBuilder();
        String[] divede = divideString();
        int decode;
        for (int i = 0; i < divede[0].length(); i += 3) {
            decode = numero(String.format("%s%s%s", divede[0].substring(i, i + 3),
                    divede[1].substring(i, i + 3),
                    divede[2].substring(i, i + 3)));
            listOCR.add(decode);
            if (decode >= 0) {
                buf.append(decode);

            } else {
                buf.append("?");
            }


        }
        stringOCROut = buf.toString();
        return stringOCROut;
    }


    /**
     * Some library method.
     *
     * @return <code>true</code>
     */

    public boolean isValidChekSum() {
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
     * isILL method.
     *
     * @return <code>boolean</code>
     */
    private boolean isIll() {
        boolean res = false;
        if (!stringOCROut.isEmpty()) {
            for (int i = 0; i < stringOCROut.length(); i++) {
                if (stringOCROut.charAt(i) == '?') {
                    res = true;
                    break;
                }
            }

        }
        return res;
    }

    /**
     * status method.
     *
     * @return <code>String</code>
     */
    public String status() {
        StringBuilder res = new StringBuilder(stringOCROut);
        if (!this.isValidChekSum()) {
            if (this.isIll()) {
                res.append(" ILL");
            } else {
                res.append(" ERR");
            }
        }
        return res.toString();
    }
}
