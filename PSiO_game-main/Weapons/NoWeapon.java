public class NoWeapon implements Weapon{

    final String name = "bare hands";
    final double baseDamage = 2.137;
    FightBehavior fightBehavior = new BareHandsFight();

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
