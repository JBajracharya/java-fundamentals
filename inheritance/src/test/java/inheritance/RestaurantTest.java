package inheritance;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RestaurantTest {
    Restaurant restaurant = new Restaurant("SteakHouse", 3, 2);

    @Test
    public void testConstructor() {
        String actual = restaurant.restaurantName;
        String expected = "SteakHouse";
        assertEquals(expected, actual);
    }

    @Test public void testToString() {
        String actual = restaurant.toString();
        String expected = "SteakHouse has a rating of 3.0 stars out of 5 and it is 2 priceCategory";
        assertEquals(expected, actual);
    }

    @Test public  void  testAddReview() {
        Review review1 = new Review("Food is great", "Johnny", 4.5f);
        Review review2 = new Review("best restaurant", "Mary", 4.5f);
        Review review3 = new Review("best restaurant", "Mary", 3f);

        restaurant.addReview(review1);
        restaurant.addReview(review2);
        restaurant.addReview(review3);

        //test accounts for the stars the restaurant already has and add new ratings
        //to the restaurant and gets the average of the star ratings
        String expected =  "SteakHouse has a rating of 3.6 stars out of 5 and it is 2 priceCategory";
        String actual = restaurant.toString();
        assertEquals(expected, actual);
    }
}