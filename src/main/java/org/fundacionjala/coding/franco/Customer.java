package org.fundacionjala.coding.franco;

import java.util.List;
import java.util.ArrayList;

/**
 * Created by Administrator on 9/8/2017.
 */
public class Customer {
    private final String customerName;
    private List<Rental> rentals;

    /**
     * This is the constructor of Customer Class.
     *
     * @param customerName that is the one who is doing the movie rental.
     */
    public Customer(String customerName) {
        this.customerName = customerName;
        rentals = new ArrayList<>();
    }

    /**
     * This method adds a Rental object to the rentals List.
     *
     * @param newRental is an object of class Rental.
     */
    public void addRental(Rental newRental) {
        rentals.add(newRental);
    }

    /**
     * This method returns the rentals of the customer.
     *
     * @return a list of rental objects.
     */
    public List getRentalList() {
        return rentals;
    }

    /**
     * This method calculates total amount of a list of rentals.
     *
     * @param rentals is a list of rental objects.
     * @return the total amount of the movies rented treating each
     * one depending on their type.
     */
    public double calculateTotalAmount(List<Rental> rentals) {
        double totalAmount = 0;

        int i = 0;
        while (i < rentals.size()) {
            //determine amounts for each line
            double thisAmount = rentals.get(i).getMovie().calculateAmount(rentals.get(i).getDaysRented());
            //show figures for this rental
            totalAmount += thisAmount;
            i++;
        }
        return totalAmount;
    }

    /**
     * This method calculates frequent points of a list of Rentals.
     *
     * @param rentals is a list of rental objects.
     * @return the total frequent points earned for the
     * total of rentals.
     */
    public int calculateFrequentPoints(List<Rental> rentals) {
        int frequentRenterPoints = 0;

        int i = 0;
        while (i < rentals.size()) {
            // add frequent renter points
            frequentRenterPoints += 1;
            // add bonus for a two day new release rental
            frequentRenterPoints += rentals.get(i).getMovie() instanceof NewReleaseMovie
                    && rentals.get(i).getDaysRented() > 1 ? 1 : 0;
            i++;
        }
        return frequentRenterPoints;
    }
}
