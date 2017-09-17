package org.fundacionjala.coding.daniel;

import java.util.Enumeration;
import java.util.Vector;

/**
 * Class Customer.
 */
class Customer {
    private String name;
    private Vector rentals = new Vector();


    /**
     * @param name Constructor for class Customer.
     */
    Customer(String name) {
        this.name = name;
    }

    /**
     * @param arg Add rental for Customer.
     */
    void addRental(Rental arg) {
        rentals.addElement(arg);
    }

    /**
     * @return Returns the customer's name.
     */
    private String getName() {
        return name;
    }

    /**
     * @return Returns the statement of this customer.
     */
    String statement() {
        double totalAmount = 0;
        int frequentRenterPoints = 0;
        Enumeration rentals = this.rentals.elements();
        String result = "Rental Record for " + getName() + "%n";
        while (rentals.hasMoreElements()) {

            Rental each = (Rental) rentals.nextElement();
            //determine amounts for each line
            double thisAmount = each.getMovie().getAmount(0.0, each);

            // add frequent renter points
            frequentRenterPoints++;
            // add bonus for a two day new release rental
            if ((each.getMovie() instanceof NewReleaseMovie)
                    &&
                    each.getDaysRented() > 1) {
                frequentRenterPoints++;
            }
            //show figures for this rental
            result += String.format("\t%s\t%s\n", each.getMovie().getTitle(), String.valueOf(thisAmount));
            totalAmount += thisAmount;
        }
        //add footer lines
        result.concat("Amount owed is " + String.valueOf(totalAmount) + "\n");
        result.concat("You earned " + String.valueOf(frequentRenterPoints)
                +
                " frequent renter points");
        return result;
    }
}
