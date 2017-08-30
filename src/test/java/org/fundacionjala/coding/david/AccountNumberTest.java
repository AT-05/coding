package org.fundacionjala.coding.david;

import org.junit.Test;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by Administrator on 8/29/2017.
 */
public class AccountNumberTest {

    /**
     * Realice test for number bank.
     */
    @Test
    public void mapToNumber()  {
        List<String> listLine = new ArrayList<>();
        listLine.add("    _  _     _  _  _  _  _ ");
        listLine.add("  | _| _||_||_ |_   ||_||_|");
        listLine.add("  ||_  _|  | _||_|  ||_| _|");

        AccountNumber accountNumber = new AccountNumber();
        final String actualResul1 = accountNumber.mapToNumber(listLine);
        String expectedResult = "123456789";
        assertEquals(expectedResult, actualResul1);
    }

    /**
     * This method check number
     */
    @Test
    public void checkNumber()  {
        List<String> listLine = new ArrayList<>();
        listLine.add("    _  _  _  _  _  _  _  _ ");
        listLine.add("|_||_   ||_ | ||_|| || || |");
        listLine.add("  | _|  | _||_||_||_||_||_|");
        AccountNumber accountNumber = new AccountNumber();
        final String numberConverter = accountNumber.mapToNumber(listLine);
        //String number = "457508000";
        boolean actualResul= accountNumber.checkNumber(numberConverter);
        boolean expectedResult=true;
        assertEquals(expectedResult, actualResul);
    }

    /**
     * This method check number
     */
    @Test
    public void scannNumber() {
        AccountNumber accountNumber = new AccountNumber();
        String number = "66437-1495";
        String actualResul= accountNumber.scannNumber(number);
        String expectedResult="66437?495 ILL";
        assertEquals(expectedResult, actualResul);
    }

}
