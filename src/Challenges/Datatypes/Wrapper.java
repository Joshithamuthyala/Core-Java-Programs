package Challenges.Datatypes;

public class Wrapper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 10;
        Integer intObj = Integer.valueOf(a);
        int b = intObj.intValue();

        double d = 25.75;
        Double doubleObj = Double.valueOf(d);
        double e = doubleObj.doubleValue();

        System.out.println("Primitive int: " + a);
        System.out.println("Wrapped Integer: " + intObj);
        System.out.println("Unwrapped int: " + b);

        System.out.println("Primitive double: " + d);
        System.out.println("Wrapped Double: " + doubleObj);
        System.out.println("Unwrapped double: " + e);
	}

}
