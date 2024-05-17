package armour;

public class Knight extends Armour {
    private int armourAmount = 300;
    private int dexterityCost = 250;
  
    public Knight() {
      super();
      super.setArmourAmount(armourAmount);
      super.setDexterityCost(dexterityCost);
    } // constructor
  
    public int reduceDamage(int damageAmount) {
      return damageAmount - this.armourAmount / 1;
    }
    
  } // class
  