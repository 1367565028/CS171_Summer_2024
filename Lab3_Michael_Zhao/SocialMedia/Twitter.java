package Lab3_Michael_Zhao.SocialMedia;

public class Twitter extends SocialMedia implements Commentable {

    @Override
    public void postStatus(String status) {
        // Logic to post a status on Twitter
        System.out.println("Posted a tweet: " + status);
    }

    @Override
    public void follow(String username) {
        // Logic to follow a user on Twitter
        System.out.println("Followed a user on Twitter: " + username);
    }

    @Override
    public void unfollow(String username) {
        // Logic to unfollow a user on Twitter
        System.out.println("Unfollowed a user on Twitter: " + username);
    }

    @Override
    public void addComment(String comment) {
        // Logic to add a comment on Twitter
        System.out.println("Added a comment on Twitter: " + comment);
    }

    @Override
    public void editComment(String oldComment, String newComment) {
        // Logic to edit a comment on Twitter
        System.out.println("Edited a comment on Twitter: " + oldComment + " to " + newComment);
    }

    @Override
    public void deleteComment(String comment) {
        // Logic to delete a comment on Twitter
        System.out.println("Deleted a comment on Twitter: " + comment);
    }

    public void retweet(String originalStatus) {
        System.out.println("Retweeted: " + originalStatus);
    }
}
