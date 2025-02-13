import java.util.LinkedList;

public class hashMapImplementation {
    static class MyHashMAp<K, V> {
        public static final int DEFAULT_CAPACITY = 4;
        public static final float DEFAULT_LOAD_FACTOR = 0.75f;

        private class Node {
            K key;
            V value;

            Node(K key, V value) {
                this.key = key;
                this.value = value;
            }
        }

        private int n; // return the number of entries in map
        private LinkedList<Node>[] buckets;

        private void initBuckets(int N){ // N - capacity/size of buckets array
            buckets = new LinkedList[N];
            for(int i = 0; i<buckets.length; i++){
                buckets[i] = new LinkedList<>();
            }

        }

        public MyHashMAp() { // Constructor
              initBuckets(DEFAULT_CAPACITY);
        }

        public int size() { // return the number of entries in map
            return n;
        }

        public void put(K key, V value) { // insert/ update

        }

        public V get(K key) {
            return null;

        }

        public V remove(K key) {
            return null;

        }
    }

    public static void main(String[] args) {
        MyHashMAp<String, Integer> mp = new MyHashMAp<>();
        MyHashMAp<String, String> mp2 = new MyHashMAp<>();
    }
}
