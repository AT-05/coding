package org.fundacionjala.coding.oscar.movies;

import java.util.ArrayList;
import java.util.List;

/**
 * This class is for the customers.
 */
class Customer {
    private String name;
    private List<Rental> rentals;

    /**
     * This is the construct for customer.
     *
     * @param name of the customer.
     */
    Customer(String name) {
        this.name = name;
        rentals = new ArrayList<>();
    }

    /**
     * This method add a rental to list.
     *
     * @param listMovies contained movies.
     */
    public void addRental(Rental listMovies) {
        rentals.add(listMovies);
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
     * This method build a string with all data of rents.
     *
     * @return a string with all the data.
     */
    public String statement() {
        StringBuilder sb = new StringBuilder("Rental Record for ").append(getName()).append("\n");
        for (Rental rental : rentals) {
            sb.append("\t")
                    .append(rental.getMovie().getTitle())
                    .append("\t")
                    .append(rental.calculateAmount())
                    .append("\n");
        }
        //add footer lines
        sb.append("Amount owed is ")
                .append(calculateTotalAmount())
                .append("\n");
        sb.append("You earned ")
                .append(calculateTotalFrequentPoints())
                .append(" frequent renter points");
        return sb.toString();
    }

    /**
     * This method calculate total amount of all movies of rent.
     *
     * @return total amount as double.
     */
    public double calculateTotalAmount() {
        double totalAmount = 0;
        for (Rental rental : rentals) {
            totalAmount += rental.calculateAmount();
        }
        return totalAmount;
    }

    /**
     * This method calculate total frequent points.
     *
     * @return total frequent renter points as integer.
     */
    public int calculateTotalFrequentPoints() {
        int totalFrequentRenterPoints = 0;
        for (Rental rental : rentals) {
            totalFrequentRenterPoints += rental.calculateFrequentRenterPoints();
        }
        return totalFrequentRenterPoints;
    }
}
