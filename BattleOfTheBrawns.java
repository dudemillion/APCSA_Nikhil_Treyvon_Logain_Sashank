import java.util.Scanner;
public class BattleOfTheBrawns {
    public static void main(String[] args) {
        // Initialize variables here
        Scanner input = new Scanner(System.in);

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