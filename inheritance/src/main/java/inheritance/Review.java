package inheritance;

public class Review extends Restaurant {
    public String author;

    public Review (String author, float stars, String restaurantName, int priceCategory) {
        super(restaurantName, stars, priceCategory);
        this.author = author;

    }

    public String toString() {
        return String.format("%s gave %.1f star rating to %s.", this.author, this.stars, this.restaurantName);
    }

    public void addReview() {

    }
}
