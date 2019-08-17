package heros;

import battleGame.Ententity;

public abstract class Hero extends Ententity
        implements SuperPower {
    private Abilities ability;

    public Hero(int health, int damage, Abilities ability) {
        super (health, damage);
        this.ability = ability;
    }
    public Abilities getAbility() {
        return ability;
    }
}