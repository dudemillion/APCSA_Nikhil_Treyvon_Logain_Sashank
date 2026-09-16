import java.util.Scanner;
public class BattleOfTheBrawns {
    public static void main(String[] args) {
        // Initialize variables here
        Scanner input = new Scanner(System.in);
        Exercise[] challenges = new Exercise[15];
        // Example challenges (use if you want)
        challenges[0] = new Exercise("Push-ups", "Strength", 10.0, 10, false);
        challenges[1] = new Exercise("Jumping Jacks", "Aerobics", 5.0, 10, false);
        challenges[2] = new Exercise("Squats", "Strength", 10.0, 10, false);
        challenges[3] = new Exercise("Burpees", "Aerobics", 5.0, 10, false);
        challenges[4] = new Exercise("Lunges", "Strength", 10.0, 10, false);
        challenges[5] = new Exercise("Mountain Climbers", "Aerobics", 5.0, 10, false);
        challenges[6] = new Exercise("Plank", "Aerobics", 5.0, 10, false);
        challenges[7] = new Exercise("High Knees", "Aerobics", 5.0, 10, false);
        challenges[8] = new Exercise("Bicep Curls", "Strength", 10.0, 10, true);
        challenges[9] = new Exercise("Jump Rope", "Aerobics", 5.0, 10, true);
        challenges[10] = new Exercise("Bench Press", "Strength", 10.0, 10, true);
        challenges[11] = new Exercise("Pull-ups", "Strength", 10.0, 10, true);
        challenges[12] = new Exercise("Dumbbell Rows", "Strength", 10.0, 10, true);
        challenges[13] = new Exercise("Kettlebell Swings", "Strength", 10.0, 10, true);
        challenges[14] = new Exercise("Resistance Band Reps", "Strength", 10.0, 10, true);

        Challenger[] challengers = new Challenger[10];
        // Example challengers (use if you want)
        challengers[0] = new Challenger("Jack", "Bored", 1);
        challengers[1] = new Challenger("Sarah", "Sad", 2);
        challengers[2] = new Challenger("Mike", "Arrogant", 3);
        challengers[3] = new Challenger("Emily", "Kind", 4);
        challengers[4] = new Challenger("John the Muscle Bro", "Competitive", 5);
        challengers[5] = new Challenger("Lisa", "Mean", 1);
        challengers[6] = new Challenger("Tom", "Competitive", 2);
        challengers[7] = new Challenger("Rachel", "Sad", 3);
        challengers[8] = new Challenger("David", "Confident", 4);
        challengers[9] = new Challenger("Jessica the Muscle Gal", "Arrogant", 5);
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
        if (Character.toUpperCase(focus) == 'A') {
            if (equipment == 'Y' || equipment == 'y') {
                for (int i = 0; i < challenges.length; i++) {
                    if (challenges[i].getType().equals("Aerobics") && challenges[i].getEquipment()) {
                        System.out.println(challenges[i].getName() + " - Duration: " + challenges[i].getTime() + " minutes, XP Gain: " + challenges[i].getXpgain());
                    }
                }
            } else {
                for (int i = 0; i < challenges.length; i++) {
                    if (challenges[i].getType().equals("Aerobics") && !challenges[i].getEquipment()) {
                        System.out.println(challenges[i].getName() + " - Duration: " + challenges[i].getTime() + " minutes, XP Gain: " + challenges[i].getXpgain());
                    }
                }
            }
        } else if (Character.toUpperCase(focus) == 'S') {
            if (equipment == 'Y' || equipment == 'y') {
                for (int i = 0; i < challenges.length; i++) {
                    if (challenges[i].getType().equals("Strength") && challenges[i].getEquipment()) {
                        System.out.println(challenges[i].getName() + " - Duration: " + challenges[i].getTime() + " minutes, XP Gain: " + challenges[i].getXpgain());
                    }
                }
            } else {
                for (int i = 0; i < challenges.length; i++) {
                    if (challenges[i].getType().equals("Strength") && !challenges[i].getEquipment()) {
                        System.out.println(challenges[i].getName() + " - Duration: " + challenges[i].getTime() + " minutes, XP Gain: " + challenges[i].getXpgain());
                    }
                }
            }
        } else {
            System.out.println("Invalid input. Please enter A for aerobics or S for strength training.");
        }
    }
}