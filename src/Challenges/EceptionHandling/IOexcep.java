package Challenges.EceptionHandling;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
public class IOexcep {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 try {
	            BufferedReader br = new BufferedReader(new FileReader("sample.txt"));
	            String line;
	            while ((line = br.readLine()) != null) {
	                System.out.println(line);
	            }
	            br.close();
	        } 
	        catch (IOException e) {
	            System.out.println("Exception Caught: " + e);
	        }

	        System.out.println("Program continues...");
	}

}
