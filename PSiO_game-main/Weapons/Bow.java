public class Bow implements Weapon{

    final String name = "bow";
    final double baseDamage = 18;
    FightBehavior fightBehavior = new ArrowFight();

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
