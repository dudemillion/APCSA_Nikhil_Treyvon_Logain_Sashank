import java.util.Scanner;
public class BattleOfTheBrawns {
    public static void main(String[] args) {
        // Initialize variables here
        Scanner input = new Scanner(System.in);
        Exercise[] challenges = new Exercise[10];
        // Example challenges
        challenges[0] = new Exercise("Push-ups", 10, true, "Strength");
        challenges[1] = new Exercise("Jumping Jacks", 5, false, "Aerobics");
        challenges[2] = new Exercise("Squats", 10, true, "Strength");
        challenges[3] = new Exercise("Burpees", 5, false, "Aerobics");
        challenges[4] = new Exercise("Lunges", 10, true, "Strength");
        challenges[5] = new Exercise("Mountain Climbers", 5, false, "Aerobics");
        challenges[6] = new Exercise("Plank", 5, false, "Strength");
        challenges[7] = new Exercise("High Knees", 5, false, "Aerobics");
        challenges[8] = new Exercise("Bicep Curls", 10, true, "Strength");
        challenges[9] = new Exercise("Jump Rope", 5, false, "Aerobics");
        
        // Get user input for name, duration, equipment, and focus
        System.out.println("Welcome to the Battle of the Brawns!");
        System.out.println("What is your name?");
        String name = input.nextLine();
        System.out.println("Hello, " + name + ". How long would you like to play? (in minutes (15, 30, 45, 60))");
        int duration = input.nextInt();
        System.out.println("Do you have proper equipment? For example, dumbbells, resistance bands, or a pull-up bar? (Y/N)");
        char equipment = input.next().charAt(0);
        System.out.println("Would you like to focus on aerobics or strength training? (A/S)");
        char focus = input.next().charAt(0);
        System.out.println("Thank you for your input, " + name + "! Get ready to battle!");
        System.out.println("These are your available challenges:");

        // Add code to display challenges based on user input
        for
    }
}