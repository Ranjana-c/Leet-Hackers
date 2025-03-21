import java.util.*;

public class RandomizedSet {
    private List<Integer> list;
    private Map<Integer, Integer> map;

    public RandomizedSet() {
        list = new ArrayList<>();
        map = new HashMap<>();
    }
    
    public boolean insert(int val) {
        if (map.containsKey(val)) {
            return false; // val already exists
        }
        list.add(val); // Add to the list
        map.put(val, list.size() - 1); // Store the index in the map
        return true;
    }
    
    public boolean remove(int val) {
        if (!map.containsKey(val)) {
            return false; // val doesn't exist
        }
        // Get the index of the element to be removed
        int index = map.get(val);
        int lastElement = list.get(list.size() - 1);
        
        // Swap the element with the last element in the list
        list.set(index, lastElement);
        map.put(lastElement, index);
        
        // Remove the last element
        list.remove(list.size() - 1);
        map.remove(val);
        
        return true;
    }
    
    public int getRandom() {
        Random rand = new Random();
        return list.get(rand.nextInt(list.size())); // Randomly select an element from the list
    }
}
