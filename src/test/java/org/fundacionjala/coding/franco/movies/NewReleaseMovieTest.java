package org.fundacionjala.coding.franco.movies;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Administrator on 9/12/2017.
 */
public class NewReleaseMovieTest {
    private Movie movie;

    /**
     * This method tests instancing of NewReleaseMovie Class.
     */
    @Before
    public void setUp() {
        movie = new NewReleaseMovie("The Day After Tomorrow");
    }

    /**
     * This method tests calculus of amount of a NewReleaseMovie type.
     */
    @Test
    public void calculateAmount() {
        final double actualResult = movie.calculateAmount(3);
        final double expectedResult = 9;
        assertEquals(expectedResult, actualResult, 0);
    }

    /**
     * This method tests output of NewReleaseMovie rental figure.
     */
    @Test
    public void rentalFigure() {
        final String actualResult = movie.rentalFigure(2);
        final String expectedResult = "\tThe Day After Tomorrow\t6.0";
        assertEquals(expectedResult, actualResult);
    }
}
