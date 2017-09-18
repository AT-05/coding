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
        double expectedResult = 4.5;
        double actualResult = children.getAmount(5);
        assertEquals(expectedResult, actualResult, 0);
    }

    /**
     * Get amount for children movie minor than 3 days of rent.
     */
    @Test
    public void childrenMovieGetAmountTest2() {
        double expectedResult = 1.5;
        double actualResult = children.getAmount(2);
        assertEquals(expectedResult, actualResult, 0);
    }

    /**
     * Calculate the frequent renter point for children movie.
     */
    @Test
    public void childrenMovieGetFrequentRenterPointsTest() {
        double expectedResult = 1;
        double actualResult = children.calculateFrequentRenterPoints(2);
        assertEquals(expectedResult, actualResult, 0);
    }

    /**
     * Get amount for new release movie.
     */
    @Test
    public void newReleaseMovieGetAmountTest() {
        double expectedResult = 15;
        double actualResult = newRelease.getAmount(5);
        assertEquals(expectedResult, actualResult, 0);
    }

    /**
     * Calculate the frequent renter point for new release movie greater than 1 day of rent.
     */
    @Test
    public void newReleaseMovieGetPointsTest() {
        double expectedResult = 2;
        double actualResult = newRelease.calculateFrequentRenterPoints(2);
        assertEquals(expectedResult, actualResult, 0);
    }

    /**
     * Calculate the frequent renter point for new release movie minor or equal than 1 day of rent.
     */
    @Test
    public void newReleaseMovieGetPointsTest2() {
        double expectedResult = 1;
        double actualResult = newRelease.calculateFrequentRenterPoints(1);
        assertEquals(expectedResult, actualResult, 0);
    }

    /**
     * Get amount for regular movie greater than 2 days of rent.
     */
    @Test
    public void regularMovieGetAmountTest() {
        double expectedResult = 5;
        double actualResult = regular.getAmount(4);
        assertEquals(expectedResult, actualResult, 0);
    }

    /**
     * Get amount for regular movie minor than 2 days of rent.
     */
    @Test
    public void regularMovieGetAmountTest2() {
        double expectedResult = 5;
        double actualResult = regular.getAmount(4);
        assertEquals(expectedResult, actualResult, 0);
    }

    /**
     * Calculate the frequent renter point for regular movie.
     */
    @Test
    public void regularMovieGetFrequentRenterPointsTest() {
        double expectedResult = 1;
        double actualResult = regular.calculateFrequentRenterPoints(2);
        assertEquals(expectedResult, actualResult, 0);
    }

    /**
     * Customer Test.
     */
    @Test
    public void customerStatementTest() {
        customer.addRental(new Rental(new Children("Lion King"), 5));
        customer.addRental(new Rental(new NewRelease("The Revenant"), 2));
        customer.addRental(new Rental(new Regular("Terminator"), 2));
        String expedtedResult = String.format("Rental Record for Test%n"
                + "\tLion King\t4.5%n"
                + "\tThe Revenant\t6.0%n"
                + "\tTerminator\t2.0%n"
                + "Amount owed is 12.5%n"
                + "You earned 4 frequent renter points");
        expedtedResult.equals(customer.statement());
    }

    /**
     * Calculate the total amount.
     */
    @Test
    public void customerTotalAmount() {
        customer.addRental(new Rental(new Children("Lion King"), 5));
        customer.addRental(new Rental(new NewRelease("The Revenant"), 2));
        customer.addRental(new Rental(new Regular("Terminator"), 2));
        double expectedResult = 12.5;
        double actualResult = customer.calculateTotalAmount();
        assertEquals(expectedResult, actualResult, 0);
    }

    /**
     * Calculate the total frequent points.
     */
    @Test
    public void customerTotalFrequentPoints() {
        customer.addRental(new Rental(new Children("Lion King"), 5));
        customer.addRental(new Rental(new NewRelease("The Revenant"), 2));
        customer.addRental(new Rental(new Regular("Terminator"), 2));
        double expectedResult = 4;
        double actualResult = customer.calculateTotalFrequentPoints();
        assertEquals(expectedResult, actualResult, 0);
    }
}
