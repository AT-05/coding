package org.fundacionjala.coding.marco;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Administrator on 8/22/2017.
 */
public class BankOCR {

    private static final int ENTRY_SIZE = 27;

    private static final int TOTAL_NUMBERS = 9;

    private static final int NUMBER_SIZE = 3;

    private static final int MOD_ELEVEN = 11;

    private static final String QUESTION_MARK = "?";

    private static final Map<String, String> NUMBER_MAP = new HashMap<>();
    static {
        NUMBER_MAP.put(" _ | ||_|", "0");
        NUMBER_MAP.put("     |  |", "1");
        NUMBER_MAP.put(" _  _||_ ", "2");
        NUMBER_MAP.put(" _  _| _|", "3");
        NUMBER_MAP.put("   |_|  |", "4");
        NUMBER_MAP.put(" _ |_  _|", "5");
        NUMBER_MAP.put(" _ |_ |_|", "6");
        NUMBER_MAP.put(" _   |  |", "7");
        NUMBER_MAP.put(" _ |_||_|", "8");
        NUMBER_MAP.put(" _ |_| _|", "9");
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
            result.append(NUMBER_MAP.getOrDefault(aux, QUESTION_MARK));
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
        int numberPosition = 1;
        int sum = 0;
        for (int i = TOTAL_NUMBERS; i > 0; i--, numberPosition++) {
            sum += Integer.parseInt(number.substring(i - 1, i)) * numberPosition;
        }
        return sum % MOD_ELEVEN == 0;
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
        return code.contains(QUESTION_MARK) ? code.concat(" ILL")
                : !checkSum(code) ? code.concat(" ERR") : code;
    }

}
