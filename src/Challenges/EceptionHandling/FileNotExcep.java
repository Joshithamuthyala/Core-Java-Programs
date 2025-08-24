package Challenges.EceptionHandling;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileNotExcep {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
            File file = new File("test.txt"); // file that may not exist
            Scanner sc = new Scanner(file);

            while (sc.hasNextLine()) {
                System.out.println(sc.nextLine());
            }

            sc.close();
        } 
        catch (FileNotFoundException e) {
            System.out.println("Exception Caught: " + e);
        }

        System.out.println("Program continues...");
	}

}
