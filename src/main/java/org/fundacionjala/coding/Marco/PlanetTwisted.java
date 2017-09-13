package org.fundacionjala.coding.Marco;


import java.util.Arrays;

/**
 * This kata was made by marco mendez September 12, 2017.
 */
public class PlanetTwisted {
    /**
     * This code is for the Planet Twisted.
     *
     * @param array test.
     * @return test.
     */
    public Integer[] sortTwisted37(Integer[] array) {
        Integer[] newArray = Arrays.copyOf(array, array.length);
        Arrays.sort(newArray);
        for (int i = 0; i < newArray.length; i++) {
            switch (newArray[i]) {
                case 7:
                    newArray[i] = 3;
                    break;
                case 3:
                    newArray[i] = 7;
                    break;
                case 14:
                    newArray[i] = 13;
                    break;
                case 13:
                    newArray[i] = 14;
                    break;
                default:
                    break;
            }
        }
        return newArray;

    }

}
