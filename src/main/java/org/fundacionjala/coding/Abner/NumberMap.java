import java.util.HashMap;
import java.util.Map;

/**
 * Created by Samuel on 24/08/2017.
 */
public class NumberMap {

    private Map<String, Integer> map;

    public NumberMap(){
        map=new HashMap<>();
        map.put(String.format("%s%s%s", "   " ,
                                        "  |",
                                        "  |"),1);

        map.put(String.format("%s%s%s", " _ ",
                                        " _|",
                                        "|_ "),2);

        map.put(String.format("%s%s%s", " _ ",
                                        " _|",
                                        " _|"),3);

        map.put(String.format("%s%s%s", "   ",
                                        "|_|",
                                        "  |"),4);

        map.put(String.format("%s%s%s", " _ ",
                                        "|_ ",
                                        " _|"),5);

        map.put(String.format("%s%s%s", " _ " ,
                                        "|_ ",
                                        "|_|"), 6);

        map.put(String.format("%s%s%s", " _ ",
                                        "  |",
                                        "  |"), 7);

        map.put(String.format("%s%s%s", " _ " ,
                                        "|_|",
                                        "|_|"), 8);

        map.put(String.format("%s%s%s", " _ ",
                                        "|_|",
                                        " _|"), 9);

        map.put(String.format("%s%s%s", " _ ",
                                        "| |",
                                        "|_|"), 0);

    }

    public String chek_value(String stringCodeOne, String stringCodeTwo, String stringCodeThree) {
        StringBuffer number_maping=new StringBuffer("");

        for(int i=0;i<stringCodeOne.length();i=i+3)
        {
            number_maping.append(map.get(String.format("%s%s%s",
                    stringCodeOne.substring(i, i + 3),
                    stringCodeTwo.substring(i, i + 3),
                    stringCodeThree.substring(i, i + 3))).toString());

        }
        return number_maping.toString();

    }

    public int chek_one_value(String stringCodeOne, String stringCodeTwo, String stringCodeThree) {

        //return map.get(stringCodeOne+""+stringCodeTwo+""+stringCodeThree);
        return map.get(String.format("%s%s%s", stringCodeOne, stringCodeTwo, stringCodeThree));
    }

    public  int checksum_calculation(int number){
        int sum=1;
        int mod_number;
        for(int i=1; i<=9; i++){
            mod_number=number%10;
            number=number/10;
            sum=sum * mod_number+i+1;
        }
        return sum%11;
    }
}
