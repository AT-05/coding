package org.fundacionjala.coding.Franco;

import org.junit.Test;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

/**
 * Created by Administrator on 8/25/2017.
 */
public class AccountNumberTest {
    @Test
    public void testMapEntryOCRToNumber(){
        List<String> lines = new ArrayList<>();
        lines.add("    _  _     _  _  _  _  _ ");
        lines.add("  | _| _||_||_ |_   ||_||_|");
        lines.add("  ||_  _|  | _||_|  ||_| _|");

        AccountNumber accountNumber1 = new AccountNumber();

        final String actualResult = accountNumber1.mapEntryOCRToNumber(lines);

        final String expectedResult = "123456789";
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testParsedAccountNumber() throws IOException {
        String fileName = "C:\\Users\\Administrator\\Desktop\\AccountNumbers.txt";
        ArrayList<String> lines = new ArrayList<String>();

        AccountNumber accountNumber1 = new AccountNumber();

        String result = accountNumber1.mapEntryOCRToNumber(accountNumber1.parseFile(fileName));

        assertEquals("490067715", result);
    }
}
