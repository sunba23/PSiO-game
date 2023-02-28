public class AR15 implements Weapon{

    final String name = "AR-15";
    final double baseDamage = 33.3;
    FightBehavior fightBehavior = new GunFight();

    public String getName() {
        return name;
    }
    public double getBaseDamage() {
        return baseDamage;
    }
    public FightBehavior getFightBehavior() {
        return fightBehavior;
    }
    public void setFightBehavior(FightBehavior fightBehavior) {
        this.fightBehavior = fightBehavior;
    }

    @Override
    public String toString() {
        return name;
    }
}
