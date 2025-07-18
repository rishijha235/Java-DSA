// package Tic Tac Toe;
import java.util.Scanner;

// Tic Tac Toe game in Java
public class TicTacToe {
    public static void main(String[] args) {
        char[][] board = new char[3][3];

        for(int row = 0; row < board.length; row++) {
            for(int col = 0; col < board[row].length; col++) {
                board[row][col] = ' ';
            }
        }

        char player = 'X';
        boolean gameOver = false;
        Scanner sc = new Scanner(System.in);

        while(!gameOver) {
            printBoard(board);
            System.out.println("Player " + player + ", enter your move (row and column): ");
            int row = sc.nextInt();
            int col = sc.nextInt();

            if (board[row][col] == ' ') {
                //place the element
                board[row][col] = player; // 'X' or 'O'
                gameOver = hasWon(board, player);
                if(gameOver) {
                    System.out.println("Player " + player + " has won!");
                } else {
                    // Switch player
                    player = (player == 'X') ? 'O' : 'X';
                }
            } else {
                System.out.println("This cell is already occupied. Try again!");
            }
        }
        printBoard(board);
    }

    public static boolean hasWon(char[][] board, char player) {
        //check rows
        for(int row = 0; row < board.length; row++) {
            if(board[row][0] == player && board[row][1] == player && board[row][2] == player) {
                return true;
            }
        }

        //check columns
        for(int col = 0; col < board[0].length; col++) {
            if(board[0][col] == player && board[1][col] == player && board[2][col] == player) {
                return true;
            }
        }

        //check diagonals
        if(board[0][0] == player && board[1][1] == player && board[2][2] == player) {
            return true;
        }
        if(board[0][2] == player && board[1][1] == player && board[2][0] == player) {
            return true;
        }
        // win condition not met
        return false;
    }

    public static void printBoard(char[][] board) {
        for(int row = 0; row < board.length; row++) {
            for(int col = 0; col < board[row].length; col++) {
                System.out.print(board[row][col] + " | ");
            }
            System.out.println();
        }
    }
}
