package Lab3_Michael_Zhao.SocialMedia;

public interface Commentable {
    // Method to add a comment
    void addComment(String comment);

    // Method to edit a comment
    void editComment(String oldComment, String newComment);

    // Method to delete a comment
    void deleteComment(String comment);
}
