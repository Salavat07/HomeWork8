package heros;

import boss.Boss;

public class Warrior extends Hero {
    public Warrior(int health, int damage) {
        super(health, damage, Abilities.CRITICAL_DAMAGE);
    }
    @Override
    public void useSuperPower(Hero[] heroes, Boss boss) {
        int a = (heroes[0].getDamage() + boss.getDamage());
        boss.setHealth(boss.getHealth() - a);
        System.out.println("Warrior Critical Damage " + a);
    }
}