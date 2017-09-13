package org.fundacionjala.coding.david;

/**
 * This class is abstract.
 */
public abstract class Movie {

    private String title;
    private int priceCode;

    /**
     * This constructor initialize.
     * @param title .
     * @param priceCode and title.
     */
    public Movie(String title, int priceCode) {
        this.title = title;
        this.priceCode = priceCode;
    }

    /**
     * this method return title.
     * @return string.
     */
    public String getTitle() {
        return title;
    }

    /**
     * this method declare.
     * @param rental value integer.
     * @return .
     */
    public abstract double  getAmount(int rental);
}
