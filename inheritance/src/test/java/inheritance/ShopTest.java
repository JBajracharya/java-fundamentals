package inheritance;

import org.junit.Test;

import static org.junit.Assert.*;

public class ShopTest {
    Shop shop = new Shop("TestGrocery", "has variety of products",
            3,3);
    @Test public void testShopConstructor() {
        assertEquals(3, shop.priceCategory);
        assertEquals("TestGrocery", shop.name);
        assertEquals("has variety of products", shop.description);
    }

    @Test public void testToString() {
        String actual = shop.toString();
        String expected = "TestGrocery is a has variety of products. It belongs to a price category of 3 and has a overall rating of 3.0.";
        assertEquals(expected, actual);
    }

    @Test public void testAddReview() {
        Review review1 = new Review("Varieties of products", "Luke", 5);
        Review review2 = new Review("Sucks, no good system", "Henry", 1);

        shop.addReview(review1);
        shop.addReview(review2);

        float expected = 1.0f;
        float actual = shop.shopReviews.getLast().stars;

        assertEquals(expected, actual, 0.0);
    }

    @Test public void testUpdateReviews() {
        Review review1 = new Review("Varieties of products", "Luke", 5);
        Review review2 = new Review("Sucks, no good system", "Henry", 1);

        shop.addReview(review1);
        shop.addReview(review2);

        float actual = shop.stars;
        float expected = 3;

        assertEquals(expected, actual, 0.0);
    }
}