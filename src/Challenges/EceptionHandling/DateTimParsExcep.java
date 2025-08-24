package Challenges.EceptionHandling;
import java.time.LocalDate;
import java.time.format.DateTimeParseException;
public class DateTimParsExcep {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
            String dateStr = "2025-18-08";
            LocalDate date = LocalDate.parse(dateStr);
            System.out.println("Parsed Date: " + date);
        } catch (DateTimeParseException e) {
            System.out.println("Caught DateTimeParseException: " + e);
        }
        System.out.println("Program continues after handling exception...");
	}

}
