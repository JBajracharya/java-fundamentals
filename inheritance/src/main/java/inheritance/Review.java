package inheritance;

public class Review  {
    public String author;
    public String body;
    public float stars;
    public String movie;

    public Review (String description, String author, float stars) {
        this.body = description;
        this.author = author;
        this.stars = stars;

    }

    //Constructor overload
    public Review (String description, String author, float stars, String movie) {
        this.body = description;
        this.author = author;
        this.stars = stars;
        this.movie = movie;
    }

    public String toString() {
        String summary = String.format("%s gave %.1f star rating.", this.author, this.stars);
        return summary;
    }

}

