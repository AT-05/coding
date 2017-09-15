package org.fundacionjala.coding.Marco;

/**
 * This Kata was made by Marco Mendez September 12, 2017.
 */
public class PersistentBugger {
    /**
     * Test.
     *
     * @param value test.
     * @return test.
     */
    public int persistence(int value) {
        int count = 0;
        while (value >= 10) {
            value = Long.toString(value).chars().reduce(1, (r, i) -> r * (i - '0'));
            count++;
        }
        return count;

    }
}
