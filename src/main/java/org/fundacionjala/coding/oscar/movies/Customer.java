package org.fundacionjala.coding.oscar.movies;

import java.util.Enumeration;
import java.util.Vector;

/**
 * This class is for the customers.
 */
class Customer {
    private String name;
    private Vector rentals = new Vector();

    /**
     * This is the construct for customer.
     *
     * @param name of the customer.
     */
    Customer(String name) {
        this.name = name;
    }

    /**
     * tihs method add a rental to the vector.
     *
     * @param arg contained the movie with the days for rent.
     */
    public void addRental(Rental arg) {
        rentals.addElement(arg);
    }

    /**
     * This method return the name of the customer.
     *
     * @return string name
     */
    public String getName() {
        return name;
    }

    /**
     * This method has the logic for calculated the amount owed and the points earned.
     *
     * @return a string with all the datas.
     */
    public String statement() {
        double totalAmount = 0;
        int frequentRenterPoints = 0;
        Enumeration rentals = this.rentals.elements();
        String result = String.format("Rental Record for %s%n", getName());
        while (rentals.hasMoreElements()) {
            Rental each = (Rental) rentals.nextElement();
            double thisAmount = each.getMovie().getAmount(each.getDaysRented());
            // add frequent renter points
            frequentRenterPoints++;
            // add bonus for a two day new release rental
            if ((each.getMovie().getPriceCode() == NewRelease.NEW_RELEASE) && each.getDaysRented() > 1) {
                frequentRenterPoints++;
            }
            //show figures for this rental
            result = result.concat(String.format("\t%s \t %s%n",
                    each.getMovie().getTitle(),
                    String.valueOf(thisAmount)));
            totalAmount += thisAmount;
        }
        //add footer lines
        result = result.concat(String.format("Amount owed is %s%n",
                String.valueOf(totalAmount)));
        result = result.concat(String.format("You earned %s frequent renter points",
                String.valueOf(frequentRenterPoints)));
        return result;
    }
}
