public class Review {
    private int rating = -1;
    private String comment = "NoComment";

    public void setRatingAndComment(int revRating, String revComment) {
        this.rating = revRating;
        this.comment = revComment;
    }
    public int getRating() {
        return rating;
    }
    public String getComment() {
        return comment;
    }

}