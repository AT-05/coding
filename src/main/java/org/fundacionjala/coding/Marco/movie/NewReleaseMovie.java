package org.fundacionjala.coding.franco;

/**
 * Created by Administrator on 9/8/2017.
 */
public class NewReleaseMovie extends Movie {

    /**
     * NewReleaseMovie Class constructor.
     *
     * @param title is the Movie title.
     */
    public NewReleaseMovie(String title) {
        super(title);
    }

    /**
     * This method calculates amount for this type of movie.
     *
     * @param daysRented is the quantity of rental days.
     * @return amount depending on the quantity of days rented.
     */
    @Override
    double calculateAmount(int daysRented) {
        return daysRented * 3;
    }

    @Override
    int calculateFrequentRenterPoints(int daysRented) {
        return daysRented > 1 ? 2 : 1;
    }
}
