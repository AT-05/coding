package org.fundacionjala.coding;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Gary on 24/8/2017.
 */
public class Ocr {
    private static final List<String> NUMBERS = new ArrayList<>();
    private static final int NUMBER_SIZE_1 = 3;
    private static final int NUMBER_SIZE_2 = 9;
    private static final int NUMBER_SIZE_3 = 1;
    private static final int NUMBER_SIZE_4 = 27;

    static {
        NUMBERS.add(" _ | ||_|");

        NUMBERS.add("     |  |");

        NUMBERS.add(" _  _||_ ");

        NUMBERS.add(" _  _| _|");

        NUMBERS.add("   |_|  |");

        NUMBERS.add(" _ |_  _|");

        NUMBERS.add(" _ |_ |_|");

        NUMBERS.add(" _   |  |");

        NUMBERS.add(" _ |_||_|");

        NUMBERS.add(" _ |_| _|");
    }

    /**
     * Convert the lines into a numbers.
     *
     * @param line1 result.
     * @param line2 result.
     * @param line3 result.
     * @return result string array.
     */
    public String bankOcr(String line1, String line2, String line3) {
        StringBuilder result = new StringBuilder();

        for (int position = 0; position < NUMBER_SIZE_4; position += NUMBER_SIZE_1) {

            String eachNumber = line1.substring(position, position + NUMBER_SIZE_1)
                    .concat(line2.substring(position, position + NUMBER_SIZE_1))
                    .concat(line3.substring(position, position + NUMBER_SIZE_1));
            result.append(compare(eachNumber));
        }
        return result.toString();
    }

    /**
     * compare with the list.
     *
     * @param numberString string array.
     * @return listSize number value.
     */
    public int compare(String numberString) {
        for (int listSize = 0; listSize < NUMBERS.size(); listSize++) {
            if (NUMBERS.get(listSize).equals(numberString)) {
                return listSize;
            }
        }

        return 0;
    }

    /**
     * do the story_2 of ocrBank.
     *
     * @param accountNumber string number.
     * @return check checks the account.
     */
    public boolean checkSum(String accountNumber) {
        int check = 0;
        for (int i = 0; i < accountNumber.length(); i++) {

            check += (NUMBER_SIZE_2 - i) * Integer.parseInt(accountNumber.substring(i, i + NUMBER_SIZE_3));

        }
        check = check % 11;
        if (check == 0) {
            return true;
        }
        return false;
    }


}
