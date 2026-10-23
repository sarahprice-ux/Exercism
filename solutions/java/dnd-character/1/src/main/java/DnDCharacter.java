import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

class DnDCharacter {

    private static final Random RANDOM = new Random();

    private final int strength;
    private final int dexterity;
    private final int constitution;
    private final int intelligence;
    private final int wisdom;
    private final int charisma;
    private final int hitpoints;


    public DnDCharacter() {
        this.strength = ability(rollDice());
        this.dexterity = ability(rollDice());
        this.constitution = ability(rollDice());
        this.intelligence = ability(rollDice());
        this.wisdom = ability(rollDice());
        this.charisma = ability(rollDice());
        this.hitpoints = 10 + modifier(this.constitution);
    }


    List<Integer> rollDice() {
        List<Integer> rolls = new ArrayList<>();
        for (int i = 0; i < 4; i++) {
            rolls.add(RANDOM.nextInt(6) + 1);
        }
        return rolls;
    }


    int ability(List<Integer> scores) {
        List<Integer> sortedScores = new ArrayList<>(scores);
        sortedScores.sort(Collections.reverseOrder());
        sortedScores.remove(sortedScores.size() - 1);
        return sortedScores.stream().mapToInt(Integer::intValue).sum();
    }


    int modifier(int input) {
        return (int) Math.floor((input - 10.0) / 2.0);
    }

    int getStrength() {
        return strength;
    }

    int getDexterity() {
        return dexterity;
    }

    int getConstitution() {
        return constitution;
    }

    int getIntelligence() {
        return intelligence;
    }

    int getWisdom() {
        return wisdom;
    }

    int getCharisma() {
        return charisma;
    }

    int getHitpoints() {
        return hitpoints;
    }
}
