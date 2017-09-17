package org.fundacionjala.coding.david;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * Created by Administrator on 8/29/2017.
 */
public class BankOCRTest {

    private BankOCR bankOCR;
    /**
     * This method initialize.
     */
    @Before
    public void setUp() {
        bankOCR = new BankOCR();
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
        final String actualResul1 = bankOCR.mapToNumber(listLine);
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

        final String numberConverter = bankOCR.mapToNumber(listLine);
        boolean actualResul = bankOCR.checkNumber(numberConverter);
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

        final String numberConverter = bankOCR.mapToNumber(listLine);
        boolean actualResul = bankOCR.checkNumber(numberConverter);
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
        final String numberConverter = bankOCR.mapToNumber(listLine);
        String actualResul = bankOCR.scannNumber(numberConverter);
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
        final String numberConverter = bankOCR.mapToNumber(listLine);
        String actualResul = bankOCR.scannNumber(numberConverter);
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
        final String numberConverter = bankOCR.mapToNumber(listLine);
        String actualResul = bankOCR.scannNumber(numberConverter);
        String expectedResult = "86110??36 ILL";
        assertEquals(expectedResult, actualResul);
    }

}
