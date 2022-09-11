package com.company;

public class Main {

    public static void main(String[] args) {
	    Player player = new Player();
        player.fullName = "Mathieu";
        player.health2 = 20;
        player.weapon = "Sword";

        int damage = 10;
        player.loseHealth(damage);
        System.out.println("Remaining health =  " + player.healthRemaining());

        damage = 11;
        player.health2 = 200;
        player.loseHealth(damage);
        System.out.println("Remaining health =  " + player.healthRemaining());

    }
}
