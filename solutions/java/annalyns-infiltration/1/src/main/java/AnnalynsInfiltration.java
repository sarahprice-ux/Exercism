class AnnalynsInfiltration {
    public static boolean canFastAttack(boolean knightIsAwake) {
        return !knightIsAwake;
    }


    public static boolean canSpy(boolean knightIsAwake, boolean archerIsAwake, boolean prisonerIsAwake) {
       boolean canSpy = false;
       if (knightIsAwake|archerIsAwake|prisonerIsAwake == true) {
        canSpy = true;}
            return canSpy;
    }


    public static boolean canSignalPrisoner(boolean archerIsAwake, boolean prisonerIsAwake) {
        boolean canSignalPrisoner = false;
        if (prisonerIsAwake == true && archerIsAwake == false) {
            canSignalPrisoner = true;

        }return canSignalPrisoner;
    }

    public static boolean canFreePrisoner(boolean knightIsAwake, boolean archerIsAwake, boolean prisonerIsAwake, boolean petDogIsPresent) {
       boolean canFreePrisoner = false;
       if (petDogIsPresent == true && archerIsAwake == false) {
           canFreePrisoner = true;
       } else if (petDogIsPresent == false && prisonerIsAwake == true && knightIsAwake == false && archerIsAwake == false) {
           canFreePrisoner = true;
       } return canFreePrisoner;
    }
}
