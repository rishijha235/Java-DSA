// HashMap implementation using array and hash function
public class HashMap {
    public static void main(String[] args) {
        MapUsingHash map = new HashMap().new MapUsingHash();

        map.put("Mango", "King of Fruits");
        map.put("Apple", "A sweet red fruit");
        map.put("Orange", "Round fruit");

        System.out.println(map.get("Mango"));
    }

    //Not very optimal
    class MapUsingHash {

        private Entity[] entities;
        
        public MapUsingHash() {
            entities = new Entity[100];
        }

        public void put(String key, String value) {
            int hash = Math.abs(key.hashCode() % entities.length);
            entities[hash] = new Entity(key, value); //overriding
        }

        public String get(String key) {
            int hash = Math.abs(key.hashCode() % entities.length);
            if(entities[hash] != null && entities[hash].key.equals(key)) {
                return entities[hash].value;
            }
            return null;
        }

        public void remove(String key) {
            int hash = Math.abs(key.hashCode() % entities.length);
            if(entities[hash] != null && entities[hash].key.equals(key)) {
                entities[hash] = null;
            }
        }

        private class Entity {
            String key;
            String value;

            public Entity(String key, String value) {
                this.key = key;
                this.value = value;
            }
        }
    }
}
