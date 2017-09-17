package org.fundacionjala.coding.Marco.movie;

/**
 * Created by Administrator on 9/8/2017.
 */
public class ChildrensMovie extends Movie {

    /**
     * ChildrensMovie Class constructor.
     *
     * @param title is the Movie title.
     */
    public ChildrensMovie(String title) {
        super(title);
    }

    /**
     * This method calculates amount for this type of movie.
     *
     * @param daysRented is the quantity of rental days.
     * @return amount depending on the quantity of days rented.
     */
    @Override
    public double calculateAmount(int daysRented) {
        return daysRented > 3 ? (daysRented - 3) * 1.5 : 1.5;
    }

    @Override
    int calculateFrequentRenterPoints(int daysRented) {
        return 1;
    }
}
