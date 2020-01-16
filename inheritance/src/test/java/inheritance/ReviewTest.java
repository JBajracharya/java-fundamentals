package inheritance;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ReviewTest {
    @Test public void testReviewConst(){
        Review review = new Review("Good food", "Brian", 4.2f);

        assertEquals("Good food", review.body);
        assertEquals("Brian", review.author);
        assertEquals(4.2f, review.stars, 0.0);
    }

    @Test public void testToString(){
        Review review = new Review("Good food", "Brian", 4.2f);
        assertEquals("Brian gave 4.2 star rating.", review.toString());

    }

}