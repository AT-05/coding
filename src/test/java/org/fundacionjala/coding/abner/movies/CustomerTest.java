package org.fundacionjala.coding.abner.movies;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Abner on 9/12/2017.
 */
public class CustomerTest {
    private Customer customer;

    /**
     * This method set the parameters.
     */
    @Before
    public void setUp() {

        customer = new Customer("Abner");
    }

    /**
     * This test method calculus of total amount of rentals.
     */
    @Test
    public void testCalculateAmountTotal() {
        customer.addRental(new Rental(new MovieChildrens("The Rental"), 4)); //3
        customer.addRental(new Rental(new MovieNewRelease("Terminator I"), 2)); //6
        customer.addRental(new Rental(new MovieRegular("Terminator II"), 1));  //2

        double actualResult = customer.calculateAmountTotal();
        double expectedResult = 11.0;
        assertEquals(expectedResult, actualResult, 0);
    }

    /**
     * This method tests calculus of earned frequent points of rentals of a customer.
     */
    @Test
    public void testCalculateFrequentPointsTotalWhitNewReleaseMovie() {
        customer.addRental(new Rental(new MovieChildrens("The Rental"), 4));
        customer.addRental(new Rental(new MovieNewRelease("Terminator I"), 2));
        customer.addRental(new Rental(new MovieRegular("Terminator II"), 1));

        double actualResult = customer.calculateFrequentPointsTotal();
        double expectedResult = 4;
        assertEquals(expectedResult, actualResult, 0);
    }

    /**
     * This method tests calculus of earned frequent points of rentals of a customer.
     */
    @Test
    public void testCalculateFrequentPointsTotalWhitOutNewReleaseMovie() {
        customer.addRental(new Rental(new MovieChildrens("The Rental"), 4));
        customer.addRental(new Rental(new MovieNewRelease("Terminator I"), 1));
        customer.addRental(new Rental(new MovieRegular("Terminator II"), 1));

        double actualResult = customer.calculateFrequentPointsTotal();
        double expectedResult = 3;

        assertEquals(expectedResult, actualResult, 0);
    }

    /**
     * This method tests verify the correct on-screen printing.
     */
    @Test
    public void testStatement() {
        customer.addRental(new Rental(new MovieChildrens("The Rental"), 4));
        customer.addRental(new Rental(new MovieNewRelease("Terminator I"), 1));
        customer.addRental(new Rental(new MovieRegular("Terminator II"), 1));

        String actualResult = customer.statement();
        String expectedResult = "Rental Record for Abner \n" +
                "\tThe Rental\t3.0\n" +
                "\tTerminator I\t3.0\n" +
                "\tTerminator II\t2.0\n" +
                "Amount owed is 8.0\n" +
                "You earned 3 frequent renter points";

        assertEquals(expectedResult, actualResult);
    }
}
