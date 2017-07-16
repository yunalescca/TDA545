package WeekTwo;

import java.util.Random;
import java.util.Scanner;

/**
 * Created by Yunalescca on 2017-07-13.
 *
 * Index-based version of TicTacToe
 *
 */


public class TicTacToe {


    public enum Winner {
        PLAYER_ONE, PLAYER_TWO, DRAW, NA
    }

    private Random random;
    private Scanner scanner;
    private String[] players;
    private char[][] boardMatrix;
    private boolean playerOneTurn = true;


    public TicTacToe(){
        init();
        program();
    }

    private void init(){
        random = new Random();
        scanner = new Scanner(System.in);
        players = new String[] {"Player 1", "Player 2"}; //TODO: name players? (not used but keep for now)
        char[] boardArr = new char[]{'-', '-', '-', '-', '-', '-', '-', '-', '-'};

        boardMatrix = toMatrix(boardArr);
    }

    private void program(){
        System.out.println("Hello and welcome to TicTacToe! \n\nPlayer 1: X \nPlayer 2: O \n\nYou play" +
                " the game by typing in row followed by column of where you want to place your mark. For instance " +
                "\"2 2\", symbolizes the middle box of the board.\n");

        displayBoard();
        //TODO: choose one/two players

        int inputRow, inputCol;

        while(true) {

            if(playerOneTurn) {
                System.out.print("\nPlayer 1 turn: ");

                inputRow = scanner.nextInt() - 1;
                inputCol = scanner.nextInt() - 1;

                if(boardMatrix[inputRow][inputCol] != '-'){
                    System.out.println("This spot is not empty!");

                } else {
                    update(inputRow, inputCol, 'X');
                    playerOneTurn = false;
                }

            } else {
                System.out.print("\nPlayer 2 turn: ");

                inputRow = scanner.nextInt() - 1;
                inputCol = scanner.nextInt() - 1;

                if(boardMatrix[inputRow][inputCol] != '-'){
                    System.out.println("This spot is not empty!"); //TODO: possibly in update()

                } else {
                    update(inputRow, inputCol, 'O'); //TODO: maybe update() should check whose turn it is and then fill the board accordingly
                    playerOneTurn = true;
                }
            }
        }
    }

    private void update(int row, int col, char mark){
        boardMatrix[row][col] = mark;
        displayBoard();

        Winner status = boardStatus();

        if (status != Winner.NA) {
            gameOver(status);
        }
    }

    /**
     * Checks the status of the game board to see if there exists a winner
     * @return Player 1 or Player 2 if either has won, Draw if no one has won or NA if the game is not finished
     */
    private Winner boardStatus(){ //TODO: create temp variable so I don't have to repeat code?

        char current = boardMatrix[1][1]; //the middle

        if(current == boardMatrix[1][0] && current == boardMatrix[1][2] //horizontally
                || current == boardMatrix[0][1] && current == boardMatrix[2][1] //vertically
                || current == boardMatrix[0][0] && current == boardMatrix[2][2] //diagonally
                || current == boardMatrix[0][2] && current == boardMatrix[2][0]) {

            if(current == 'X'){
                return Winner.PLAYER_ONE;
            } else if (current == 'O'){
                return Winner.PLAYER_TWO;
            }
        }

        current = boardMatrix[0][0]; //top left corner

        if(current == boardMatrix[0][1] && current == boardMatrix[0][2]
                || current == boardMatrix[1][0] && current == boardMatrix[2][0]) {

            if(current == 'X'){
                return Winner.PLAYER_ONE;
            } else if (current == 'O'){
                return Winner.PLAYER_TWO;
            }
        }

        current = boardMatrix[2][2]; //bottom right corner

        if(current == boardMatrix[2][0] && current == boardMatrix[2][1]
                || current == boardMatrix[0][2] && current == boardMatrix[1][2]){

            if(current == 'X'){
                return Winner.PLAYER_ONE;
            } else if (current == 'O'){
                return Winner.PLAYER_TWO;
            }
        }

        if(!isEmpty()) {
            return Winner.DRAW;
        } else {
            return Winner.NA;
        }



    }

    //TODO: improve
    private void gameOver(Winner status){

        if(status == Winner.DRAW) {
            System.out.println("Draw!");
        } else if (status == Winner.PLAYER_ONE) {
            System.out.println("Congratulations Player 1!");
        } else {
            System.out.println("Congratulations Player 2!");
        }


        System.exit(0);
    }

    /**
     * Method for turning an array into a matrix
     * @param arr the board as an array
     * @return the board as a matrix
     */
    private char[][] toMatrix(char[] arr){

        if((arr.length % 3) != 0) {
            return null; //TODO: error msg
        }

        int row = arr.length/3;
        int col = arr.length/3;

        char[][] matrix = new char[row][col];

        int arrayIndex = 0;

        for(int i = 0; i < row; i++) {
            for(int j = 0; j < col; j++) {
                matrix[i][j] = arr[arrayIndex];
                arrayIndex++;
            }
        }

        return matrix;
    }

    /**
     * Checks if the gaming board contains blank spaces
     * @return true if there exist blank space, else false
     */
    private boolean isEmpty() {

        boolean empty = false;

        for(int i = 0; i < boardMatrix.length; i++) {

            for(int j = 0; j < boardMatrix.length; j++) {

                if(boardMatrix[i][j] == '-') {
                    empty = true;
                }

            }

        }
        return empty;
    }

    /**
     * Prints the board
     */
    private void displayBoard(){

        System.out.println();
        for(int i = 0; i < boardMatrix.length; i++) {

            System.out.print("|  ");

            for(int j = 0; j < boardMatrix.length; j++) {
                System.out.print(boardMatrix[i][j] + " ");
            }

            System.out.print("  |");
            System.out.println();
        }
    }

    public static void main(String[] args) {
        new TicTacToe();
    }
}

/*

- startup

- handle turns (two players, alternative one player vs bot?)

- print array as matrix OK

- update to check three in row (horizontally, vertically and diagonally)

- game over (show score, play again?)

*/
