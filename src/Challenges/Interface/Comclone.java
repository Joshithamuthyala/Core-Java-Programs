package Challenges.Interface;
interface Cloneable<T> {
    T clone();
}

interface Comparable<T> {
    int compareTo(T other);
}

class NumberClass implements Cloneable<NumberClass>, Comparable<NumberClass> {
    private int value;

    public NumberClass(int value) {
        this.value = value;
    }

    @Override
    public NumberClass clone() {
        return new NumberClass(this.value);
    }

    @Override
    public int compareTo(NumberClass other) {
        return Integer.compare(this.value, other.value);
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }
}

class Person implements Cloneable<Person>, Comparable<Person> {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public Person clone() {
        return new Person(this.name, this.age);
    }

    @Override
    public int compareTo(Person other) {
        return Integer.compare(this.age, other.age);
    }

    @Override
    public String toString() {
        return name + " (" + age + ")";
    }
}
public class Comclone {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
