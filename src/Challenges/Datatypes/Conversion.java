package Challenges.Datatypes;

public class Conversion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char lower = 'a';
        char upper = 'Z';

        char toUpper = (char)(lower - 32);
        char toLower = (char)(upper + 32);

        System.out.println("Lowercase to Uppercase: " + lower + " -> " + toUpper);
        System.out.println("Uppercase to Lowercase: " + upper + " -> " + toLower);
	}

}
