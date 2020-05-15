/**
 * Interface that conducts the information of the specific perks
 * each beyblade holds which is specialattack power, specialMoves
 * and boosters
 */
public interface BeySpecifics {
   int specialAttackPower(int totalSpecialAttackPower);
    String  specialMove(String containsSpecialMove);
    boolean beyBooster(boolean hasBooster);
}
