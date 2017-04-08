package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Stores a normal tweet saved by the user.
 * Created by sal on 08/04/17.
 */

public class NormalTweet extends Tweet {
    /**
     * Instantiates a new Normal tweet.
     *
     * @param message the message
     */
    public NormalTweet(String message) {
        super(message);
    }

    /**
     * Instantiates a new Normal tweet.
     *
     * @param date    the date
     * @param message the message
     */
    public NormalTweet(String message, Date date) {
        super(message, date);
    }

    /**
     * returns whether the tweet is an important tweet.
     * @return false
     */

    @Override
    public Boolean isImportant(){
        return false;
    }
}