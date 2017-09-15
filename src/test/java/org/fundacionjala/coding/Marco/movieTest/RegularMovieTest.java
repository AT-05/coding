package org.fundacionjala.coding.Marco.movieTest;

import org.fundacionjala.coding.Marco.movie.Movie;
import org.fundacionjala.coding.Marco.movie.RegularMovie;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Administrator on 9/12/2017.
 */
public class RegularMovieTest {
    private Movie movie;

    /**
     * This method tests instancing of RegularMovie Class.
     */
    @Before
    public void setUp() {
        movie = new RegularMovie("Fast and Furious 7");
    }

    /**
     * This method tests calculus of amount of a RegularMovie type when its quantity
     * of days rented is less than two.
     */
    @Test
    public void calculateAmountWithDaysRentedLessThanTwo() {
        final double actualResult = movie.calculateAmount(1);
        final double expectedResult = 2;
        assertEquals(expectedResult, actualResult, 0);
    }

    /**
     * This method tests calculus of amount of a RegularMovie type when its quantity
     * of days rented is greater than two.
     */
    @Test
    public void calculateAmountWithDaysRentedGreaterThanTwo() {
        final double actualResult = movie.calculateAmount(4);
        final double expectedResult = 3;
        assertEquals(expectedResult, actualResult, 0);
    }
}
