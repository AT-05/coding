package org.fundacionjala.coding.Gary;

/**
 * Created by Gary on 30/8/2017.
 */
public class InnerContent {
    private static final String DELIMITER = " ";

    /**
     * the method that converts.
     *
     * @param chain to convert.
     * @return converted chain.
     */
    public String innerSort(String chain) {
        String[] separateWords = chain.split(DELIMITER);
        for (int position = 0; position < separateWords.length; position++) {

            if (separateWords[position].length() >= 3) {
                String inner = separateWords[position].substring(1, separateWords[position].length() - 1);
                inner = inner.chars().sorted()
                        .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
                        .reverse()
                        .toString();
                separateWords[position] = separateWords[position].substring(0, 1)
                        .concat(inner)
                        .concat(separateWords[position]
                                .substring(separateWords[position].length() - 1, separateWords[position].length()));
            }
        }

        return String.join(DELIMITER, separateWords);
    }
}
