package org.fundacionjala.coding.Marco;

public class Kata_Exam {
    public int Root(int value) {
        int result = 10;
        while (value > 9) {
            value =value /10;
            result = 0;
            String[] vectorNumber = String.valueOf(value).split("");
            for (int i = 0; i < vectorNumber.length; i++) {
                result = result + Integer.parseInt(vectorNumber[i]);
            }
            
        }
        return result;
    }
}
