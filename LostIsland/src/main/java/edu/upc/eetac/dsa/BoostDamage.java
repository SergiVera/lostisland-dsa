package edu.upc.eetac.dsa;

public class BoostDamage extends GameObject {
    //Attributes
    private int damagepoints;

    //Constructor
    public BoostDamage(int damagepoints) {
        this.damagepoints = damagepoints;
    }

    @Override
    public void modifyAttributes() {
        this.damage += this.damagepoints;
    }
}
