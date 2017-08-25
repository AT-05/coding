package org.fundacionjala.coding.Abner;

import java.util.HashMap;
import java.util.Map;

/**
 * This class maps the number.
 * Created by Samuel on 24/08/2017.
 */
public class NumberMap {

    private static final int NUMBER_SIZE = 3;
    private static final Map<String, Integer> MAP_NUMBER = new HashMap<>();

    static {

        MAP_NUMBER.put(String.format("%s%s%s", "   ",
                "  |",
                "  |"), 1);

        MAP_NUMBER.put(String.format("%s%s%s", " _ ",
                " _|",
                "|_ "), 2);

        MAP_NUMBER.put(String.format("%s%s%s", " _ ",
                " _|",
                " _|"), 3);

        MAP_NUMBER.put(String.format("%s%s%s", "   ",
                "|_|",
                "  |"), 4);

        MAP_NUMBER.put(String.format("%s%s%s", " _ ",
                "|_ ",
                " _|"), 5);

        MAP_NUMBER.put(String.format("%s%s%s", " _ ",
                "|_ ",
                "|_|"), 6);

        MAP_NUMBER.put(String.format("%s%s%s", " _ ",
                "  |",
                "  |"), 7);

        MAP_NUMBER.put(String.format("%s%s%s", " _ ",
                "|_|",
                "|_|"), 8);

        MAP_NUMBER.put(String.format("%s%s%s", " _ ",
                "|_|",
                " _|"), 9);

        MAP_NUMBER.put(String.format("%s%s%s", " _ ",
                "| |",
                "|_|"), 0);
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

        StringBuilder numberMaps = new StringBuilder("");

        for (int i = 0; i < stringCodeOne.length(); i = i + NUMBER_SIZE) {
            numberMaps.append(MAP_NUMBER.get(String.format("%s%s%s",
                    stringCodeOne.substring(i, i + NUMBER_SIZE),
                    stringCodeTwo.substring(i, i + NUMBER_SIZE),
                    stringCodeThree.substring(i, i + NUMBER_SIZE))).toString());

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
        int modNumber;
        for (int i = 1; i <= 9; i++) {
            modNumber = number % 10;
            number = number / 10;
            sum = sum + (modNumber * i);
        }
        /*if(sum % 11==0){
            return true;
        }
        return false;
*/
        return (sum % 11 == 0) ? true : false;
    }

}
