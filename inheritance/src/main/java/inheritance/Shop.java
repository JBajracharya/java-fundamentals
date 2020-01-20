package inheritance;


import java.util.LinkedList;

public class Shop extends BusinessEntity implements ReviewableEntity {
    public String description;
    public int priceCategory;

    public Shop(String name, String description, int priceCategory, int stars) {
        super(name, stars);
        this.description = description;
        this.priceCategory = priceCategory;
    }

    LinkedList<Review> shopReviews = new LinkedList<>();

    public String toString() {
        return String.format("%s is a %s. It belongs to a price category of %d " +
                        "and has a overall rating of %.1f.", this.name,
                this.description, this.priceCategory, this.stars);
    }

    @Override
    public void addReview(Review review) {
        shopReviews.add(review);
    }

    @Override
    public void updateReview() {
        for(Review review : shopReviews) {
            this.stars += review.stars;
        }
        this.stars /= shopReviews.size() + 1;
        System.out.println("review = " + this.stars);
    }


}
