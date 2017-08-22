package org.fundacionjala.kata;

/**
 * Created by Oz64 on 18/08/2017.
 */
public class Kata2 {

    static public int solution(int number) {

        int result = 0;
        for (int i=1; i < number; i++){
            if (i % 3 == 0 )
                result += i;

            if(i % 5 == 0)
                result += i;

            if(i%3==0 && i%5==0)
                result -= i;
        }
        return result;
    }
}
