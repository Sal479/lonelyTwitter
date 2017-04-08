package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 *
 * This class stores the mood "Angry"
 *
 * Created by sal on 08/04/17.
 */

public class Angry extends Mood {
    /*
    * Instantiates angry
     */
    public Angry(){

    }

    /**
     * Instantiates angry
     * @param date: The current date
     */
    public Angry(Date date){
        super(date);
    }


    /**
     * Returns the string to display that shows the current mood
     * @return string
     */
    @Override
    public String display(){
        return "Angry!";
    }
}
