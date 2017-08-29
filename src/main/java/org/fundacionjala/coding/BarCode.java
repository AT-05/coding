package org.fundacionjala.coding;

/**
 * this class check de code bar.
 * Created by Administrator on 8/29/2017.
 */
public class BarCode {

    /**
     * This function check is the code bar is true.
     * @param codBar number de code bal.
     * @return boolean.
     */
    public boolean checkCodeBar(String codBar) {
        int checkSum = Integer.parseInt(codBar.substring(codBar.length() - 1));
        int sum = 0;
        for (int i = 1; i < codBar.length() - 1; i++) {
            if (i % 2 == 0) {
                sum += (int) (codBar.charAt(i));
            } else {
                sum += ((int) (codBar.charAt(i)) * 3);
            }
        }

        if (sum % 10 == 0) {
            return (checkSum == 0) ? true : false;

        } else {
            return ((10 - (sum % 10)) == checkSum) ? true : false;

        }


    }
}
