package Challenges.EceptionHandling;
import java.util.Formatter;
import java.util.FormatterClosedException;
public class FormatCloExcep {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
            Formatter formatter = new Formatter();
            formatter.close();
            formatter.format("Number: %d", 100);
        } catch (FormatterClosedException e) {
            System.out.println("Caught FormatterClosedException: " + e);
        }
        System.out.println("Program continues after handling exception...");
	}
}
