package com.example.goober.stevesmusicexchange;

/**
 * Created by goober on 27/10/2017.
 */

public abstract class Instrument {

    private Colour colour;
    private Material material;
    private Family family;
    private String type;

    public Instrument(Colour colour, Material material, Family family, String type) {
        this.colour = colour;
        this.material = material;
        this.family = family;
        this.type = type;
    }

    public Colour getColour() {
        return colour;
    }

    public void setColour(Colour colour) {
        this.colour = colour;
    }

    public Material getMaterial() {
        return material;
    }

    public void setMaterial(Material material) {
        this.material = material;
    }

    public Family getFamily() {
        return family;
    }

    public void setFamily(Family family) {
        this.family = family;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
