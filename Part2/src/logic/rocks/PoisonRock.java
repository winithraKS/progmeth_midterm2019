package logic.rocks;

import logic.zombies.Zombie;

public class PoisonRock extends NormalRock {
    private int damageOverTime;
    public PoisonRock(int damage,int damageOverTime) {
        super(damage);
        setDamageOverTime(damageOverTime);
    }

    public int getDamageOverTime() {
        return damageOverTime;
    }

    public void setDamageOverTime(int damageOverTime) {
        this.damageOverTime = Math.max(0,damageOverTime);
    }

    @Override
    public String toString() {
        return "Poison Rock ("+getDamage()+", DoT = "+getDamageOverTime()+")";
    }

    @Override
    public int dealDamage(Zombie zombie) {
        zombie.setDecay(zombie.getDecay()+getDamageOverTime());
        return super.dealDamage(zombie);
    }
}
