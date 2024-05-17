package armour;

public abstract class Armour {
  private int armourAmount;
  private int dexterityCost;

  public Armour() {
    // do nothing
  }

  //==============>>
  // GETTERS
  public int getArmourAmount() {
    return this.armourAmount;
  }
  public int getDexterityCost() {
    return this.dexterityCost;
  }
  public abstract int reduceDamage(int damageAmount);

  //==============>>
  // SETTERS
  public void setArmourAmount(int armourAmount) {
    this.armourAmount = armourAmount;
  }
  public void setDexterityCost(int dexterityCost) {
    this.dexterityCost = dexterityCost;
  }
} // class
