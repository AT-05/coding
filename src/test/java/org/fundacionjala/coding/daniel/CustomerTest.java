package org.fundacionjala.coding.daniel;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Administrator on 10/09/17.
 */
public class CustomerTest {
    private Customer customer = new Customer("Test");

    /**
     * Customer Test.
     */
    @Test
    public void customerStatementTest() {
        customer.addRental(new Rental(new NewReleaseMovie("The Revenant", 1), 2));
        customer.addRental(new Rental(new RegularMovie("Terminator", 0), 2));
        assertEquals("", "Rental Record for Test\n"
                + "\tThe Revenant\t6.0\n"
                + "\tTerminator\t2.0\n"
                + "Amount owed is 8.0\n"
                + "You earned 3 frequent renter points", customer.statement());

    }
}
