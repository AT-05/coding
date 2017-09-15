package org.fundacionjala.coding.marco;

public class PersistentBugger {
    public int persistence(int value) {
        while (value >= 10) {

            String[] vectorNumber = String.valueOf(value).split("");
            value = 0;
            for (String aVectorNumber : vectorNumber) {
                value += Integer.parseInt(aVectorNumber);
            }

        }
        return value;
    }
}