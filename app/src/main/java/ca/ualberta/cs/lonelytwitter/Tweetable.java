package ca.ualberta.cs.lonelytwitter;

/**
 * Created by sal on 08/04/17.
 */

public interface Tweetable {
    public String getMessage();
    public void setMessage(String string) throws TweetTooLongException;
}
