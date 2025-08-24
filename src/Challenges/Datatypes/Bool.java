package Challenges.Datatypes;

public class Bool {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean isJavaFun = true;
        boolean isFishFlying = false;

        System.out.println("Is Java fun? " + isJavaFun);
        System.out.println("Is fish flying? " + isFishFlying);

        int a = 10, b = 20;
        boolean isAGreater = a > b;
        System.out.println("Is a greater than b? " + isAGreater);

        if (isJavaFun) {
            System.out.println("Let's keep coding in Java!");
        } else {
            System.out.println("Time to try another language!");
        }
	}

}
