import java.util.*;

class RelativeDistance {

     private Map<String, Set<String>> familyMap;

    RelativeDistance(Map<String, List<String>>  familyTree) {
        this.familyMap = new HashMap<>();

        for (Map.Entry<String,List<String>> entry : familyTree.entrySet()) {
            String parent = entry.getKey();
            List<String> children = entry.getValue();

            for (String child: children) {
                this.familyMap.computeIfAbsent(parent, k -> new HashSet<>()).add(child);
                this.familyMap.computeIfAbsent(child, k -> new HashSet<>()).add(parent);
            }

            for (String child : children){
                for (String sibiling : children){
                    if (!sibiling.equals(child)) {
                        this.familyMap.get(child).add(sibiling);
                    }
                }
            }

        }





    }

    int degreeOfSeparation(String personA, String personB) {
        if(personA.equals(personB)) return 0;

        Queue<String> queue = new LinkedList<>();
        Map<String,Integer> distance = new HashMap<>();

        queue.add(personA);
        distance.put(personA, 0);

        while (!queue.isEmpty()) {
            String current = queue.poll();
            int currentDist = distance.get(current);

            for (String relative : this.familyMap.getOrDefault(current, Set.of())) {
                if (!distance.containsKey(relative)) {
                    distance.put(relative, currentDist + 1);
                    queue.add(relative);
                }
            }
        }

        return distance.getOrDefault(personB, - 1);

    }
}
