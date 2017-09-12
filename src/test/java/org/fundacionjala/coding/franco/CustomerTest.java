package org.fundacionjala.coding.franco;

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
        customer.addRental(new Rental(new ChildrensMovie("Goofy"), 4));
        customer.addRental(new Rental(new NewReleaseMovie("Avengers 3: Infinity War I"), 2));
        customer.addRental(new Rental(new RegularMovie("Spider-man"), 1));

        double actualResult = customer.calculateTotalAmount(customer.getRentalList());
        double expectedResult = 9.5;

        assertEquals(expectedResult, actualResult, 0);
    }

    /**
     * This method tests calculus of earned frequent points of rentals of a customer.
     */
    @Test
    public void calculateFrequentPointsWhenThereIsANewReleaseMovie() {
        customer.addRental(new Rental(new ChildrensMovie("Goofy"), 4));
        customer.addRental(new Rental(new NewReleaseMovie("Avengers 3: Infinity War I"), 2));
        customer.addRental(new Rental(new RegularMovie("Spider-man"), 1));

        double actualResult = customer.calculateFrequentPoints(customer.getRentalList());
        double expectedResult = 4;

        assertEquals(expectedResult, actualResult, 0);
    }

    /**
     * This method tests calculus of earned frequent points of rentals of a customer.
     */
    @Test
    public void calculateFrequentPointsWhenThereIsNotANewReleaseMovie() {
        customer.addRental(new Rental(new ChildrensMovie("Goofy"), 4));
        customer.addRental(new Rental(new NewReleaseMovie("Avengers 3: Infinity War I"), 1));
        customer.addRental(new Rental(new RegularMovie("Spider-man"), 1));

        double actualResult = customer.calculateFrequentPoints(customer.getRentalList());
        double expectedResult = 3;

        assertEquals(expectedResult, actualResult, 0);
    }
}
