import java.util.Scanner;
import java.util.ArrayList;

public class ReviewSystem {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        ArrayList<Review> reviewList = new ArrayList<Review>();
        Review currReview;
        int currRating;
        String currComment;

        System.out.println("Type rating + comments. To end: -1");
        currRating = read.nextInt();

        while (currRating >= 0) {
            currReview = new Review();
            currComment = read.nextLine();
            currReview.setRatingAndComment(currRating, currComment);
            reviewList.add(currReview);
            currRating = read.nextInt();
        }

        System.out.println();
        System.out.println("Type rating. To end: -1");

        currRating = read.nextInt();
        while (currRating >= 0) {
            for (int i = 0; i < reviewList.size(); ++i) {
                currReview = reviewList.get(i);
                if (currRating == currReview.getRating()) {
                    System.out.println(currReview.getComment());
                }
            }
            currRating = read.nextInt();
        }

    }

}
