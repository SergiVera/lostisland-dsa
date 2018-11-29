package edu.upc.eetac.dsa;

public abstract class GameObject {
    //Attributes
    int health;
    int currentHealth;
    int maxHealth = 100; //Maximum 100 points of life
    int damage;

    /**
     * Modify the attributes of the player depending on the object
     */
    public abstract void modifyAttributes();
}
