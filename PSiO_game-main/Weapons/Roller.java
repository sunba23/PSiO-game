public class Roller implements Weapon{

    final String name = "roller";
    final double baseDamage = 14;
    FightBehavior fightBehavior = new RollerFight();

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
