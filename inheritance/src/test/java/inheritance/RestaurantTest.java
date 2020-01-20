package inheritance;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RestaurantTest {
    Restaurant restaurant = new Restaurant("SteakHouse", 4, 2);

    @Test
    public void testConstructor() {
        String actual = restaurant.name;
        String expected = "SteakHouse";
        assertEquals(expected, actual);
    }

    @Test public void testToString() {
        String actual = restaurant.toString();
        String expected = "SteakHouse has a rating of 4.0 stars out of 5 and it is 2 priceCategory";
        assertEquals(expected, actual);
    }

    @Test public void testAddReview() {
        Review review1 = new Review("Food is great", "Johnny", 4.5f);
        restaurant.addReview(review1);
        String actual = restaurant.restaurantReviews.getLast().body;
        String expected = "Food is great";
        assertEquals(expected, actual);
    }

    @Test public  void  testUpdateReview() {
        Review review1 = new Review("Food is great", "Johnny", 4.5f);
        Review review2 = new Review("best restaurant", "Mary", 4.5f);
        Review review3 = new Review("best restaurant", "Mary", 3f);

        restaurant.addReview(review1);
        restaurant.addReview(review2);
        restaurant.addReview(review3);
        restaurant.updateReview();

//        restaurant.restaurantReviews.add(review1);
//        restaurant.restaurantReviews.add(review2);
//        restaurant.restaurantReviews.add(review3);
//        restaurant.updateReview();

        String expected =  "SteakHouse has a rating of 4.0 stars out of 5 and it is 2 priceCategory";
        String actual = restaurant.toString();
        assertEquals(expected, actual);
    }


}
