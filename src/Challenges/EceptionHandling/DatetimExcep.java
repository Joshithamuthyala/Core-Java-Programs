package Challenges.EceptionHandling;
import java.time.LocalDate;
import java.time.DateTimeException;
public class DatetimExcep {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 try {
	            LocalDate date = LocalDate.of(2025, 13, 10);
	            System.out.println("Date: " + date);
	        } catch (DateTimeException e) {
	            System.out.println("DateTimeException caught: " + e.getMessage());
	        }
	}

}
