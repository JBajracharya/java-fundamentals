package inheritance;

public class Review  {
    public String author;
    public String body;
    public float stars;

    public Review (String body, String author, float stars) {
        this.body = body;
        this.author = author;
        this.stars = stars;

    }

    public String toString() {
        String summary = String.format("%s gave %.1f star rating.", this.author, this.stars);
        return summary;
    }

}

