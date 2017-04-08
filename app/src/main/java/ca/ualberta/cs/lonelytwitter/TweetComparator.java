package ca.ualberta.cs.lonelytwitter;

import java.util.Comparator;

/**
 * Created by sal on 08/04/17.
 */

public class TweetComparator implements Comparator<Tweet> {

    public int compare(Tweet t1, Tweet t2) {
        return t1.getDate().compareTo(t2.getDate());
    }
}
