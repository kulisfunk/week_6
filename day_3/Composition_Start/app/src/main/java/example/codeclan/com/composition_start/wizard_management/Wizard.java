package example.codeclan.com.composition_start.wizard_management;

import example.codeclan.com.composition_start.wizard_management.Behaviours.Flyable;
import example.codeclan.com.composition_start.wizard_management.Behaviours.Protector;

/**
 * Created by user on 28/08/2017.
 */

public class Wizard {
    String name;
    private Flyable ride;
    private Protector shield;

    public Wizard(String name, Flyable ride, Protector shield){
        this.name = name;
        this.ride = ride;
        this.shield = shield;
    }

    public void setRide(Flyable ride){
        this.ride = ride;
    }

    public void setShield(Protector shield){
        this.shield = shield;
    }

    public String getName(){
        return this.name;
    }

    public Flyable getRide(){
        return this.ride;
    }

    public Protector getShield() {return this.shield;}

    public String fly(){
        return this.ride.fly();
    }

    public int protect(){
        return this.shield.protect();
    }

}
