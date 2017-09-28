package org.fundacionjala.coding.marco;

/**
 * This was made by Marco Mendez September 15, 2017.
 */
public class DigitalRoot {

    private static final int MOD_NINE = 9;

    /**
     * This method calculate digital root.
     *
     * @param value test.
     * @return test.
     */
    public int root(int value) {
        int module = value % MOD_NINE;
        return module == 0 ? MOD_NINE : module;
    }
}
