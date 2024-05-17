package weapon;

public class GreatSword extends Weapon {
    private int damageAmount = 300;
    private int dexterityCost = 270;
    private int hitPercentage = 45;
  
    public GreatSword() {
      super();
      super.setDamageAmount(damageAmount);
      super.setDexterityCost(dexterityCost);
    } // constructor
  
    public int strike(int weatherIntensity, int attackType, int strength, int dexterity) {
      int amount = 0;
      // roll the dice
      int roll = super.randNum.nextInt(100) + 1; // 1 - 100
  
      // increasing hitPercentage based on player dexterity
      // decreasing the hitPercent based on attackType
      if(roll <= hitPercentage + 
        ((dexterity - dexterityCost) / 10) - (attackType * 5)) { // hit
        if(attackType == 2) {
          amount = this.damageAmount + (strength / 10) + 2 - weatherIntensity;
        }
        else {
          amount = this.damageAmount + (strength / 20) - weatherIntensity;
        }
      }
      return amount;
    } // strike()
  } // class
  