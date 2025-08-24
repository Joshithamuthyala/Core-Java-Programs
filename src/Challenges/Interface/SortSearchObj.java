package Challenges.Interface;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;


interface Sortable<T extends Comparable<T>> {
    void sort();
}

interface Searchable<T> {
    boolean search(T item);
}
class CustomList<T extends Comparable<T>> implements Sortable<T>, Searchable<T> {
    private ArrayList<T> list = new ArrayList<>();

    public void add(T item) {
        list.add(item);
    }

    @Override
    public void sort() {
        Collections.sort(list);
        System.out.println("Sorted list: " + list);
    }

    @Override
    public boolean search(T item) {
        boolean found = list.contains(item);
        System.out.println(item + (found ? " found in list." : " not found in list."));
        return found;
    }
}

class CustomDictionary<K extends Comparable<K>, V> implements Sortable<K>, Searchable<K> {
    private HashMap<K, V> map = new HashMap<>();

    public void add(K key, V value) {
        map.put(key, value);
    }

    @Override
    public void sort() {
        ArrayList<K> keys = new ArrayList<>(map.keySet());
        Collections.sort(keys);
        System.out.println("Sorted dictionary keys: " + keys);
    }

    @Override
    public boolean search(K key) {
        boolean found = map.containsKey(key);
        System.out.println(key + (found ? " found in dictionary." : " not found in dictionary."));
        return found;
    }
}
public class SortSearchObj {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CustomList<Integer> list = new CustomList<>();
        list.add(5);
        list.add(2);
        list.add(9);
        list.sort();
        list.search(2);
        list.search(7);

        CustomDictionary<String, String> dictionary = new CustomDictionary<>();
        dictionary.add("Apple", "Fruit");
        dictionary.add("Carrot", "Vegetable");
        dictionary.sort();
        dictionary.search("Apple");
        dictionary.search("Banana");
	}

}
