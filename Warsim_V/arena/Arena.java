package arena;

public interface Arena {
    double modifyDamage(double baseDamage);
    double modifyHitChance(double baseHitChance);
    String getArenaType();
}
