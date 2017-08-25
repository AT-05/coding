package org.fundacionjala.coding.david;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Created by Administrator on 8/25/2017.
 */
public class Bank_ocr {

    private static final int NUMBER_SIZE = 3;
    private static final List<String> listt = new ArrayList<>();

    static {

        listt.add(" _ " +
                "| |" +
                "|_|");

        listt.add("   " +
                "  |" +
                "  |");

        listt.add(" _ " +
                " _|" +
                "|_ ");

        listt.add(" _ " +
                " _|" +
                " _|");

        listt.add("   " +
                "|_|" +
                "  |");

        listt.add(" _ " +
                "|_ " +
                " _|");

        listt.add(" _ " +
                "|_ " +
                "|_|");

        listt.add(" _ " +
                "  |" +
                "  |");

        listt.add(" _ " +
                "|_|" +
                "|_|");

        listt.add(" _ " +
                "|_|" +
                " _|");
    }

    /**
     * @param cad1
     * @return
     */
    public String mapToNumber(String cad1, String cad2, String cad3) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < cad1.length(); i += NUMBER_SIZE) {

            String number = cad1.substring(i, i + NUMBER_SIZE)
                    .concat(cad2.substring(i, i + NUMBER_SIZE)
                            .concat(cad3.substring(i, i + NUMBER_SIZE)));
            result.append(compare(number));
        }
        return result.toString();
    }

    public int compare(String numero) {
        for (int i = 0; i < listt.size(); i++) {
            if (listt.get(i).equals(numero))
                return i;
        }
        return -1;
    }
}
