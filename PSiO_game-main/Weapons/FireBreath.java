public class FireBreath implements Weapon{

    final String name = "fire breath";
    final double baseDamage = 50;
    FightBehavior fightBehavior = new FireFight();

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
