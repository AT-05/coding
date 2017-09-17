package org.fundacionjala.coding.Marco.movie;

/**
 * Created by Administrator on 9/8/2017.
 */
public class Rental {
    private Movie movie;
    private int daysRented;

    /**
     * This is the constructor of Rental Class.
     *
     * @param movie is an Movie object type.
     * @param daysRented is the quantityof rented days.
     */
    public Rental(Movie movie, int daysRented) {
        this.movie = movie;
        this.daysRented = daysRented;
    }

    /**
     * This method returns a Movie object.
     *
     * @return the Movie of this rental.
     */
    public Movie getMovie() {
        return movie;
    }

    /**
     * This method returns the quantity of days rented.
     *
     * @return number of days.
     */
    public int getDaysRented() {
        return daysRented;
    }

    /**
     * This method calculates the amount of the Movie.
     *
     * @return amount based on days rented.
     */
    public double calculateAmount(){
        return movie.calculateAmount(daysRented);
    }

    /**
     * This method calculates the frequent renter points of the Movie.
     *
     * @return requent renter points based on days rented.
     */
    public int calculateFrequentRenterPoints(){
        return movie.calculateFrequentRenterPoints(daysRented);
    }
}
