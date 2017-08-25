package org.fundacionjala.coding.Franco;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 8/25/2017.
 */
public class AccountNumber {
    private static final int NUMBER_SIZE = 3;
    private static final List<String> ACCOUNT_NUMBERS = new ArrayList<>();
    static {
        ACCOUNT_NUMBERS.add(" _ " + "| |" + "|_|");
        ACCOUNT_NUMBERS.add("   " + "  |" + "  |");
        ACCOUNT_NUMBERS.add(" _ " + " _|" + "|_ ");
        ACCOUNT_NUMBERS.add(" _ " + " _|" + " _|");
        ACCOUNT_NUMBERS.add("   " + "|_|" + "  |");
        ACCOUNT_NUMBERS.add(" _ " + "|_ " + " _|");
        ACCOUNT_NUMBERS.add(" _ " + "|_ " + "|_|");
        ACCOUNT_NUMBERS.add(" _ " + "  |" + "  |");
        ACCOUNT_NUMBERS.add(" _ " + "|_|" + "|_|");
        ACCOUNT_NUMBERS.add(" _ " + "|_|" + " _|");
    }

    public int getDigit(String number) {
        for (int i = 0; i < ACCOUNT_NUMBERS.size(); i++) {
            if (ACCOUNT_NUMBERS.get(i).equals(number)) {
                return i;
            }
        }
        return -1;
    }

    public String mapEntryOCRToNumber(List<String> lines) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < lines.get(0).length(); i += NUMBER_SIZE) {
            String number = lines.get(0).substring(i, i + NUMBER_SIZE)
                    .concat(lines.get(1).substring(i, i + NUMBER_SIZE))
                    .concat(lines.get(2).substring(i, i + NUMBER_SIZE));
            result.append(getDigit(number));
        }
        return result.toString();
    }

    public List<String> parseFile(String fileName) throws IOException {
        BufferedReader fileBuffer = null;
        FileReader fileReader = new FileReader(fileName);
        fileBuffer = new BufferedReader(fileReader);
        String line = null;
        ArrayList<String> lines = new ArrayList<String>();

        while ((line = fileBuffer.readLine()) != null) {
            if (!line.equals("")) {
                lines.add(line);
            }
        }
        return lines;
    }
}
