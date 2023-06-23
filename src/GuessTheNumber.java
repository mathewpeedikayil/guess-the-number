import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber {

    Scanner scn = new Scanner(System.in);
    Random rand = new Random();

    private static final int NUMBER_RANGE = 101;
    private static final String WELCOME_MSG = "--- Welcome to Guess The Number ! ---";
    private static final String QUIT_MSG = "--- Type 'quit' to end game at anytime ---";
    private static final String GUESS_MSG = "Guess a number between 0 and 100: ";
    private static final String THANKS_PLAYING_MSG = "Thanks for playing !";

    private int randomNumber = rand.nextInt(NUMBER_RANGE); // range between 0 and 100
    private String userInput;
    private boolean isEnded;

    /* initiates the game. */
    public void playGame() {
        System.out.println(WELCOME_MSG);
        System.out.println(QUIT_MSG);
        System.out.println();
        isEnded = false;

        while(!isEnded) {
            System.out.print(GUESS_MSG);
            userInput = scn.nextLine();
            if(userInput.equals("quit")) {
                isEnded = true;
            }
        }
        scn.close();
        System.out.println(THANKS_PLAYING_MSG);
    }

}
