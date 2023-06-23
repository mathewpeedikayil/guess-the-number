import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber {

    Scanner scn = new Scanner(System.in);
    Random rand = new Random();

    private static final int NUMBER_RANGE = 101;
    private static final String QUIT_TEXT = "quit";
    private static final String WELCOME_MSG = "--- Welcome to Guess The Number ! ---";
    private static final String QUIT_MSG = "--- Type 'quit' to end game at anytime ---";
    private static final String GUESS_MSG = "Guess a number between 0 and 100: ";
    private static final String WIN_MSG = "Brilliant! You have guessed correctly!";
    private static final String HIGH_NUMBER_MSG = "Guess again! You have guessed a higher number!";
    private static final String LOW_NUMBER_MSG = "Guess again! You have guessed a lower number!";
    private static final String NEAR_NUMBER_MSG = "Close Shave! You are almost there!";
    private static final String THANKS_PLAYING_MSG = "Thanks for playing !";

    private int randomNumber = rand.nextInt(NUMBER_RANGE); // range between 0 and 100
    private String userInput;
    private int guessedNumber;
    private boolean isEnded;

    /* initiates the game. */
    public void playGame() {
        System.out.println(WELCOME_MSG);
        System.out.println(QUIT_MSG);
        System.out.println();
        isEnded = false;

        // testing
        // System.out.println(randomNumber);
        while(!isEnded) {
            System.out.print(GUESS_MSG);
            userInput = scn.nextLine();
            if(userInput.equals(QUIT_TEXT)) {
                isEnded = true;
            } else {
                guessedNumber = Integer.parseInt(userInput);
                if(guessedNumber == randomNumber) {
                    System.out.println(WIN_MSG);
                    isEnded = true;
                } else if(guessedNumber == randomNumber + 1 || guessedNumber == randomNumber - 1) {
                    System.out.println(NEAR_NUMBER_MSG);
                } else if(guessedNumber > randomNumber) {
                    System.out.println(HIGH_NUMBER_MSG);
                } else {
                    System.out.println(LOW_NUMBER_MSG);
                }
            }
        }
        scn.close();
        System.out.println(THANKS_PLAYING_MSG);
    }

}
