package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by sal on 08/04/17.
 */

public class Happy extends Mood {
    public Happy(){

    }

    public Happy(Date date){
        super(date);
    }

    @Override
    public String display(){
        return "Happy!";
    }
}
