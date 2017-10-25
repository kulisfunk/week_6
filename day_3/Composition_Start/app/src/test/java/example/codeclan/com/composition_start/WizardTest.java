package example.codeclan.com.composition_start;

/**
 * Created by user on 28/08/2017.
 */

import static org.junit.Assert.*;
import org.junit.*;

import example.codeclan.com.composition_start.wizard_management.*;
import example.codeclan.com.composition_start.wizard_management.Behaviours.Flyable;
import example.codeclan.com.composition_start.wizard_management.Behaviours.Protector;

public class WizardTest {

    Wizard wizard;
    Wizard wizard2;
    Wizard wizard3;
    Ogre ogre;
    Broomstick broomstick;
    Dragon dragon;
    Flyable ride;
    MagicCarpet magiccarpet;
    Protector shield;

    @Before
    public void before(){

        broomstick = new Broomstick("Nimbus", 10);
        ogre = new Ogre("Big Bad John");
        dragon = new Dragon("Puff the Magic");
        magiccarpet = new MagicCarpet("Beige");
        wizard = new Wizard("Toby", dragon, dragon);
        wizard2 = new Wizard("Rab", broomstick, ogre);
        wizard3 = new Wizard("Jamie", magiccarpet, ogre);

    }

    @Test
    public void hasName(){
        assertEquals("Toby", wizard.getName());
    }

    @Test
    public void hasBroomstick() {
        Broomstick ride = (Broomstick) wizard2.getRide();//casting a Broomstick
        assertEquals("Nimbus", ride.getBrand());
    }

    @Test
    public void hasMagicCarpet(){
        MagicCarpet ride = (MagicCarpet) wizard3.getRide();//casting a MagicCarpet
        assertEquals("Beige", ride.getColour());
    }

    @Test
    public void canFlyBroomstick(){
        assertEquals(wizard2.fly(), "mounting broom, running, skipping, flying!");
    }

    @Test
    public void canFlyDragon(){
        assertEquals(wizard.fly(), "Standing up tall, beating wings, lift off!");
    }

    @Test
    public void canFlyMagicCarpet(){
        assertEquals(wizard3.fly(), "Hovering up, straightening out, flying off!");
    }

    @Test
    public void canSetRide(){
        wizard.setRide(broomstick);
        assertEquals(wizard.fly(), "mounting broom, running, skipping, flying!");
    }

    @Test
    public void hasDragonProtection(){
        Dragon dragon = (Dragon) wizard.getShield();
        assertEquals(wizard.protect(), 50);

    }

    @Test
    public void hasOgreProtection(){
        Ogre ogre = (Ogre) wizard2.getShield();
        assertEquals(wizard2.protect(), 70);
    }
}
