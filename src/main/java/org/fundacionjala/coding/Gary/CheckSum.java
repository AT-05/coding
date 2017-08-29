package com.company;

import java.util.stream.Stream;

/**
 * Created by Gary on 29/8/2017.
 */
public class CheckSum {


    public static boolean checkSum1(String chain1) {
        int result1 = 0, result2 = 0;


        int[] numbers = Stream.of(chain1.split("")).mapToInt(Integer::parseInt).toArray();
        int check = 0;
        for (int i = 0; i < numbers.length - 1; i++) {

            if (i + 1 % 2 == 0) {
                result1 += numbers[i] * 3;
            } else {
                result1 += numbers[i] * 1;
            }
        }


        int checksum = (result1 % 10 == 0) ? 0 : 10 - (result1) % 10;

        return checksum == numbers.length;
    }
}
