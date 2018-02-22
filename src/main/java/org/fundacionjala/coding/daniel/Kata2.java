package org.fundacionjala.coding.daniel;

/**
 * Created by Administrator on 30/08/17.
 */
public class Kata2 {


    /**
     * @param number A positive number.
     * @return Returns the sum of all the multiples of 3 or 5 below the number passed in.
     */
    protected int solution(int number) {
        int sum = 0;
        for (int i = 3; i < number; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                sum += i;
            }
        }
        return sum;
    }
}

