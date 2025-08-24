package Challenges.Interface;
import java.util.ArrayList;
import java.util.HashSet;

interface AList<T> {
    void add(T item);
    void remove(T item);
    boolean contains(T item);
}

interface ASet<T> {
    void add(T item);
    void remove(T item);
    boolean contains(T item);
}


class SArrayList<T> implements SList<T> {
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

class AHashSet<T> implements ASet<T> {
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

public class ListSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
