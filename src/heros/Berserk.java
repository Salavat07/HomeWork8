package heros;

import boss.Boss;

import java.util.Random;

public class Berserk extends Hero {
    public Berserk(int health, int damage) {
        super(health, damage, Abilities.SAVE_DAMAGE_AND_REVERT);
    }
    @Override
    public void useSuperPower(Hero[] heroes, Boss boss) {
        Random r = new Random();
        int a = r.nextInt(2)+2;
        int b = heroes[3].getDamage() * a;
        boss.setHealth(boss.getHealth() - a);
        System.out.println(+ a + " Berserk critical on " + b + " Boss  health" + boss.getHealth());
    }
}
