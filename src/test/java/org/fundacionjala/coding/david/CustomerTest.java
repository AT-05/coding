package org.fundacionjala.coding.david;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * This class CustomerTest.
 */
public class CustomerTest {


    Customer customer;

    @Before
    public void setUp() {
        customer = new Customer("test");
    }

    /**
     * This test realize to childrens case one.
     */
    @Test
    public void testMovieChildrensCaseOne() {
        customer.addRental(new Rental(new Childrens("The Revenant", 1), 4));

        final String actualResult = customer.statement();
        final String expectedResult = "";
        assertEquals(expectedResult, actualResult, 0);
    }

    /**
     * This test realize to childrens case two.
     */

}