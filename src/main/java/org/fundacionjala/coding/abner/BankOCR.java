package org.fundacionjala.coding.abner;

import java.util.HashMap;
import java.util.Map;

/**
 * This class maps the number.
 */
public class BankOCR {

    private static final int NUMBER_SIZE = 3;

    private static final int ENTRY_SIZE = 9;

    private static final int MODULE_TEN = 10;

    private static final int MODULE_ELEVEN = 11;

    private static final String QUESTION_MARK = "?";

    private static final Map<String, String> MAP_NUMBER = new HashMap<>();
    static {
        MAP_NUMBER.put(String.format("%s%s%s",
                " _ ",
                "| |",
                "|_|"), "0");

        MAP_NUMBER.put(String.format("%s%s%s",
                "   ",
                "  |",
                "  |"), "1");

        MAP_NUMBER.put(String.format("%s%s%s",
                " _ ",
                " _|",
                "|_ "), "2");

        MAP_NUMBER.put(String.format("%s%s%s",
                " _ ",
                " _|",
                " _|"), "3");

        MAP_NUMBER.put(String.format("%s%s%s",
                "   ",
                "|_|",
                "  |"), "4");

        MAP_NUMBER.put(String.format("%s%s%s",
                " _ ",
                "|_ ",
                " _|"), "5");

        MAP_NUMBER.put(String.format("%s%s%s",
                " _ ",
                "|_ ",
                "|_|"), "6");

        MAP_NUMBER.put(String.format("%s%s%s",
                " _ ",
                "  |",
                "  |"), "7");

        MAP_NUMBER.put(String.format("%s%s%s",
                " _ ",
                "|_|",
                "|_|"), "8");

        MAP_NUMBER.put(String.format("%s%s%s",
                " _ ",
                "|_|",
                " _|"), "9");
    }

    /**
     * this function changed the value string to int.
     *
     * @param stringCodeOne   this is the first string.
     * @param stringCodeTwo   this is the second string.
     * @param stringCodeThree this is the third string.
     * @return number im string.
     */
    public String checkValue(String stringCodeOne, String stringCodeTwo, String stringCodeThree) {

        StringBuilder numberMaps = new StringBuilder();

        for (int i = 0; i < stringCodeOne.length(); i = i + NUMBER_SIZE) {
            numberMaps.append(MAP_NUMBER.get(String.format("%s%s%s",
                    stringCodeOne.substring(i, i + NUMBER_SIZE),
                    stringCodeTwo.substring(i, i + NUMBER_SIZE),
                    stringCodeThree.substring(i, i + NUMBER_SIZE))));

        }
        return numberMaps.toString();
    }

    /**
     * This function check the number car.
     *
     * @param number this is number car.
     * @return this return if number car or no.
     */
    public boolean checkSumCalculation(int number) {
        int sum = 0;
        for (int i = 1; i <= ENTRY_SIZE; i++) {
            sum += number % MODULE_TEN * i;
            number = number / MODULE_TEN;
        }
        return sum % MODULE_ELEVEN == 0;
    }

    /**
     * The function check type of number.
     *
     * @param number code number.
     * @return if check true.
     */
    public String checkFile(String number) {
        int intIndex = number.indexOf(QUESTION_MARK);
        if (intIndex == -1) {
            if (checkSumCalculation(Integer.parseInt(number))) {
                return number;
            }
            return String.format("%s ERR", number);
        }
        return String.format("%s ILL", number);
    }
}
