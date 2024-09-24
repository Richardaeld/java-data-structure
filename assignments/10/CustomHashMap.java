// Name:       Richard Eldridge
// Class:      CS 3305 W03
// Term:       Spring 2024
// Instructor: Carla McManus
// Assignment: 10-Part-1-Hashing
// IDE:        IntelliJ IDEA Edu

import java.util.*;

/** ================== */
/** K */
/** ================== */
class K {
    String key = null;
    K (String str) { key = str; }
    K ()           { key = null; }

    public String toString() {
        return  key;
    }
}
/** ================== */
/** V */
/** ================== */
class V {
    String value = null;
    V (String str) { value = str; }
    V ()           { value = null; }

    public String toString() {
        return value;
    }

}

/** ================== */
/** Node*/
/** ================== */
class Node {
    K key   = null;
    V value = null;

    Node () {
        key   = null;
        value = null;
    }

    Node (K k, V v) {
        key   = k;
        value = v;
    }
}

/** ================== */
/** CustomHashMap*/
/** ================== */
public class CustomHashMap implements MyMap <K, V> {
/**     Create variables, including hashtable */
    int size         = 4;
    float loadFactor = .5f;

//    Hashtable<String, String> table = new Hashtable<>(size);
    Node[] table1 = new Node[size];

/**     Create hash */
    public int createHash (K key, int override, boolean reset) {
        return (key.key.hashCode() + override) % size;
    }

/**     Boolean if lead factor is reached */
    public boolean shouldExtend () {
        return this.size() >= size * loadFactor;
    }


/**     Extends the exiting table and adds all existing values to it */
    public void extendHashTable () {
        int override;
        boolean reset;
        int      hash;

        size *= 2;
        Node [] temptable = new Node[size];
//        System.out.println(temptable.length);

        for (Node temp: table1) {
//            Do nothing if cell is empty
            if (temp == null) continue;

//            Required variables for probing
            override  = 0;
            reset = false;
            hash = this.createHash(temp.key, override, reset);

            while(temptable[hash] != null) {
//            Break if keys are same -- overwrite KV set
                if (temptable[hash].key.key == temp.key.key) {
                    hash = this.createHash(temp.key, override, reset);
                    break;
                }

//            Search for open cell
                override++;
                System.out.println("Probe1");

//            Reset hash if end of table reached (search for next circular cell)
                if (hash >= temptable.length) {
                    override = 0;
                    reset = true;
//                    System.out.println("rest");
                }
                hash = this.createHash(temp.key, override, reset);
            }
//        Add to cell
            temptable[hash] = new Node(temp.key, temp.value);
        }

        table1 = temptable;
    }


/**     Put Method adds K,V to hashtable */
    public V put(K key, V value) {
//        Extend table if loadfactor reached
        if (this.shouldExtend()) extendHashTable();

//        Required variables for probing
        int override  = 0;
        boolean reset = false;
        int      hash = this.createHash(key, override, reset);

//        Probe until empty cell is found
        while(table1[hash] != null) {
//            Break if keys are same -- overwrite KV set
            if (table1[hash].key.key == key.key) {
                hash = this.createHash(key, override, reset);
                break;
            }

//            Search for open cell
            override++;
            System.out.println("Probe");

//            Reset hash if end of table reached (search for next circular cell)
            if (hash >= table1.length) {
                override = 0;
                reset = true;
//                System.out.println("rest");
            }
            hash = this.createHash(key, override, reset);
        }
//        Add to cell
        table1[hash] = new Node(key, value);
        return value;
    }


/**     empty hashtable of all entries */
    public void clear () {
        for (int i = 0; i < table1.length; i++) if (table1[i] != null) table1[i] = null;
    }


/**     Returns a boolean if a key is found */
    public boolean containsKey(K key) {
        for (Node node: table1) if (node != null && key.key.equals(node.key.key)) return true;
        return false;
    }


/**     Returns a boolean if a value is found */
    public boolean containsValue(V value) {
        for (Node node: table1) if (node != null && value.value.equals(node.value.value)) return true;
        return false;

    }


/**     return the value of the key that was input */
    public V get(K key) {
        for (Node node: table1) if (node != null && key.key.equals(node.key.key)) return node.value;
        return new V();

    }


/**     returns a boolean to see if the hashmap is empty */
    public boolean isEmpty() {
        for (Node node: table1) if (node != null) return false;
        return true;
    }


/**     Remove an entry based on the key */
    public void remove(K key) {
        for (int i = 0; i < table1.length; i++) {
            if (table1[i] != null && key.key.equals(key.key)) {
                table1[i] = null;
                return;
            }
        }
    }


/**     Return the length of the hashtable */
    public int size() {
        int counter = 0;
        for (int i = 0; i < table1.length; i++) if (table1[i] != null) counter++;
        return counter;
    }


/**     Returns all entry sets */
    public java.util.Set<Entry<K, V>> entrySet() {
        java.util.Set<MyMap.Entry<K, V>> set =  new java.util.HashSet<>();
        for (int i = 0; i < table1.length; i++) if (table1[i] != null) set.add(new Entry(table1[i].key, table1[i].value));

        return set;
    }


/**     Returns whole key set */
    public java.util.Set<K> keySet() {
        java.util.Set<K> set =  new java.util.HashSet<>();
        for (int i = 0; i < table1.length; i++) if (table1[i] != null) set.add(table1[i].key);
        return set;
    }


/**     Returns whole value set */
    public java.util.Set<V> values() {
        java.util.Set<V> set =  new java.util.HashSet<>();
        for (int i = 0; i < table1.length; i++) if (table1[i] != null) set.add(table1[i].value);
        return set;
    }


}
