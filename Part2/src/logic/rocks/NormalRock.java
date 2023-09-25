package logic.rocks;

import logic.zombies.Zombie;

public class NormalRock {
    protected int damage;

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = Math.max(0,damage);
    }

    public NormalRock(int damage) {
        setDamage(damage);
    }
    public int dealDamage(Zombie zombie){
        int damage = Math.max(0,getDamage()-zombie.getDefense());
        zombie.setHealth(zombie.getHealth()-damage);
        return damage;
    }

    @Override
    public String toString() {
        return "Normal Rock ("+getDamage()+")";
    }
}
