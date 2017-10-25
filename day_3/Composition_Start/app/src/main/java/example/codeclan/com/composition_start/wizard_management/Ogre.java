package example.codeclan.com.composition_start.wizard_management;

import example.codeclan.com.composition_start.wizard_management.Behaviours.Protector;

/**
 * Created by user on 28/08/2017.
 */

public class Ogre extends MythicalBeast implements Protector{

    public Ogre(String name){
        super(name);
    }

    public int protect() { return 70;}

}
