package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by sal on 08/04/17.
 */

public class Angry extends Mood {
    public Angry(){

    }

    public Angry(Date date){
        super(date);
    }

    @Override
    public String display(){
        return "Angry!";
    }
}
