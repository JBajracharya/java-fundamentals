package inheritance;

public class Restaurant {
    public String restaurantName;
    public float stars;
    public float priceCategory;

    public Restaurant(String restaurantName, float stars, int priceCategory) {
        this.restaurantName = restaurantName;
        this.stars = stars;
        this.priceCategory = priceCategory;
    }

    public String toString() {
        return String.format("%s has a rating of %.1f stars out of 5 and it is %.0f price" +
                "category", this.restaurantName, this.stars, this.priceCategory);
    }

    public void addReview(Review review) {

    }

}
