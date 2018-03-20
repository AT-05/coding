package org.fundacionjala.coding.oscar.movies;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Administrator on 9/12/2017.
 */
public class MovieTest {
    private Customer customer;
    private Children children;
    private NewRelease newRelease;
    private Regular regular;

    /**
     * This method executed before any unit test.
     */
    @Before
    public void setUp() {
        customer = new Customer("Test");
        children = new Children("Minions");
        newRelease = new NewRelease("Interstellar");
        regular = new Regular("Thor");
    }

    /**
     * Get amount for children movie greater than 3 days of rent.
     */
    @Test
    public void childrenMovieGetAmountTest() {
        final int daysRented = 5;
        double actualResult = children.getAmount(daysRented);
        final double expectedResult = 4.5;
        assertEquals(expectedResult, actualResult, 0);
    }

    /**
     * Get amount for children movie minor than 3 days of rent.
     */
    @Test
    public void childrenMovieGetAmountTest2() {
        final int daysRented = 2;
        double actualResult = children.getAmount(daysRented);
        final double expectedResult = 1.5;
        assertEquals(expectedResult, actualResult, 0);
    }

    /**
     * Calculate the frequent renter point for children movie.
     */
    @Test
    public void childrenMovieGetFrequentRenterPointsTest() {
        final int daysRented = 2;
        double actualResult = children.calculateFrequentRenterPoints(daysRented);
        final double expectedResult = 1;
        assertEquals(expectedResult, actualResult, 0);
    }

    /**
     * Get amount for new release movie.
     */
    @Test
    public void newReleaseMovieGetAmountTest() {
        final int daysRented = 5;
        final double actualResult = newRelease.getAmount(daysRented);
        final double expectedResult = 15;
        assertEquals(expectedResult, actualResult, 0);
    }

    /**
     * Calculate the frequent renter point for new release movie greater than 1 day of rent.
     */
    @Test
    public void newReleaseMovieGetPointsTest() {
        final int daysRented = 2;
        final double actualResult = newRelease.calculateFrequentRenterPoints(daysRented);
        final double expectedResult = 2;
        assertEquals(expectedResult, actualResult, 0);
    }

    /**
     * Calculate the frequent renter point for new release movie minor or equal than 1 day of rent.
     */
    @Test
    public void newReleaseMovieGetPointsTest2() {
        final int daysRented = 1;
        final double actualResult = newRelease.calculateFrequentRenterPoints(daysRented);
        final double expectedResult = 1;
        assertEquals(expectedResult, actualResult, 0);
    }

    /**
     * Get amount for regular movie greater than 2 days of rent.
     */
    @Test
    public void regularMovieGetAmountTest() {
        final int daysRented = 4;
        final double actualResult = regular.getAmount(daysRented);
        final double expectedResult = 5;
        assertEquals(expectedResult, actualResult, 0);
    }

    /**
     * Get amount for regular movie minor than 2 days of rent.
     */
    @Test
    public void regularMovieGetAmountTest2() {
        final int daysRented = 4;
        final double actualResult = regular.getAmount(daysRented);
        final double expectedResult = 5;
        assertEquals(expectedResult, actualResult, 0);
    }

    /**
     * Calculate the frequent renter point for regular movie.
     */
    @Test
    public void regularMovieGetFrequentRenterPointsTest() {
        final int daysRented = 2;
        final double actualResult = regular.calculateFrequentRenterPoints(daysRented);
        final double expectedResult = 1;
        assertEquals(expectedResult, actualResult, 0);
    }

    /**
     * Calculate the total amount.
     */
    @Test
    public void customerTotalAmount() {
        final int daysRented = 5;
        customer.addRental(new Rental(new Children("Lion King"), daysRented));
        final int daysRented1 = 2;
        customer.addRental(new Rental(new NewRelease("The Revenant"), daysRented1));
        customer.addRental(new Rental(new Regular("Terminator"), daysRented1));
        final double expectedResult = 12.5;
        final double actualResult = customer.calculateTotalAmount();
        assertEquals(expectedResult, actualResult, 0);
    }

    /**
     * Calculate the total frequent points.
     */
    @Test
    public void customerTotalFrequentPoints() {
        final int daysRented = 5;
        customer.addRental(new Rental(new Children("Lion King"), daysRented));
        final int daysRented1 = 2;
        customer.addRental(new Rental(new NewRelease("The Revenant"), daysRented1));
        customer.addRental(new Rental(new Regular("Terminator"), daysRented1));
        final double expectedResult = 4;
        final double actualResult = customer.calculateTotalFrequentPoints();
        assertEquals(expectedResult, actualResult, 0);
    }
}
