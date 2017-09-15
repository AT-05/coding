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
     * @return the total amount of the movies rented treating each
     * one depending on their type.
     */
    public double calculateTotalAmount() {
        double totalAmount = 0;

        for (Rental rental : rentals) {
            //determine amounts for each line
            //show figures for this rental
            totalAmount += rental.calculateAmount();
        }
        return totalAmount;
    }

    /**
     * This method calculates frequent points of a list of Rentals.
     *
     * @return the total frequent points earned for the
     * total of rentals.
     */
    public int calculateTotalFrequentPoints() {
        int totalFrequentRenterPoints = 0;
        for(Rental rental: rentals){
            totalFrequentRenterPoints += rental.calculateFrequentRenterPoints();
        }
        return totalFrequentRenterPoints;
    }

    public String statement(){
        return "";
    }
}
