import java.util.Scanner;
public class BattleOfTheBrawns {
    public static void main(String[] args) {
        // Initialize variables here
        Scanner input = new Scanner(System.in);
        Exercise[] challenges = new Exercise[10];
        // Example challenges (use if you want)
        challenges[0] = new Exercise("Push-ups", 10.0, 10, "Strength");
        challenges[1] = new Exercise("Jumping Jacks", 5.0, 10, "Aerobics");
        challenges[2] = new Exercise("Squats", 10.0, 10, "Strength");
        challenges[3] = new Exercise("Burpees", 5.0, 10, "Aerobics");
        challenges[4] = new Exercise("Lunges", 10.0, 10, "Strength");
        challenges[5] = new Exercise("Mountain Climbers", 5.0, 10, "Aerobics");
        challenges[6] = new Exercise("Plank", 5.0, 10, "Aerobics");
        challenges[7] = new Exercise("High Knees", 5.0, 10, "Aerobics");
        challenges[8] = new Exercise("Bicep Curls", 10.0, 10, "Strength");
        challenges[9] = new Exercise("Jump Rope", 5.0, 10, "Aerobics");

        Challenger[] challengers = new Challenger[10];
        // Example challengers (use if you want)
        challengers[0] = new Challenger("Jack", "Arrogant", 1);
        challengers[1] = new Challenger("Sarah", "Sad", 2);
        challengers[2] = new Challenger("Mike", "Arrogant", 3);
        challengers[3] = new Challenger("Emily", "Kind", 4);
        challengers[4] = new Challenger("John the Muscle Bro", "Confident", 5);
        challengers[5] = new Challenger("Lisa", "Kind", 1);
        challengers[6] = new Challenger("Tom", "Arrogant", 2);
        challengers[7] = new Challenger("Rachel", "Sad", 3);
        challengers[8] = new Challenger("David", "Confident", 4);
        challengers[9] = new Challenger("Jessica the Muscle Gal", "Kind", 5);
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
    }
}