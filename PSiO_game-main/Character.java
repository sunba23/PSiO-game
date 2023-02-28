import java.util.Objects;

public class Character {

    // fields
    double hp = 100;
    Weapon weapon;
    String name;
    Armor armor;
    MovementBehavior movementBehavior;

    // constructor
    public Character() {
    }

    // getters and setters
    public Weapon getWeapon() {
        return weapon;
    }
    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }
    public Armor getArmor() {
        return armor;
    }
    public void setArmor(Armor armor) {
        this.armor = armor;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public double getHp() {
        return hp;
    }
    public void setHp(double hp) {
        this.hp = hp;
    }
    public void setMovementBehavior(MovementBehavior mv) {
        movementBehavior = mv;
    }


    // methods
    public void performMove(){
        movementBehavior.move();
    }

    void giveWeapon(Weapon weapon){
        this.weapon = weapon;
        System.out.println(name + " just got a " + weapon);
    }

    void displayWeapon(){
        System.out.println(name + "'s weapon is a " + weapon);
    }

    void heal(double turns){
        if (hp<100){
            hp = hp + (turns * 10.0);
            if (hp>100){
                System.out.println(name + " healed for " + turns + " hour(s), and now has " + 100 + "HP");
                setHp(100);
            } else {
                System.out.println(name + " healed for " + turns + " hour(s), and now has " + hp + "HP");
                setHp(hp);
            }
        } else {
            System.out.println("your HP is already at full level!");
        }
    }

    public void giveInfo() {
        System.out.printf("%.6s","name: " + name + ", weapon: " + weapon + ", armor type: " + armor + ", health points: " + hp );
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Character character = (Character) o;
        return Double.compare(character.hp, hp) == 0 && Objects.equals(weapon, character.weapon) && Objects.equals(name, character.name) && Objects.equals(armor, character.armor) && Objects.equals(movementBehavior, character.movementBehavior);
    }

    @Override
    public String toString() {
        return name + ", " + armor.type() + ", " + weapon + ", " + hp;
    }
}