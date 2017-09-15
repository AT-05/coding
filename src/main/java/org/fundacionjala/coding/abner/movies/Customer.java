package org.fundacionjala.coding.abner.movies;


import java.util.ArrayList;
import java.util.List;

/**
 * Created by Abner on 9/12/2017.
 */
public class Customer {
    /**
     * This list is variables of the class.
     */
    private final String name;
    private List<Rental> rentals;

    /**
     * This is constructor of the class.
     *
     * @param name This name of the customer.
     */
    public Customer(String name) {
        rentals = new ArrayList<>();
        this.name = name;
    }

    /**
     * This fuction add the news rentals.
     *
     * @param arg it is the new rental.
     */
    public void addRental(Rental arg) {
        rentals.add(arg);
    }

    /**
     * This is geter the name of the customer.
     *
     * @return the mane of the customer.
     */
    public String getName() {
        return name;
    }

    /**
     * This function calculation of the total amount.
     *
     * @return the value of calculation.
     */

    public double calculateAmountTotal() {
        double totalAmount = 0;

        for (Rental rental : rentals) {
            totalAmount += rental.calculateAmount();
        }
        return totalAmount;
    }

    /**
     * This function calculation the total point.
     *
     * @return the value of calculation.
     */
    public int calculateFrequentPointsTotal() {
        int totalFrequentRenterPoints = 0;
        for (Rental rental : rentals) {
            totalFrequentRenterPoints += rental.calculateFrequentRenterPoints();
        }
        return totalFrequentRenterPoints;
    }

    /**
     * This function make the statement.
     *
     * @return the statement make.
     */
    public String statement() {

        StringBuilder result = new StringBuilder("");
        result.append(String.format("%s %s %s", "Rental Record for", getName(), "\n"));

        for (Rental rental : rentals) {
            result.append(String.format("%s%s%s%s%s", "\t",
                    rental.getMovie().getTitle(),
                    "\t",
                    String.valueOf(rental.calculateAmount()),
                    "\n"));
        }
        result.append(String.format("%s %s%s", "Amount owed is",
                String.valueOf(calculateAmountTotal()),
                "\n"));

        result.append(String.format("%s %d%s", "You earned",
                calculateFrequentPointsTotal(),
                " frequent renter points"));

        return result.toString();
    }
}
