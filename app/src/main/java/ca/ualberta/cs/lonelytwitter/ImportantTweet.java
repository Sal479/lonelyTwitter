package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 *
 * Same as NormalTweet with the exception of the isImportant method.
 * @see Tweet
 * @see NormalTweet
 * Created by sal on 08/04/17.
 */

public class ImportantTweet extends Tweet {
    /**
     * Instantiates a new Important tweet.
     *
     * @param message the message
     */
    public ImportantTweet(String message) {
        super(message);
    }

    public ImportantTweet(Date date, String message) {
        /**
         * Instantiates a new Important tweet.
         *
         * @param date    the date
         * @param message the message
         */
        super(date, message);
    }

    @Override
    public Boolean isImportant(){
        return true;
    }
}

