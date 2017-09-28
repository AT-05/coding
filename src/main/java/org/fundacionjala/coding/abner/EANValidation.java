package org.fundacionjala.coding.abner;

/**
 * this class check de code bar.
 */
public class EANValidation {

    private static final int MULTIPLE_EVEN = 3;

    private static final int NUMBER_TEN = 10;

    /**
     * This function check is the code bar is true.
     *
     * @param codBar number de code bal.
     * @return boolean.
     */
    public boolean checkCodeBar(String codBar) {
        int sum = 0;
        for (int i = 1; i < codBar.length() - 1; i++) {
            int number = codBar.charAt(i);
            sum += i % 2 == 0 ? number : number * MULTIPLE_EVEN;
        }

        int checksum = sum % NUMBER_TEN == 0 ? 0 : NUMBER_TEN - (sum % NUMBER_TEN);
        int lastNumber = Integer.parseInt(codBar.substring(codBar.length() - 1));

        return checksum == lastNumber;
    }
}
