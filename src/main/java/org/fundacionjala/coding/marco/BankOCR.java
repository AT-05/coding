package org.fundacionjala.coding.marco;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Administrator on 8/22/2017.
 */
public class BankOCR {

    /**
     * value map.
     */
    private static final Map<String, Integer> NUMBER_MAP = new HashMap<>();
    private static final int ENTRY_SIZE = 27;
    private static final int NUMBER_SIZE = 3;
    private static final int EIGHT = 8;
    private static final int ELEVEN = 11;
    private static final int ZERO = 0;
    private static final int ONE = 1;
    private static final int TWO = 2;

    static {
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
     * test.
     *
     * @param stringCodeOne   test.
     * @param stringCodeTwo   test.
     * @param stringCodeThree test.
     * @return test.
     */
    public String mapStringToNumbers(String stringCodeOne, String stringCodeTwo, String stringCodeThree) {

        StringBuilder result = new StringBuilder();
        for (int i = 0; i < ENTRY_SIZE; i = i + NUMBER_SIZE) {
            String aux = stringCodeOne.substring(i, i + NUMBER_SIZE)
                    .concat(stringCodeTwo.substring(i, i + NUMBER_SIZE))
                    .concat(stringCodeThree.substring(i, i + NUMBER_SIZE));
            if (NUMBER_MAP.containsKey(aux)) {
                result.append(NUMBER_MAP.get(aux));
            } else {
                result.append("?");
            }
        }
        return result.toString();
    }

    /**
     * This is the story 2 of bank OCR.
     *
     * @param number test.
     * @return test.
     */
    public boolean checkSum(String number) {
        int pos = EIGHT, result = Integer.parseInt(number.substring(pos, pos + ONE)) * ONE;
        for (int i = TWO; i < number.length() + ONE; i++, pos--) {
            result = result + Integer.parseInt(number.substring(pos, pos + ONE)) * i;
        }
        return result % ELEVEN == ZERO;
    }

    /**
     * This is the story 3 of bank OCR.
     *
     * @param stringCodeOne   test.
     * @param stringCodeTwo   test.
     * @param stringCodeThree test.
     * @return test.
     */
    public String finding(String stringCodeOne, String stringCodeTwo, String stringCodeThree) {
        String code = mapStringToNumbers(stringCodeOne, stringCodeTwo, stringCodeThree);
        return !code.contains("?") ? (!checkSum(code)) ? code.concat(" ERR") : code : code.concat(" ILL");
    }

}
