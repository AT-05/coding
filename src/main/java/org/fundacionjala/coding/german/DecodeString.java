package org.fundacionjala.coding.german;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by seus on 25/8/2017.
 */
public class DecodeString {
    private String stringOCR;
    private List<String> listt;
    private List<Integer> listOCR;
    /**
     *
     */
    public DecodeString(String stringOCR){
        this.stringOCR  =   stringOCR;
        listt = new ArrayList<>();
        listOCR = new ArrayList<>();
        listt.add(" _ " +
                "| |" +
                "|_|");

        listt.add("   " +
                "  |" +
                "  |");

        listt.add(" _ " +
                " _|" +
                "|_ ");

        listt.add(" _ " +
                " _|" +
                " _|");

        listt.add("   " +
                "|_|" +
                "  |");

        listt.add(" _ " +
                "|_ " +
                " _|");

        listt.add(" _ " +
                "|_ " +
                "|_|");

        listt.add(" _ " +
                "  |" +
                "  |");

        listt.add(" _ " +
                "|_|" +
                "|_|");

        listt.add(" _ " +
                "|_|" +
                " _|");

    }
    public String[] divideString(){
       String res[] = stringOCR.split("\n");
        return res;
    }
    public int numero(String numero) {
        for (int i = 0; i < listt.size(); i++) {
            if (listt.get(i).equals(numero))
                return i;

        }
        return -1;
    }
    public String storyOne( ) {
        String resu = "";
        String divede[]=divideString();
        int decode;
        for (int i = 0; i < divede[0].length(); i += 3) {
            decode=numero(divede[0].substring(i, i + 3) + divede[1].substring(i, i + 3) + divede[2].substring(i, i + 3));
            listOCR.add(decode);
            if(decode>=0)
            {
                resu = resu +decode;

            }
            else{
                resu = resu +"?";
            }


        }
        return resu;
    }
    public boolean isValid(){
        boolean res=false;
        int mod11=0;
        if(!listOCR.isEmpty()&&listOCR.size()==9) {
            for (int i = 0; i <9; i++) {
                if(listOCR.get(i)<0) return false;
                 mod11=mod11+listOCR.get(i)*(9-i);

            }
            res=mod11%11==0;
        }
        return res;
    }


}
