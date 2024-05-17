
package arena;

public class Forest implements Arena {

    @Override
    public double modifyDamage(double baseDamage) {
        return baseDamage * 0.9; // Decrease damage slightly in the forest
    }

    @Override
    public double modifyHitChance(double baseHitChance) {
        return baseHitChance * 1.1; // Increase hit chance slightly in the forest
    }

    @Override
    public String getArenaType() {
        return "Forest";
    }
}
