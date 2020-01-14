package inheritance;

public class Restaurant {
    public String name;
    public int stars;
    public String priceCategory;

    public Restaurant(String name, int stars, String priceCategory) {
        this.name = name;
        this.stars = stars;
        this.priceCategory = priceCategory;
    }

    public String toString(String restaurantName) {
        return String.format("%s has a rating of %i stars out of 5 and it is %s price" +
                "category", name, stars, priceCategory);
    }

}
