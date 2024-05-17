package arena;

public class Feild implements Arena {

    @Override
    public double modifyDamage(double baseDamage) {
        return baseDamage; // No change in damage
    }

    @Override
    public double modifyHitChance(double baseHitChance) {
        return baseHitChance; // No change in hit chance
    }

    @Override
    public String getArenaType() {
        return "Feild";
    }
}
