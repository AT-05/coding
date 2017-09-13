package org.fundacionjala.coding.david;

import java.util.Enumeration;
import java.util.Vector;

/**
 * This class is customer.
 */
public class Customer {
    private String name;
    private Vector rentals = new Vector();

    /**
     * This contructor initialize variable name.
     *
     * @param name is value string.
     */
    public Customer(String name) {
        this.name = name;
    }

    /**
     * This method add rental.
     *
     * @param arg value rental.
     */
    public void addRental(Rental arg) {
        rentals.addElement(arg);
    }

    /**
     * This method return name.
     *
     * @return value string.
     */
    public String getName() {
        return name;
    }

    /**
     * This method calculate days rented.
     *
     * @return value string.
     */
    public String statement() {
        double totalAmount = 0;
        int frequentRenterPoints = 0;
        Enumeration rentals = this.rentals.elements();
        StringBuilder result =new StringBuilder();
       result.append("Rental Record for ").append( getName() + "\n");
        while (rentals.hasMoreElements()) {
            double thisAmount = 0;
            Rental each = (Rental) rentals.nextElement();

            thisAmount = each.getMovie().getAmount(each.getDaysRented());

            frequentRenterPoints++;
         /*   if ((each.getMovie()== New_release.)
                    &&
                    each.getDaysRented() > 1) {
                frequentRenterPoints++;
            }*/
            result.append("\t").append(each.getMovie().getTitle()).append("\t").append(
                    String.valueOf(thisAmount)).append("\n");
            totalAmount += thisAmount;
        }

        result.append("Amount owed is ").append(String.valueOf(totalAmount)).append(
                "\n");
        result.append("You earned ").append(String.valueOf(frequentRenterPoints)).append(
                " frequent renter points");
        return result.toString();
    }
}
