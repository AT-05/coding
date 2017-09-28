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
     * Test for number bank.
     */
    @Test
    public void mapToNumber() {
        List<String> listLine = new ArrayList<>();
        listLine.add("    _  _     _  _  _  _  _ ");
        listLine.add("  | _| _||_||_ |_   ||_||_|");
        listLine.add("  ||_  _|  | _||_|  ||_| _|");
        final String actualResult = bankOCR.mapToNumber(listLine);
        String expectedResult = "123456789";
        assertEquals(expectedResult, actualResult);
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
        boolean actualResult = bankOCR.checkNumber(numberConverter);
        assertTrue(actualResult);
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
        boolean actualResult = bankOCR.checkNumber(numberConverter);
        assertFalse(actualResult);
    }
    /**
     * This method check number 457508000.
     */
    @Test
    public void scanNumber1() {
        List<String> listLine = new ArrayList<>();
        listLine.add("    _  _  _  _  _  _  _  _ ");
        listLine.add("|_||_   ||_ | ||_|| || || |");
        listLine.add("  | _|  | _||_||_||_||_||_|");
        final String numberConverter = bankOCR.mapToNumber(listLine);
        String actualResult = bankOCR.scanNumber(numberConverter);
        String expectedResult = "457508000";
        assertEquals(expectedResult, actualResult);
    }

    /**
     * This method check number 664371495.
     */
    @Test
    public void scanNumber2() {
        List<String> listLine = new ArrayList<>();
        listLine.add(" _  _     _  _        _  _ ");
        listLine.add("|_ |_ |_| _|  |  ||_||_||_ ");
        listLine.add("|_||_|  | _|  |  |  | _| _|");
        final String numberConverter = bankOCR.mapToNumber(listLine);
        String actualResult = bankOCR.scanNumber(numberConverter);
        String expectedResult = "664371495 ERR";
        assertEquals(expectedResult, actualResult);
    }

    /**
     * This method check number 86110-1-136.
     */
    @Test
    public void scanNumber3() {
        List<String> listLine = new ArrayList<>();
        listLine.add(" _  _        _  _     _  _ ");
        listLine.add("|_||_   |  || |    _| _||_ ");
        listLine.add("|_||_|  |  ||_|  |  | _||_|");
        final String numberConverter = bankOCR.mapToNumber(listLine);
        String actualResult = bankOCR.scanNumber(numberConverter);
        String expectedResult = "86110??36 ILL";
        assertEquals(expectedResult, actualResult);
    }

}
