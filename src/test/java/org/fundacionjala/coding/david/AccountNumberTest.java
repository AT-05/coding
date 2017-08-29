package org.fundacionjala.coding.david;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

/**
 * Class AccountNumberTest.
 */
public class AccountNumberTest {

    /**
     * Realice test for number bank.
     */
    @Test
    public void mapToNumberTest() {
        List<String> listLine = new ArrayList<>();
        listLine.add("    _  _     _  _  _  _  _ ");
        listLine.add("  | _| _||_||_ |    ||_||_|");
        listLine.add("  ||_  _|  | _||_|  ||_| _|");

        AccountNumber accountNumber = new AccountNumber();
        final String actualResul1 = accountNumber.mapToNumber(listLine);
        String expectedResult = "12345-1789";
        assertEquals(expectedResult, actualResul1);
    }

    /**
     * This method check number
     */
    @Test
    public void validateNumberTest()
    {
        AccountNumber accountNumber = new AccountNumber();
        String number = "457508000";
       boolean actualResul= accountNumber.checkNumber(number);
        boolean expectedResult=true;
        assertEquals(expectedResult, actualResul);
    }
    @Test
    public void verificateNumberTest()
    {
        AccountNumber accountNumber = new AccountNumber();
        String number = "664371495";
        String actualResul= accountNumber.scannNumber(number);
        String expectedResult="664371495 ERR";
        assertEquals(expectedResult, actualResul);
    }

}
