class Fighter {

    boolean isVulnerable() {
        return true;
    }

    int getDamagePoints(Fighter fighter) {
        return 1;
    }
}

// TODO: define the Warrior class

class Warrior extends Fighter {
    @Override
    boolean isVulnerable() {
        return false;
    }

    @Override
    public String toString() {
        return "Fighter is a Warrior";
    }

    @Override
    int getDamagePoints(Fighter fighter) {
        if (fighter.isVulnerable()){
            return  10;
        } else if (!(fighter.isVulnerable())) {
            return 6;
        }
        return 0;
    }
}

// TODO: define the Wizard class

class Wizard extends Fighter {
    private boolean spellPrepared = false;

    public String toString() {
        return "Fighter is a Wizard";
    }

    @Override
    boolean isVulnerable() {
        return !spellPrepared;
    }

   public boolean prepareSpell() {
        this.spellPrepared = true;
        return true;
    }

    @Override
    int getDamagePoints(Fighter fighter) {
if (this.spellPrepared){
    return 12;
} return 3;
    }
}
