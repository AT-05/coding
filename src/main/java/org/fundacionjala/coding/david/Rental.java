package org.fundacionjala.coding.david;

/**
 * This class rental.
 */
class Rental {
    private Movie movie;
    private int daysRented;

    /**
     * This constructor initialize.
     * @param movie are values.
     * @param daysRented .
     */
    public Rental(Movie movie, int daysRented) {
        movie = movie;
        daysRented = daysRented;
    }

    /**
     * This method return daysRented.
     * @return .
     */
    public int getDaysRented() {
        return daysRented;
    }

    /**
     * this method return movie.
     * @return.
     */
    public Movie getMovie() {
        return movie;
    }
}