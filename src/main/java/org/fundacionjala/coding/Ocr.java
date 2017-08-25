import java.util.ArrayList;
import java.util.List;

/**
 * Created by Gary on 24/8/2017.
 */
public class Ocr {
    private List<String> numbers;
    private String result;

    public Ocr() {
        numbers = new ArrayList<>();

        numbers.add(" _ " +
                "| |" +
                "|_|");

        numbers.add("   " +
                "  |" +
                "  |");

        numbers.add(" _ " +
                " _|" +
                "|_ ");

        numbers.add(" _ " +
                " _|" +
                " _|");

        numbers.add("   " +
                "|_|" +
                "  |");

        numbers.add(" _ " +
                "|_ " +
                " _|");

        numbers.add(" _ " +
                "|_ " +
                "|_|");

        numbers.add(" _ " +
                "  |" +
                "  |");

        numbers.add(" _ " +
                "|_|" +
                "|_|");

        numbers.add(" _ " +
                "|_|" +
                " _|");
    }

    public String bankOcr(String Line1, String Line2, String Line3) {
        result = "";
        for (int position = 0; position < 27; position += 3) {
            result = result + compare(Line1.substring(position, position + 3) + Line2.substring(position, position + 3) + Line3.substring(position, position + 3));
        }
        return result;
    }

    public int compare(String numberString) {
        for (int listSize = 0; listSize < numbers.size(); listSize++) {
            if (numbers.get(listSize).equals(numberString)) {
                return listSize;
            }
        }

        return 0;
    }

    public int checkSum(String accountNumber) {
        int check = 0;
        for (int i = 0; i < accountNumber.length(); i++) {

            check += (9 - i) * (Integer.parseInt(accountNumber.substring(i, i + 1)));

        }
        check = check % 11;
        return check;
    }


}
