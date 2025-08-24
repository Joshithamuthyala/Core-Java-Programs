package Challenges.Collection;
import java.util.EnumSet;
import java.util.Scanner;

enum Day {
    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
}
public class EnumsetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        EnumSet<Day> days = EnumSet.noneOf(Day.class);

        System.out.print("Enter number of days to add in EnumSet: ");
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < n; i++) {
            System.out.print("Enter day (e.g., MONDAY, TUESDAY): ");
            String input = sc.nextLine().toUpperCase();
            try {
                Day day = Day.valueOf(input);
                days.add(day);
            } catch (IllegalArgumentException e) {
                System.out.println("Invalid day entered, skipping...");
            }
        }

        System.out.println("\nEnumSet elements:");
        for (Day d : days) {
            System.out.println(d);
        }

        System.out.print("\nEnter a day to remove: ");
        String removeInput = sc.nextLine().toUpperCase();
        try {
            Day removeDay = Day.valueOf(removeInput);
            if (days.remove(removeDay)) {
                System.out.println(removeDay + " removed successfully.");
            } else {
                System.out.println(removeDay + " not present in EnumSet.");
            }
        } catch (IllegalArgumentException e) {
            System.out.println("Invalid day entered.");
        }

        System.out.println("\nEnumSet after removal:");
        for (Day d : days) {
            System.out.println(d);
        }

        sc.close();
	}

}
