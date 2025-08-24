package Challenges.Interface;
interface MyCloneable<T> {
    T clone();
}

interface MyComparable<T> {
    int compareTo(T other);
}

class NumberClas implements MyCloneable<NumberClas>, MyComparable<NumberClas> {
    private int value;

    public NumberClas(int value) {
        this.value = value;
    }

    @Override
    public NumberClas clone() {
        return new NumberClas(this.value);
    }

    @Override
    public int compareTo(NumberClas other) {
        return Integer.compare(this.value, other.value);
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }
}

class Perso implements MyCloneable<Perso>, MyComparable<Perso> {
    private String name;
    private int age;

    public Perso(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public Perso clone() {
        return new Perso(this.name, this.age);
    }

    @Override
    public int compareTo(Perso other) {
        return Integer.compare(this.age, other.age);
    }

    @Override
    public String toString() {
        return name + " (" + age + ")";
    }
}
public class CompcloneInterfac {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NumberClas n1 = new NumberClas(10);
        NumberClas n2 = n1.clone();
        System.out.println("n1: " + n1 + ", n2: " + n2);
        System.out.println("Comparison: " + n1.compareTo(new NumberClas(20)));

        Perso p1 = new Perso("Alice", 25);
        Perso p2 = p1.clone();
        System.out.println("p1: " + p1 + ", p2: " + p2);
        System.out.println("Comparison: " + p1.compareTo(new Perso("Bob", 30)));
	}

}
