package inheritance;

import java.util.LinkedList;

public class Restaurant extends BusinessEntity implements ReviewableEntity {
    public float priceCategory;

    // add all the reviews in the list
    LinkedList<Review> restaurantReviews = new LinkedList<>();


    public Restaurant(String restaurantName, float stars, int priceCategory) {
        super(restaurantName, stars);
        this.priceCategory = priceCategory;
    }

    @Override
    public void addReview(Review review) {
        restaurantReviews.add(review);
    }

    @Override
    public void updateReview() {
        for(Review review : restaurantReviews) {
            this.stars += review.stars;
        }
        float averageStars = this.stars/(restaurantReviews.size() + 1);
        this.stars = averageStars;
        System.out.println("review = " + this.stars);
    }

    public String toString() {
        return String.format("%s has a rating of %.1f stars out of 5 and it is %.0f priceCategory",
                this.name, this.stars, this.priceCategory);
    }

}
