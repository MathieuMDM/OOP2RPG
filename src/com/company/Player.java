package com.company;

public class Player {

    public String fullName;
    public int health2;
    public String weapon;

    public void loseHealth(int damage){
        this.health2 = this.health2 - damage;
        if(this.health2 <= 0){
            System.out.println("Player knocked out");
            // reduce number of lives remaining for the player
        }
    }

    public int healthRemaining() {
        return this.health2;
    }

}
