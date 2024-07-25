package Lab3_Michael_Zhao.SocialMedia;

public class Main {
    public static void main(String[] args) {
        // Creating a Twitter object
        Twitter twitter = new Twitter();

        // Use the Twitter object to post a status
        twitter.postStatus("Hello, world!");

        // Follow a user
        twitter.follow("ezpz");

        // Add a comment
        twitter.addComment("Nice dress!");

        // Edit the comment
        twitter.editComment("Nice dress!", "Bad Dress!");

        // Delete the comment
        twitter.deleteComment("Bad dress!");

        twitter.retweet("stop it");

        // Unfollow the user
        twitter.unfollow("ezpz");
    }
}
