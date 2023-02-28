public class Pitchfork implements Weapon{

    final String name = "pitchfork";
    final double baseDamage = 9;
    FightBehavior fightBehavior;

    public Pitchfork(){
        fightBehavior = new StabFight();
    }

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
