import java.util.Scanner;
public class BattleOfTheBrawns {
    public static void main(String[] args) {
        // Initialize variables here
        Scanner input = new Scanner(System.in);
        Exercise[] challenges = new Exercise[15];
        int playerRank = 1;
        int playerXP = 0;
        int maxXP = 50;
        int randomChallenger = 0;
        int reps = 0;
        int length = 0;
        boolean inputGood = false;
        boolean playAgain = true;
        char continuePlaying = 'G';
        Challenger challenger = null;
        // Challenges
        challenges[0] = new Exercise("Push-ups", "Strength", 10.0, 10, false);
        challenges[1] = new Exercise("Jumping Jacks", "Aerobics", 5.0, 10, false);
        challenges[2] = new Exercise("Squats", "Strength", 10.0, 10, false);
        challenges[3] = new Exercise("Burpees", "Aerobics", 5.0, 10, false);
        challenges[4] = new Exercise("Lunges", "Strength", 10.0, 10, false);
        challenges[5] = new Exercise("Mountain Climbers", "Aerobics", 5.0, 10, false);
        challenges[6] = new Exercise("Squat Jumps", "Aerobics", 5.0, 10, false);
        challenges[7] = new Exercise("High Knees", "Aerobics", 5.0, 10, false);
        challenges[8] = new Exercise("Bicep Curls", "Strength", 10.0, 10, true);
        challenges[9] = new Exercise("Jump Rope", "Aerobics", 5.0, 10, true);
        challenges[10] = new Exercise("Bench Press", "Strength", 10.0, 10, true);
        challenges[11] = new Exercise("Pull-ups", "Strength", 10.0, 10, true);
        challenges[12] = new Exercise("Dumbbell Rows", "Strength", 10.0, 10, true);
        challenges[13] = new Exercise("Kettlebell Swings", "Strength", 10.0, 10, true);
        challenges[14] = new Exercise("Resistance Band Reps", "Strength", 10.0, 10, true);

        // Personalities
        Personality bored = new Personality("Bored");
        Personality mean = new Personality("Mean");
        Personality sad = new Personality("Sad");
        Personality competitive = new Personality("Competitive");
        Personality arrogant = new Personality("Arrogant");
        Personality kind = new Personality("Kind");

        Challenger[] challengers = new Challenger[10];
        // Challengers
        challengers[0] = new Challenger("Jack", bored, 1);
        challengers[1] = new Challenger("Lisa", mean, 1);
        challengers[2] = new Challenger("Sarah", sad, 2);
        challengers[3] = new Challenger("Joan", competitive, 2);
        challengers[4] = new Challenger("Mike", arrogant, 3);
        challengers[5] = new Challenger("Rachel", sad, 3);
        challengers[6] = new Challenger("Emily", kind, 4);
        challengers[7] = new Challenger("David", mean, 4);
        challengers[8] = new Challenger("John the Muscle Bro", competitive, 5);
        challengers[9] = new Challenger("Jessica the Muscle Gal", arrogant, 5);


        // Get user input for name, duration, equipment, and focus
        System.out.println("Welcome to the Battle of the Brawns!");
        System.out.println("What is your name?");
        String name = input.nextLine();
        while (playAgain) {
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
            if (Character.toUpperCase(equipment) == 'Y') {
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
            if (Character.toUpperCase(equipment) == 'Y') {
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
        System.out.println("Which challenge would you like to attempt? Please enter the name of the challenge exactly as it appears above.");
        input.nextLine();
        String selectedChallenge = input.nextLine();
        for (int i = 0; i < challenges.length; i++) {
            System.out.println("Comparing: " + challenges[i].getName() + " and " + selectedChallenge);
            if (challenges[i].getName().equals(selectedChallenge)) {
                inputGood = true;
                break;
            }
        }
        if (!inputGood) {
            System.out.println("Invalid input. Please enter the exercise exactly as it appeared above.");
            System.exit(0);
        }
        System.out.println("You have selected: " + selectedChallenge);
        randomChallenger = (int)(Math.random());
        System.out.println("Now, let's see which challenger you will face! Your opponent is...");
        if (randomChallenger == 0 && playerRank == 1) {
            System.out.println(challengers[0].getName() + "!");
            challenger = challengers[0];
        } else if (randomChallenger == 1 && playerRank == 1) {
            System.out.println(challengers[1].getName() + "!");
            challenger = challengers[1];
        } else if (randomChallenger == 0 && playerRank == 2) {
            System.out.println(challengers[2].getName() + "!");
            challenger = challengers[2];
        } else if (randomChallenger == 1 && playerRank == 2) {
            System.out.println(challengers[3].getName() + "!");
            challenger = challengers[3];
        } else if (randomChallenger == 0 && playerRank == 3) {
            System.out.println(challengers[4].getName() + "!");
            challenger = challengers[4];
        } else if (randomChallenger == 1 && playerRank == 3) {
            System.out.println(challengers[5].getName() + "!");
            challenger = challengers[5];
        } else if (randomChallenger == 0 && playerRank == 4) {
            System.out.println(challengers[6].getName() + "!");
            challenger = challengers[6];
        } else if (randomChallenger == 1 && playerRank == 4) {
            System.out.println(challengers[7].getName() + "!");
            challenger = challengers[7];
        } else if (randomChallenger == 0 && playerRank == 5) {
            System.out.println(challengers[8].getName() + "!");
            challenger = challengers[8];
        } else if (randomChallenger == 1 && playerRank == 5) {
            System.out.println(challengers[9].getName() + "!");
            challenger = challengers[9];
        }
        System.out.println(challenger.getName() + ": " + challenger.getPersonality().getPersonalityDialogue(challenger.getPersonality().getPersonalityType()));
        System.out.println(challenger.getName() + "'s score was: " + challenger.getRank() * 10 + " reps. Try to beat it! Come back here when you are done and enter the number of reps you completed.");
        reps = input.nextInt();
        if (reps > challenger.getRank() * 10) {
            System.out.println("Congratulations! You beat " + challenger.getName() + "'s score of " + challenger.getRank() * 10 + " reps!");
            playerXP += 10;
            if (playerXP > maxXP) {
                playerXP = maxXP;
                System.out.println("You ranked up! Your rank is now: " + playerRank);
                playerRank++;
                playerXP = 0;
            }
            System.out.println("You gained 10 XP! Your total XP is now: " + playerXP);
            System.out.println("Would you like to continue playing? (Y/N)");
            continuePlaying = input.next().charAt(0);
            do {
                if (Character.toUpperCase(continuePlaying) == 'N') {
                    playAgain = false;
                    System.out.println("Thank you for playing Battle of the Brawns! Your final rank is: " + playerRank + " and your total XP is: " + playerXP);
                } else if (Character.toUpperCase(continuePlaying) == 'Y') {
                    playAgain = true;
                } else {
                    System.out.println("Invalid input. Please enter Y or N.");
                }
            } while (Character.toUpperCase(continuePlaying) != 'Y' && Character.toUpperCase(continuePlaying) != 'N');
        } else {
            System.out.println("Sorry, you did not beat " + challenger.getName() + "'s score of " + challenger.getRank() * 10 + " reps. Better luck next time!");
            System.out.println("Would you like to continue playing? (Y/N)");
            continuePlaying = input.next().charAt(0);
            do {
                if (Character.toUpperCase(continuePlaying) == 'N') {
                    playAgain = false;
                    System.out.println("Thank you for playing Battle of the Brawns! Your final rank is: " + playerRank + " and your total XP is: " + playerXP);
                } else if (Character.toUpperCase(continuePlaying) == 'Y') {
                    playAgain = true;
                } else {
                    System.out.println("Invalid input. Please enter Y or N.");
                }
            } while (Character.toUpperCase(continuePlaying) != 'Y' && Character.toUpperCase(continuePlaying) != 'N');
        }
    }
    }
}