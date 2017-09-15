package org.fundacionjala.coding.Marco;

/**
 *These are Test for DnaStrand september 15, 2017. 
 */
public class DnaStrand {

    /**
     * This method do a replace of same characters.
     *
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
