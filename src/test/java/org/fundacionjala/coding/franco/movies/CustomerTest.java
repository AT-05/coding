package org.fundacionjala.coding.franco.movies;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Administrator on 9/12/2017.
 */
public class CustomerTest {

    private Customer customer;

    /**
     * This method tests instancing of Customer Class.
     */
    @Before
    public void setUp() {
        customer = new Customer("Cristiano Ronaldo");
    }

    /**
     * This method tests calculus of total amount of rentals of a customer.
     */
    @Test
    public void calculateTotalAmount() {
        final int daysRented = 4;
        customer.addRental(new Rental(new Children("Goofy"), daysRented));
        final int daysRented1 = 2;
        customer.addRental(new Rental(new NewRelease("Avengers 3: Infinity War I"), daysRented1));
        final int daysRented2 = 1;
        customer.addRental(new Rental(new Regular("Spider-man"), daysRented2));

        final double actualResult = customer.calculateTotalAmount();
        final double expectedResult = 9.5;

        assertEquals(expectedResult, actualResult, 0);
    }

    /**
     * This method tests calculus of earned frequent points of rentals of a customer.
     */
    @Test
    public void calculateFrequentPointsWhenThereIsANewReleaseMovie() {
        final int daysRented = 4;
        customer.addRental(new Rental(new Children("Goofy"), daysRented));
        final int daysRented1 = 2;
        customer.addRental(new Rental(new NewRelease("Avengers 3: Infinity War I"), daysRented1));
        final int daysRented2 = 1;
        customer.addRental(new Rental(new Regular("Spider-man"), daysRented2));

        final double actualResult = customer.calculateTotalFrequentPoints();
        final double expectedResult = 4;

        assertEquals(expectedResult, actualResult, 0);
    }

    /**
     * This method tests calculus of earned frequent points of rentals of a customer.
     */
    @Test
    public void calculateFrequentPointsWhenThereIsNotANewReleaseMovie() {
        final int daysRented = 4;
        customer.addRental(new Rental(new Children("Goofy"), daysRented));
        final int daysRented1 = 1;
        customer.addRental(new Rental(new NewRelease("Avengers 3: Infinity War I"), daysRented1));
        customer.addRental(new Rental(new Regular("Spider-man"), daysRented1));

        final double actualResult = customer.calculateTotalFrequentPoints();
        final double expectedResult = 3;

        assertEquals(expectedResult, actualResult, 0);
    }

    /**
     * This method tests output of Customer general rental report.
     */
    @Test
    public void statement() {
        final int daysRented = 4;
        customer.addRental(new Rental(new Children("Goofy"), daysRented));
        final int daysRented1 = 1;
        customer.addRental(new Rental(new NewRelease("Avengers 3: Infinity War I"), daysRented1));
        customer.addRental(new Rental(new Regular("Spider-man"), daysRented1));

        final String actualResult = customer.statement();
        final StringBuilder expectedResult = new StringBuilder("Rental Record for Cristiano Ronaldo");
        expectedResult.append("\tGoofy\t1.5\n")
                .append("\tAvengers 3: Infinity War I\t3.0\n")
                .append("\tSpider-man\t2.0\n")
                .append("Amount owed is 6.5\nYou earned 3 frequent renter points");

        assertEquals(expectedResult.toString(), actualResult);
    }
}
