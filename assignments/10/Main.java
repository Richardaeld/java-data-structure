// Name:       Richard Eldridge
// Class:      CS 3305 W03
// Term:       Spring 2024
// Instructor: Carla McManus
// Assignment: 10-Part-1-Hashing
// IDE:        IntelliJ IDEA Edu

import java.util.*;

public class Main {
    public static void main(String[] args) {
        CustomHashMap map = new CustomHashMap();

//        Test map creation and cell size
        System.out.println("Empty map created");
        System.out.println("Is map empty: " + map.isEmpty());
        System.out.println("Map size (filled cells): " + map.size());
        System.out.println("Map array Length: " + map.table1.length + "\n");

//        Fill map
        System.out.println("Add Key Value Pairs:");
        System.out.println("T1, V1");
        System.out.println("T2, V2");
        System.out.println("T3, V3");
        System.out.println("T4, V4");
        System.out.println("T5, V5");
        System.out.println("T6, V6");
        System.out.println("T7, V7");
        System.out.println("T8, V8");
        map.put(new K("T1"), new V("V1"));
        map.put(new K("T2"), new V("V2"));
        map.put(new K("T3"), new V("V3"));
        map.put(new K("T4"), new V("V4"));
        map.put(new K("T5"), new V("V5"));
        map.put(new K("T6"), new V("V6"));
        map.put(new K("T7"), new V("V7"));
        map.put(new K("T8"), new V("V8"));
//        for(K key: map.keySet()) System.out.println(key);

//        show map length
        System.out.println("Map array Length: " + map.table1.length + "\n");

//        Show all map sets
        System.out.println("Print all Sets:");
        for(MyMap.Entry<K, V> set: map.entrySet()) System.out.println("[" + set.key + " " + set.value + "]");
        System.out.println("\n");

//        show containsKey method
        System.out.println("Does map contain Key T1: " + map.containsKey(new K("T1")));
        System.out.println("Does map contain Key T10: " + map.containsKey(new K("T10")));
        System.out.println("\n");

//        show containsValue method
        System.out.println("Does map contain Value V1: " + map.containsValue(new V("V1")));
        System.out.println("Does map contain Value V10: " + map.containsValue(new V("V10")));
        System.out.println("\n");

//        Show get method
        System.out.println("Get Value of Key T1: " + map.get(new K ("T1") ));
        System.out.println("Get Value of Key T10: " + map.get(new K ("T10") ));

//        Show remove method
        System.out.println("\nRemove T1");
        map.remove(new K ("T1"));
        System.out.println("Get Value of Key T1: " + map.get(new K ("T1") ));

//        Add new T1 and print all sets
        System.out.println("\nAdd new T1 with value new");
        map.put(new K("T1"), new V("new"));
        for(MyMap.Entry<K, V> set: map.entrySet()) System.out.println("[" + set.key + " " + set.value + "]");

//        Overwrite new T1 and print all Sets
        System.out.println("\nOverwrite new T1 with value T1");
        map.put(new K("T1"), new V("T1"));
        System.out.println("Print all Keys");
        for(MyMap.Entry<K, V> set: map.entrySet()) System.out.println("[" + set.key + " " + set.value + "]");

//        Show values method
        System.out.println("\nPrint all Values");
        for(V value: map.values()) System.out.println(value);

//        Show map is not empty
        System.out.println("\nIs map empty: " + map.isEmpty());

//        Delete map
        System.out.println("\nDelete map");
        map.clear();

//        Show map is empty
        System.out.println("\nIs map empty: " + map.isEmpty());

//        Print all sets (print null set)
        System.out.println("\nPrint all Sets:");
        for(MyMap.Entry<K, V> set: map.entrySet()) System.out.println("[" + set.key + " " + set.value + "]");
    }
}