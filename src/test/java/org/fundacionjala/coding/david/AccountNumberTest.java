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
        listLine.add("  | _| _||_||_ |_   ||_||_|");
        listLine.add("  ||_  _|  | _||_|  ||_| _|");

        AccountNumber accountNumber = new AccountNumber();
        final String actualResul1 = accountNumber.mapToNumber(listLine);
        String expectedResult = "123456789";
        assertEquals(expectedResult, actualResul1);
    }

}
