import java.util.*;

class GottaSnatchEmAll {

    static Set<String> newCollection(List<String> cards) {
        Set<String> collection = new HashSet<>();
        collection.addAll(cards);
        return collection;
    }

    static boolean addCard(String card, Set<String> collection) {
return  collection.add(card);
    }

    static boolean canTrade(Set<String> myCollection, Set<String> theirCollection) {

        if (myCollection.isEmpty()) {
            return false;
        }
        if (theirCollection.isEmpty()) {
            return false;
        }

        boolean theyHaveNew = !myCollection.containsAll(theirCollection);
        boolean IHaveNew = !theirCollection.containsAll(myCollection);
        return theyHaveNew && IHaveNew;

    }

    static Set<String> commonCards(List<Set<String>> collections) {
if (collections == null || collections.isEmpty()) {
    return Set.of();

        }
Set<String> common = new HashSet<>(collections.get(0));

for (int i = 1; i < collections.size(); i++) {
    common.retainAll(collections.get(i));

} return common;

    }

    static Set<String> allCards(List<Set<String>> collections) {
        Set<String> all = new HashSet<>(collections.get(0));
        for (int i = 1; i < collections.size();i++) {
            all.addAll(collections.get(i));
        }
        return all;
    }
}
