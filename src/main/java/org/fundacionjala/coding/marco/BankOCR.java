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
    public static final int ENTRY_SIZE = 27;

    public static final int NUMBER_SIZE = 3;

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
     * @param valueOne        test.
     * @param stringCodeThree test.
     * @return test.
     */
    public String storyOne(String stringCodeOne, String valueOne, String stringCodeThree) {

        StringBuilder result = new StringBuilder();
        for (int i = 0; i < ENTRY_SIZE; i = i + NUMBER_SIZE) {
            result.append(NUMBER_MAP.get(
                    stringCodeOne.substring(i, i + NUMBER_SIZE).
                            concat(valueOne.substring(i, i + NUMBER_SIZE)).
                            concat(stringCodeThree.substring(i, i + NUMBER_SIZE))));

        }
        return result.toString();
    }
}
