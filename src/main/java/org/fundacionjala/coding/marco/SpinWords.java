package org.fundacionjala.coding.marco;

/**
 * test.
 */
public class SpinWords {

    public static final int ZERO = 0;
    public static final int FOUR = 4;

    /**
     * This method return a string.
     * @param string test.
     * @return test.
     */
    public String spinWords(String string) {
        String[] world = string.split(" ");
        for (int i = ZERO; i < world.length; i++) {
            if (world[i].length() > FOUR) {
                world[i] = new StringBuffer(world[i]).reverse().toString();
            }
        }
        return string.join(" ", world);
    }
}
