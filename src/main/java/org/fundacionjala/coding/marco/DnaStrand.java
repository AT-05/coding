package org.fundacionjala.coding.marco;

/**
 * This was made by Marco Mendez September 15, 2015.
 */
public class DnaStrand {
    /**
     * This method test.
     * @param string test.
     * @return test.
     */
    public  String makeComplement(String string) {
        return string.replace('A', '1')
                .replace('C', '2')
                .replace('T', 'A')
                .replace('G', 'C')
                .replace('1', 'T')
                .replace('2', 'G');

    }
}
