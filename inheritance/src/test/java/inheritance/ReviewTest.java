package inheritance;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

import static org.junit.Assert.*;

public class ReviewTest {
    @Test public void testReviewConst(){
        Review review = new Review("Brian", 2.0f, "ThaiCorner", 2);
        float actual = review.stars;
        System.out.println("actual = " + actual);
        assertEquals(2.0, actual, 0.0);
    }

    @Test public void testToString(){
        Review review = new Review("Brian", 2.0f, "ThaiCorner", 2);
        assertEquals("Brian gave 2.0 star rating to ThaiCorner.", review.toString());

    }

}