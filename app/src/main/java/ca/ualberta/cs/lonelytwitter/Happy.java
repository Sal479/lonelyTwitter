package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 *
 * This class stores the mood "Happy"
 *
 * Created by sal on 08/04/17.
 */


public class Happy extends Mood {
    /**
     * Instantiates happy
     */
    public Happy(){

    }

    /**
     * Instantiates happy
     * @param date: The current date
     */
    public Happy(Date date){
        super(date);
    }

    /**
     * Instantiates a new happy
     * @return: A String
     */
    @Override
    public String display(){
        return "Happy!";
    }
}
