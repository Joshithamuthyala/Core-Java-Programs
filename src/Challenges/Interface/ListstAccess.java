package Challenges.Interface;
import java.util.ArrayList;
import java.util.HashSet;
interface MyList<T> {
    void add(T item);
    void remove(T item);
    boolean contains(T item);
}

interface MySet<T> {
    void add(T item);
    void remove(T item);
    boolean contains(T item);
}


class MyArrayList<T> implements MyList<T> {
    private ArrayList<T> list = new ArrayList<>();

    @Override
    public void add(T item) {
        list.add(item);
    }

    @Override
    public void remove(T item) {
        list.remove(item);
    }

    @Override
    public boolean contains(T item) {
        return list.contains(item);
    }

    @Override
    public String toString() {
        return list.toString();
    }
}

class MyHashSet<T> implements MySet<T> {
    private HashSet<T> set = new HashSet<>();

    @Override
    public void add(T item) {
        set.add(item);
    }

    @Override
    public void remove(T item) {
        set.remove(item);
    }

    @Override
    public boolean contains(T item) {
        return set.contains(item);
    }

    @Override
    public String toString() {
        return set.toString();
    }
}

public class ListstAccess {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyArrayList<String> arrayList = new MyArrayList<>();
        arrayList.add("Apple");
        arrayList.add("Banana");
        System.out.println("ArrayList: " + arrayList);
        arrayList.remove("Apple");
        System.out.println("Contains Banana? " + arrayList.contains("Banana"));

        MyHashSet<String> hashSet = new MyHashSet<>();
        hashSet.add("Dog");
        hashSet.add("Cat");
        System.out.println("HashSet: " + hashSet);
        hashSet.remove("Dog");
        System.out.println("Contains Dog? " + hashSet.contains("Dog"));
	}

}
