package inheritance;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RestaurantTest {

    @Test
    public void testConstructor() {
        Restaurant restaurant = new Restaurant("testRestaurant", 3, 2);
        String actual = restaurant.restaurantName;
        String expected = "testRestaurant";
        assertEquals(expected, actual);
    }

    @Test public void testToString() {
        Restaurant restaurant = new Restaurant("testRestaurant", 3, 2);
        String actual = restaurant.toString();
        String expected = "testRestaurant has a rating of 3.0 stars out of 5 and it is 2 priceCategory";
        assertEquals(expected, actual);
    }

    @Test public  void  testAddReview() {
        Restaurant restaurant = new Restaurant("testRestaurant", 3, 2);
        restaurant.addReview("Brian");
        restaurant.addReview("mark");
        System.out.println("restaurant = " + restaurant);

        for (Review r : restaurant.restaurantReviews) {
            System.out.println("r = " + r);

        }

    }
}