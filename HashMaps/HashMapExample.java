// package HashMaps;
import java.util.HashSet;
import java.util.TreeMap;
public class HashMapExample {
    public static void main(String[] args) {

        // HashMap<String, Integer> map = new HashMap<>();
        TreeMap<String, Integer> map = new TreeMap<>();  // Using TreeMap for sorted order of keys.
        // Internally TreeMap and HashMap are different, but the way to use it is same.

        map.put("Rishi", 88);
        map.put("Ravi", 90);
        map.put("Rohan", 85);

        System.out.println(map.get("Rishi"));
        // Attempting to retrieve a non-existing key
        // This will return null since "Ris" is not in the map
        System.out.println(map.get("Ris"));

        // Using getOrDefault to provide a default value if the key does not exist
        System.out.println(map.getOrDefault("Ram", 25));

        // Size of the map
        System.out.println("Size of the map: " + map.size());

        // Checking if a key exists in the map
        System.out.println(map.containsKey("Rishi"));

        // Checking if a value exists in the map
        System.out.println(map.containsValue(90));

        HashSet<Integer> set = new HashSet<>();
        set.add(98);
        set.add(56);
        set.add(56); // Duplicate values are not added
        System.out.println(set);
        System.out.println("Size of the set: " + set.size());
    }
}
