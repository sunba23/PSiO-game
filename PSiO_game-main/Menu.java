import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Menu {

    Random ran = new Random();
    Scanner scanner = new Scanner(System.in);
    ArrayList<Character> createdCharacters = new ArrayList<>();

    void run() {
        System.out.println("menu");
        System.out.println("1. Create a character" + "\n" + "2. Show all created characters");

        int a = scanner.nextInt();
        while (a != 1 && a != 2) {
            System.out.println("please enter a valid number!");
            a = scanner.nextInt();
        }

        System.out.println("\n");
        switch (a) {
            case 1: {
                characterCreationMenu();
                break;
            }
            case 2: {
                showAllCreatedCharacters();
                break;
            }
        }
    }

    void characterCreationMenu() {
        System.out.println("select your characters class:" + "\n" + "1. King" + "\n" + "2. Knight" + "\n" + "3. Dragon" + "\n" + "4. Peasant" + "\n" + "5. Cook" + "\n" + "6. Sailor" + "\n" + "7. Elf");
        int a = scanner.nextInt();
        while (a != 1 && a != 2 && a != 3 && a != 4 && a != 5 && a != 6 && a != 7) {
            System.out.println("please enter a valid number!");
            a = scanner.nextInt();
        }
        createCharacter(a);
        System.out.println("\n" + "\n" + "your character has been created.");

        System.out.println("1. create another character" + "\n" + "2. show all created characters" + "\n" + "3. go back to menu");
        int c = scanner.nextInt();
        while (c != 1 && c != 2 && c != 3) {
            System.out.println("please enter a valid number!");
            c = scanner.nextInt();
        }
        System.out.println("\n" + "\n");
        switch (c) {
            case 1: {
                characterCreationMenu();
                break;
            }
            case 2: {
                showAllCreatedCharacters();
                break;
            }
            case 3: {
                run();
                break;
            }
        }
    }

    void createCharacter(int a) {
        Character c = new Character();
        System.out.println("\n" + "\n" + "name your character: ");
        c.setName(scanner.next());

        System.out.println("\n" + "\n" + "handle your character a weapon:");
        System.out.println("1. Sword" + "\n" + "2. Pitchfork" + "\n" + "3. Fire breath" + "\n" + "4. Roller" + "\n" + "5. AR-15" + "\n" + "6. Bow");
        switch (scanner.nextInt()) {
            case 1: {
                c.setWeapon(new Sword());
                break;
            }
            case 2: {
                c.setWeapon(new Pitchfork());
                break;
            }
            case 3: {
                c.setWeapon(new FireBreath());
                break;
            }
            case 4: {
                c.setWeapon(new Roller());
                break;
            }
            case 5: {
                c.setWeapon(new AR15());
                break;
            }
            case 6: {
                c.setWeapon(new Bow());
                break;
            }
            default: {
                c.setWeapon(new NoWeapon());
                break;
            }
        }

        System.out.println("\n" + "\n" + "choose armor type:");
        System.out.println("1. Light armor (20% hp loss reduction)" + "\n" + "2. Heavy armor (30% hp loss reduction)");
        int xd = scanner.nextInt();
        while (xd != 1 && xd != 2) {
            System.out.println("please enter a valid number!");
            xd = scanner.nextInt();
        }
        switch (xd) {
            case 1: {
                c.setArmor(new LightArmor());
                break;
            }
            case 2: {
                c.setArmor(new HeavyArmor());
                break;
            }
        }

        switch (a) {
            case 1: {
                King k1 = new King();
                k1.name = c.name;
                k1.weapon = c.weapon;
                k1.armor = c.armor;
                createdCharacters.add(k1);
                break;
            }
            case 2: {
                Knight k1 = new Knight();
                k1.name = c.name;
                k1.weapon = c.weapon;
                k1.armor = c.armor;
                createdCharacters.add(k1);
                break;
            }
            case 3: {
                Dragon d1 = new Dragon();
                d1.name = c.name;
                d1.weapon = c.weapon;
                d1.armor = c.armor;
                createdCharacters.add(d1);
                break;
            }
            case 4: {
                Peasant p1 = new Peasant();
                p1.name = c.name;
                p1.weapon = c.weapon;
                p1.armor = c.armor;
                createdCharacters.add(p1);
                break;
            }
            case 5: {
                Cook c1 = new Cook();
                c1.name = c.name;
                c1.weapon = c.weapon;
                c1.armor = c.armor;
                createdCharacters.add(c1);
                break;
            }
            case 6: {
                Sailor s1 = new Sailor();
                s1.name = c.name;
                s1.weapon = c.weapon;
                s1.armor = c.armor;
                createdCharacters.add(s1);
                break;
            }
            case 7: {
                Elf e1 = new Elf();
                e1.name = c.name;
                e1.weapon = c.weapon;
                e1.armor = c.armor;
                createdCharacters.add(e1);
                break;
            }
        }
    }

    void showAllCreatedCharacters() {
        int h = 1;
        for (Character createdCharacter : createdCharacters) {
            System.out.println(h + ". " + createdCharacter);
            h++;
        }
        System.out.println("\n" + "1: Select a character to play with" + "\n" + "2: Delete a character" + "\n" + "3: Go back to menu");
        int z = scanner.nextInt();
        while (z != 1 && z != 2 && z != 3) {
            System.out.println("please enter a valid number!");
            z = scanner.nextInt();
        }
        switch (z) {
            case 1: {
                System.out.println("which character do you wish to play with?");
                int p = scanner.nextInt();
                if (p <= createdCharacters.size()) {
                    play(createdCharacters.get(p-1));
                    break;
                } else {
                    System.out.println("please enter a valid number!");
                    showAllCreatedCharacters();
                    break;
                }
            }
            case 2: {
                System.out.println("which character do you wish to delete?");
                int p = scanner.nextInt();
                delete(createdCharacters.get(p-1));
                showAllCreatedCharacters();
            }
            case 3: run();
        }
    }

    void delete(Character c) {
        createdCharacters.remove(c);
        System.out.println("Character " + c.name + " has been deleted.");
    }

    void play(Character c) {
        System.out.println("Choose an action:");
        System.out.println("1. Go forward" + "\n" + "2. Display your weapon" + "\n" + "3. Check your armor" + "\n" + "4. Heal yourself" + "\n" + "5. Go fight in the arena" + "\n" + "6. Return to menu");
        switch (scanner.nextInt()) {
            case 1: {
                System.out.println();
                c.performMove();
                System.out.println();
                play(c);
                break;
            }
            case 2: {
                System.out.println();
                c.displayWeapon();
                System.out.println();
                play(c);
                break;
            }
            case 3: {
                System.out.println("\n" + "you have a " + c.armor.type() + "\n");
                play(c);
                break;
            }
            case 4: {
                System.out.println("for how many hours do you want to heal?");
                c.heal(scanner.nextDouble());
                System.out.println();
                play(c);
                break;
            }
            case 5: {
                System.out.println();
                arena(c);
                break;
            }
            case 6: {
                run();
                break;
            }
        }
        play(c);
    }

    void arena(Character c){
        int a = 1;
        System.out.println("Welcome to the arena!");
        System.out.println("Choose your opponent, or press 0 to get back to menu:");
        for (Character createdCharacter : createdCharacters) {
            System.out.println(a + ": " + createdCharacter);
            a++;
        }
        int z = scanner.nextInt();
        if (z==0) run();
        while (c.equals(createdCharacters.get(z-1)) || createdCharacters.get(z-1).equals(null)) {
            System.out.println("You can't fight against yourself, and you can't fight against someone who doesn't exist.");
            z = scanner.nextInt();
        }
        fight(c, createdCharacters.get(z-1));
    }

    void fight(Character a, Character b) { // as in (a - you, b - opponent)
        System.out.println("\n" + "\033[6m----- [Arena host]:\033[0m" + "\033[3mThe long awaited fight between \033[0m" + a.name + "\033[3m and \033[0m" + b.name + "\033[3m is here! -----\033[0m" + "\n");
        while (a.hp > 0 && b.hp > 0) {
            if (ran.nextBoolean()) { //A hits B
                int dmg = (int) Math.round(a.weapon.getBaseDamage() * ((100 - b.armor.reductionPercentage()) * 0.01));
                System.out.print(a.name + " used " + a.weapon.getFightBehavior().fight() + ", it caused " + dmg + "damage! ");
                b.hp = b.hp - dmg;
                System.out.println(b.name + " now has " + b.hp + " HP");
            } else { //B hits A
                int dmg = (int) Math.round(b.weapon.getBaseDamage() * ((100 - a.armor.reductionPercentage()) * 0.01));
                System.out.print(b.name + " used " + b.weapon.getFightBehavior().fight() + ", it caused " + dmg + "damage! ");
                a.hp = a.hp - dmg;
                System.out.println(a.name + " now has " + a.hp + " HP");
            }
        }
        if (a.hp <= 0) { // A has died
            System.out.println("\n" + "GAME OVER: YOU DIED");
            System.out.println("\n" + "\n");
            createdCharacters.remove(a);
            run();
        } else { //B has died
            System.out.println("\n" + b.name + " has died!" + "\n" + "do you want to take his weapon, " + b.weapon + "?" + "\n" + "1 - yes, 2 - no");
            switch (scanner.nextInt()) {
                case 1: {
                    a.giveWeapon(b.weapon);
                    break;
                }
                case 2: {
                    System.out.println("\n" + "You decide to keep your weapon. You will shortly go back to the arena." + "\n" + "\n");
                    break;
                }
            }
            createdCharacters.remove(b);
            arena(a);
        }
    }
}