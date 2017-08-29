package org.fundacionjala.coding.david;

/**
 * The class scanner word and reversed
 */
public class ReverseWords {

    public String ReverseToStartInFivePosition(String words) {
        String[] listWord = words.split(" ");
        StringBuilder newWord;
        StringBuilder changeWord = new StringBuilder();
        changeWord.append(listWord[0]);
        for (int c = 1; c < listWord.length; c++) {
            newWord = new StringBuilder();
            for (int i = listWord[c].length() - 1; i >= 0; i--) {
                newWord.append(listWord[c].charAt(i));
            }
            changeWord.append(" ").append(newWord);
        }
        return changeWord.toString();
    }
}
