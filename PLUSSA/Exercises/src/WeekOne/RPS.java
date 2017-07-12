package WeekOne;

import java.util.Random;
import java.util.Scanner;

/**
 * Created by Yunalescca on 2017-07-11.
 *
 * Rock - Paper - Scissors
 */
public class RPS {

    private int playerScore = 0;
    private int computerScore = 0;
    private Scanner scanner;
    private Random random;

    public RPS(){
        init();
        program();
    }

    private void init(){
        System.out.println("Welcome to Rock, Paper, Scissors!");
        scanner = new Scanner(System.in);
        random = new Random();
    }

    private void program(){

        int input, compChoice;

        while (true) {
            System.out.println("Select 1, 2 or 3 (for R, P, S). Type 0 to stop playing: ");

            input = scanner.nextInt();


            if (input == 0) {
                break;
            }

            if(input != 1 && input != 2 && input != 3){
                System.out.println("Please type in correct input!");

            } else {
                compChoice = random.nextInt(3) + 1;

                System.out.println("Computer chose: " + compChoice);

                if (input == compChoice) {
                    System.out.println("A draw");

                } else {

                    if (input == 1 && compChoice == 2 || input == 2 && compChoice == 3 || input == 3 && compChoice == 1) {
                        increaseComputerScore();
                    } else {
                        increasePlayerScore();
                    }
                }
            }
        }

        gameOver();

    }

    /**
     * When the game is over (the user pressed 0)
     */
    private void gameOver() {
        System.out.println("\n\nScore\n=====");
        System.out.println("Player: " + playerScore + " || Computer: " + computerScore);

        if (playerScore > computerScore) {
            System.out.println("You won the game!");
        } else if (playerScore < computerScore) {
            System.out.println("You lost the game!");
        } else {
            System.out.println("Draw!");
        }
    }

    private void increasePlayerScore(){
        playerScore++;
        System.out.println("You won!");
    }

    private void increaseComputerScore(){
        computerScore++;
        System.out.println("You lost!");
    }

    public static void main(String[] args){
        new RPS();
    }
}
