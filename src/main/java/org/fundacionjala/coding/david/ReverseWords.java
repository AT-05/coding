package org.fundacionjala.coding.david;

/**
 ** The class scanner word and reversed.
 */
public class ReverseWords {

    /**
     * This method realize reverse of words.
     *
     * @param words String.
     * @return One word reverse.
     */
    public String reverseToStartInFivePosition(String words) {

        String[] listWord = words.split(" ");
        StringBuilder listReverseWord = new StringBuilder();
        listReverseWord.append(listWord[0]);
        for (int c = 1; c < listWord.length; c++) {
            listReverseWord.append(" ");
            if (listWord[c].length() > 4) {
                listReverseWord.append(new StringBuilder(listWord[c]).reverse());
            } else {
                listReverseWord.append(listWord[c]);
            }
        }
        return listReverseWord.toString();
    }
}
