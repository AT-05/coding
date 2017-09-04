package org.fundacionjala.coding;

/**
 * this class check de code bar.
 * Created by Administrator on 8/29/2017.
 */
public class BarCode {

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
            sum += i % 2 == 0 ? number : number * 3;
        }

        int checksum = sum % 10 == 0 ? 0 : 10 - (sum % 10);
        int lastNumber = Integer.parseInt(codBar.substring(codBar.length() - 1));

        return checksum == lastNumber;
    }
}
