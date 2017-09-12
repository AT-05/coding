package org.fundacionjala.coding.oscar.movies;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Administrator on 9/12/2017.
 */
public class MovieTest {
    private Customer customer = new Customer("Test");

    /**
     * Customer Test.
     */
    @Test
    public void customerStatementTest() {
        customer.addRental(new Rental(new Childrens("Lion King"), 5));
        customer.addRental(new Rental(new NewRelease("The Revenant"), 2));
        customer.addRental(new Rental(new Regular("Terminator"), 2));

        String expedtedResult = String.format("Rental Record for Test%n"
                + "\tLion King \t 4.5%n"
                + "\tThe Revenant \t 6.0%n"
                + "\tTerminator \t 2.0%n"
                + "Amount owed is 12.5%n"
                + "You earned 4 frequent renter points");
        assertEquals(expedtedResult, customer.statement());

    }
}
