package inheritance;

import org.junit.Test;

import static org.junit.Assert.*;

public class TheaterTest {
    Theater theater = new Theater("Imax", null, 5.0f);

    @Test
    public void addMovies() {
        theater.addMovies("John Wick");
        theater.addMovies("Terminator");
        theater.addMovies("Lord of the rings");
        theater.setMoviesList();

        String actual = theater.moviesList;
        String expected = "John Wick, Terminator, and Lord of the rings";
        assertEquals("Expected: John Wick, Terminator, and Lord of the rings",expected, actual);

    }

    @Test
    public void removeMovies() {
        theater.addMovies("John Wick");
        theater.addMovies("Terminator");
        theater.addMovies("Lord of the rings");

        theater.removeMovies("John Wick");

        theater.setMoviesList();
        String actual = theater.moviesList;
        String expected = "Terminator, and Lord of the rings";
        assertEquals("Expected: John Wick, Terminator, and Lord of the rings",expected, actual);

    }

    @Test
    public void testToString() {
        theater.addMovies("John Wick");
        theater.addMovies("Terminator");

        String actual = theater.toString();
        String expected = "Imax which has a rating of 5.0 stars is currently showing these movies: John Wick, and Terminator";

        assertEquals(expected, actual);
    }

    @Test
    public void updateTheaterReviews() {
        Review review1 = new Review("Sound quality is amazing", "Brad", 5);
        Review review2 = new Review("Doesnt have reclining seat", "Mani", 2);

        theater.addReview(review1);
        theater.addReview(review2);
        theater.updateReview();

        float actual = theater.stars;
        float expected = 4.0f;

        assertEquals(expected, actual, 0.0);
    }

    @Test
    public void reviewIncludingMovie() {
        Review review1 = new Review("Sound quality is amazing", "Brad", 5);
        Review review2 = new Review("Doesnt have reclining seat", "Mani", 2, "Star Wars");

        theater.addReview(review1);
        theater.addReview(review2);

        String actual = theater.theaterReviews.getLast().movie + " at " + theater.name;
        String expected = "Star Wars at Imax";

        assertEquals(expected, actual);
    }
}