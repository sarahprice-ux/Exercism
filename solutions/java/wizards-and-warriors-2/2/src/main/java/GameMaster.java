public class GameMaster {


    // TODO: define a 'describe' method that returns a description of a Character

    public String describe(Character character) {
        return "You're a level " + character.getLevel() + " " + character.getCharacterClass() + " with " + character.getHitPoints() + " hit points.";
    }

    // TODO: define a 'describe' method that returns a description of a Destination

    public String describe(Destination character) {
        return "You've arrived at " + character.getName() + ", which has " + character.getInhabitants() + " inhabitants.";
    }

    // TODO: define a 'describe' method that returns a description of a TravelMethod

    public String describe(TravelMethod character) {
        return switch (character) {
            case HORSEBACK -> "You're traveling to your destination on horseback.";
            case WALKING -> "You're traveling to your destination by walking.";
            default -> "Unknown method od travel";
        };
    }

    // TODO: define a 'describe' method that returns a description of a Character, Destination and TravelMethod
    public String describe(Character character,Destination destination, TravelMethod travelMethod){
        return describe(character) + " " + describe(travelMethod) + " " + describe(destination);
    }

    // TODO: define a 'describe' method that returns a description of a Character and Destination
    public String describe(Character character, Destination destination) {
        return  describe(character) + " You're traveling to your destination by walking. " + describe(destination);
    }
}
