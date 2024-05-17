 package utility;

import warrior.Warrior;

public class Ink {

  public Ink() {
    // do nothing
  } // constructor

  // Welcome Message
  public void welcomeMessage() {
    System.out.println("""
      __        __             _             ____   ___ ____  _  _   
      \\ \\      / /_ _ _ __ ___(_)_ __ ___   |___ \\ / _ \\___ \\| || |  
       \\ \\ /\\ / / _` | '__/ __| | '_ ` _ \\    __) | | |__) | || |_ 
        \\ V  V / (_| | |  \\__ \\ | | | | | |  / __/| |_| / __/|__   _|
         \\_/\\_/ \\__,_|_|  |___/_|_| |_| |_| |_____|\\___/_____|  |_|  
    """);
  }

  // Warrior Menu
  public void printWarriorMenu() {
    System.out.println("Race Selection: \n1) Human\n2) Elf\n3) Orc");
  }

  // Weapon Menu
  public void printWeaponMenu() {
    System.out.println("Weapon Of Choice: \n1) Dagger\n2) Sword\n3) Axe\n4) Great Sword");
  }
  
  // Armor Menu
  public void printArmourMenu() {
    System.out.println("Armour Of Choice : \n1) Leather\n2) Chainmail\n3) Platemail\n4) Knight");
  }

  // Attack Menu
  public void printAttackMenu() {
    System.out.println("\nAttack Type: \n1) Normal\n2) Heavy\n3) Surrender\n");
  }

  // Print Stats
  public void printStats(Warrior pWarrior, Warrior eWarrior) {
    System.out.printf("%-25s (%s)\n", "Player: ", pWarrior.getWarriorType());
    System.out.printf("Health: %-25d\n", 
      pWarrior.getHealth());
    System.out.printf("Strength: %-25d\n", 
      pWarrior.getStrength());
    System.out.printf("Dexterity: %-25d\n", 
      pWarrior.getDexterity());
    System.out.printf("%-25s (%s)\n", "Enemy: ", eWarrior.getWarriorType());
    System.out.printf("Health: %-25d\n", 
      eWarrior.getHealth());
    System.out.printf("Strength: %-25d\n", 
      eWarrior.getStrength());
    System.out.printf("Dexterity: %-25d\n", 
      eWarrior.getDexterity());
  } // printStats()

  // Surrender Message
  public void printSurrenderMessage() {
    System.out.println("Player ran!!");
  }

  // GameOver Message
  public void printGameOver(String winner) {
    System.out.printf("""
         __ __
      .-',,^,,'.
     / \\(0)(0)/ \\
     )/( ,_"_,)\\(
     `  >-`~(   ' 
   _N\\ |(`\\ |___
   \\' |/ \\ \\/_-,)
    '.(  \\`\\_<
       \\ _\\|
        | |_\\_
        \\_,_>-'
    winner: %s
        """, winner);
  } // printGameOver()

} // class
