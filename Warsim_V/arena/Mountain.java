package arena;

public class Mountain implements Arena {

    @Override
    public double modifyDamage(double baseDamage) {
        return baseDamage * 1.1; // Increase damage slightly in the mountain
    }

    @Override
    public double modifyHitChance(double baseHitChance) {
        return baseHitChance * 0.9; // Decrease hit chance slightly in the mountain
    }

    @Override
    public String getArenaType() {
        return "Mountain";
    }
}
