package inheritance;

import javax.sound.sampled.ReverbType;
import java.util.LinkedList;

public class Restaurant {

    public String restaurantName;
    public float stars;
    public float priceCategory;

    // add all the reviews in the list
    LinkedList<Review> restaurantReviews = new LinkedList<>();

    public Restaurant(String restaurantName, float stars, int priceCategory) {
        this.restaurantName = restaurantName;
        this.stars = stars;
        this.priceCategory = priceCategory;
    }

    public void addReview(Review review) {
        float totalStars = this.stars;
        restaurantReviews.add(review);
        //update average star rating of a restaurant
        this.stars = (totalStars + restaurantReviews.getLast().stars)/2;
        System.out.println("2222" + this.stars);

    }



    public String toString() {
        return String.format("%s has a rating of %.1f stars out of 5 and it is %.0f priceCategory",
                this.restaurantName, this.stars, this.priceCategory);
    }

}
