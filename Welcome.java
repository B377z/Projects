import java.time.LocalDate; // Importing LocalDate for the current date
import java.time.LocalTime; // Importing LocalTime for the current time

public class Welcome {
    public static void main(String[] args) {
	// Get todays date
	LocalDate today = LocalDate.now();

	// Get the current time
	LocalTime now = LocalTime.now();

	// Display the welcome message with date, time, and a placeholder for weather
	System.out.println("=============================");
        System.out.println("	Welcome to Mesozoic Eden Dinosaur Park!  ");
	System.out.println("   Where the past meets the present.        ");
        System.out.println("============================================");
        System.out.println("Today's date: " + today); // Display today's date
	System.out.println("Current time: " + now.withSecond(0).withNano(0)); // Display time without seconds and nanoseconds
	System.out.println("Weather: Sunny and warm"); // Placeholder for weather
        System.out.println();
        // Declare a variable to store your name
        String name = "Unwana Udo";
         // Declare a variable to store your desired position
        String position = "Park Manager";
        // Display a welcome message with your name and position
        System.out.println("My name is " + name + " and I am the " + position + " of Mesozoic Eden Dinosaur Park.");
        System.out.println("Explore the wonders of prehistoric life.");
        System.out.println("Watch majestic dinosaurs roam in their natural habitats.");
        System.out.println("Ensure your safety by following park guidelines.");
        System.out.println("Have a roaring good time!");
        System.out.println();
        System.out.println("============================================");
        // Declare opening and closing times for the park
        String openingTime = "9:00 AM";
        String closingTime = "6:00 PM";
        // Display the park's opening and closing times
        System.out.println("The park opens at " + openingTime + " and closes at " + closingTime + ".");
    }
}
