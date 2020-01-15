package inheritance;

public class Review  {
    public String author;

    public Review (String author) {
        this.author = author;

    }

    public String toString() {
        return String.format("%s gave star rating ", this.author);
    }

    public void addReview() {

    }


}
