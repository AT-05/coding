package org.fundacionjala.coding.david;
import org.junit.Before;
import org.junit.Test;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * Created by Administrator on 8/29/2017.
 */
public class AccountNumberTest {

    private  AccountNumber accountNumber;
    /**
     * This method initialize.
     */
    @Before
    public void setUp() {
        accountNumber = new AccountNumber();
    }
    /**
     * Realice test for number bank.
     */
    @Test
    public void mapToNumber() {
        List<String> listLine = new ArrayList<>();
        listLine.add("    _  _     _  _  _  _  _ ");
        listLine.add("  | _| _||_||_ |_   ||_||_|");
        listLine.add("  ||_  _|  | _||_|  ||_| _|");
        final String actualResul1 = accountNumber.mapToNumber(listLine);
        String expectedResult = "123456789";
        assertEquals(expectedResult, actualResul1);
    }

    /**
     * This method check number.
     */
    @Test
    public void checkNumberCaseOne() {
        List<String> listLine = new ArrayList<>();
        listLine.add("    _  _  _  _  _  _  _  _ ");
        listLine.add("|_||_   ||_ | ||_|| || || |");
        listLine.add("  | _|  | _||_||_||_||_||_|");

        final String numberConverter = accountNumber.mapToNumber(listLine);
        boolean actualResul = accountNumber.checkNumber(numberConverter);
        assertTrue(actualResul);
    }
    /**
     * This method check number.
     */
    @Test
    public void checkNumberCaseTwo() {
        List<String> listLine = new ArrayList<>();
        listLine.add("    _  _  _  _  _  _  _    ");
        listLine.add("|_||_   ||_ | ||_|| || |  |");
        listLine.add("  | _|  | _||_||_||_||_|  |");

        final String numberConverter = accountNumber.mapToNumber(listLine);
        boolean actualResul = accountNumber.checkNumber(numberConverter);
        assertFalse(actualResul);
    }
    /**
     * This method check number 457508000.
     */
    @Test
    public void scannNumber1() {
        List<String> listLine = new ArrayList<>();
        listLine.add("    _  _  _  _  _  _  _  _ ");
        listLine.add("|_||_   ||_ | ||_|| || || |");
        listLine.add("  | _|  | _||_||_||_||_||_|");
        final String numberConverter = accountNumber.mapToNumber(listLine);
        String actualResul = accountNumber.scannNumber(numberConverter);
        String expectedResult = "457508000";
        assertEquals(expectedResult, actualResul);
    }

    /**
     * This method check number 664371495.
     */
    @Test
    public void scannNumber2() {
        List<String> listLine = new ArrayList<>();
        listLine.add(" _  _     _  _        _  _ ");
        listLine.add("|_ |_ |_| _|  |  ||_||_||_ ");
        listLine.add("|_||_|  | _|  |  |  | _| _|");
        final String numberConverter = accountNumber.mapToNumber(listLine);
        String actualResul = accountNumber.scannNumber(numberConverter);
        String expectedResult = "664371495 ERR";
        assertEquals(expectedResult, actualResul);
    }

    /**
     * This method check number 86110-1-136.
     */
    @Test
    public void scannNumber3() {
        List<String> listLine = new ArrayList<>();
        listLine.add(" _  _        _  _     _  _ ");
        listLine.add("|_||_   |  || |    _| _||_ ");
        listLine.add("|_||_|  |  ||_|  |  | _||_|");
        final String numberConverter = accountNumber.mapToNumber(listLine);
        String actualResul = accountNumber.scannNumber(numberConverter);
        String expectedResult = "86110??36 ILL";
        assertEquals(expectedResult, actualResul);
    }

}
