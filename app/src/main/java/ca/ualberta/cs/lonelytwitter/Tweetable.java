package ca.ualberta.cs.lonelytwitter;

/**
 * This interface provides a structure for the tweet object.
 * @see Tweet
 * Created by sal on 08/04/17.
 */

public interface Tweetable {
    String getMessage();
    void setMessage(String string) throws TweetTooLongException;
}
