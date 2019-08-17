package heros;

import boss.Boss;

public class Medical extends Hero {
    public Medical(int health, int damage) {
        super(health, damage, Abilities.HEAL);
    }

    @Override
    public void useSuperPower(Hero[] heroes, Boss boss) {
        for (int i = 0; i < heroes.length; i++) {
            heroes[i].setHealth(heroes[i].getHealth() + 10);
            System.out.println("Medical heal " + heroes[i] + " the " + heroes[i].getHealth());
        }
    }
}