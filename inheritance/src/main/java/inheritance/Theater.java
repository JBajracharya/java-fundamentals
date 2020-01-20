package inheritance;

import java.util.LinkedList;

public class Theater extends BusinessEntity implements ReviewableEntity{
    public String moviesList;

    public Theater(String name, String moviesList, float stars) {
        super(name, stars);
        this.moviesList = moviesList;
    }

    LinkedList<String> currentMoviesList = new LinkedList<>();
    public void addMovies (String movie) {
        currentMoviesList.add(movie);
    }

    public void removeMovies (String movie) {
        currentMoviesList.remove(movie);
    }

    public void setMoviesList() {
        StringBuilder moviesList = new StringBuilder();
        for(int i = 0; i < currentMoviesList.size(); i++) {
            if (i == currentMoviesList.size() - 1) {
                moviesList.append("and ").append(currentMoviesList.get(i));
            } else {
                moviesList.append(currentMoviesList.get(i)).append(", ");
            }
        }
        this.moviesList = moviesList.toString();
    }

    public String toString() {
        setMoviesList();
        return String.format("%s which has a rating of %.1f stars is currently showing these movies: %s",
                this.name, this.stars, this.moviesList);
    }

    LinkedList<Review> theaterReviews = new LinkedList<>();

    @Override
    public void addReview(Review review) {
        theaterReviews.add(review);
    }

    @Override
    public void updateReview() {
        for(Review review : theaterReviews) {
            this.stars += review.stars;
        }
        this.stars /= 1 + theaterReviews.size();
    }

}
