package Challenges.EceptionHandling;
import java.util.regex.*;
public class PatternSynExcep {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
            Pattern pattern = Pattern.compile("[a-zA-Z+"); 
            Matcher matcher = pattern.matcher("Hello");
            while (matcher.find()) {
                System.out.println(matcher.group());
            }
        } catch (PatternSyntaxException e) {
            System.out.println("Caught PatternSyntaxException: " + e);
        }
        System.out.println("Program continues after handling exception...");
	}

}
