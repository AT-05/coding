/**
 * Created by Maizman on 12/09/2017.
 */

/**
 * This class DNA.
 */
public class DnaStrand {
    /**
     * This method change words.
     * @param word is a word.
     * @return word.
     */
    public static String makeComplement(String word) {
        String[] listWord = word.split("");
        StringBuilder newWord = new StringBuilder();
        for (String item : listWord) {
            newWord.append((item.equals("A")) ? "T" : ((item.equals("T")) ? "A" : ((item.equals("C")) ? "G" : "C")));

        }
        return newWord.toString();

    }
}
