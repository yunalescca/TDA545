package WeekOne;

import java.util.Random;
import java.util.Scanner;

/**
 * Created by Yunalescca on 2017-07-12.
 */
public class Nim {

    private Scanner scanner;
    private Random random;
    private int currentCoins = 13;
    private boolean playerTurn;

    public Nim(){
        init();
        program();
    }

    private void init(){
        scanner = new Scanner(System.in);
        random = new Random();
        playerTurn = true;
    }

    private void program(){
        System.out.println("Welcome to NIM!\nThere are 13 coins in the pile, and you have to choose either 1,2 or " +
                "3 coins to pick. You win the game by not being the one to pick the last coin! \nExit at any time by " +
                "inputting a 0 into the field. Alright? Let's play!");

        int input, computer;

        while (true) {

            if (playerTurn) { //TODO: split down?
                System.out.print("Pick coins: ");
                input = scanner.nextInt();

                if (input == 0) {
                    break;
                }

                if (input != 1 && input != 2 && input != 3) {
                    System.out.println("Please, only type in valid input!");

                } else if (input > currentCoins) {
                    System.out.println("Not enough coins in the pile!");

                } else {
                    System.out.println("Player took: " + input + " coins");

                    if (input ==  currentCoins) {
                        endGame(true);
                        break;
                    }
                    currentCoins = currentCoins - input;

                    playerTurn = false;
                }

            } else {
                computer = random.nextInt(3) + 1;

                System.out.println("Computer took: " + computer + " coins");

                if (computer == currentCoins) {
                    endGame(false);
                    break;

                } else if (computer > currentCoins){
                    computer = currentCoins;
                }
                currentCoins = currentCoins - computer;
                playerTurn = true;
            }

            System.out.println("There are " + currentCoins + " coins left in the pile");
        }
    }

    /**
     * When there are no more coins in the pile
     * @param playerWon is true if the player is the winner
     */
    private void endGame(boolean playerWon) {
        System.out.print("Game over! Winner is: ");

        if (playerWon) {
            System.out.println("the player");
        } else {
            System.out.println("the computer");
        }
    }

    public static void main(String[] args){
        new Nim();
    }
}
