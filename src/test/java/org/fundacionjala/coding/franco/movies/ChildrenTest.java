package org.fundacionjala.coding.franco.movies;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Administrator on 9/12/2017.
 */
public class ChildrenTest {

    private Movie movie;

    /**
     * This method tests instancing of Children Class.
     */
    @Before
    public void setUp() {
        movie = new Children("Bugs");
    }

    /**
     * This method tests calculus of amount of a Children type when its quantity
     * of days rented is less than three.
     */
    @Test
    public void calculateAmountWithDaysRentedLessThanThree() {
        final double actualResult = movie.calculateAmount(2);
        final double expectedResult = 1.5;
        assertEquals(expectedResult, actualResult, 0);
    }

    /**
     * This method tests calculus of amount of a Children type when its quantity
     * of days rented is greater than three.
     */
    @Test
    public void calculateAmountWithDaysRentedGreaterThanThree() {
        final double actualResult = movie.calculateAmount(5);
        final double expectedResult = 3;
        assertEquals(expectedResult, actualResult, 0);
    }

    /**
     * This method tests output of Children rental figure.
     */
    @Test
    public void rentalFigure() {
        final String actualResult = movie.rentalFigure(4);
        final String expectedResult = "\tBugs\t1.5";
        assertEquals(expectedResult, actualResult);
    }
}
