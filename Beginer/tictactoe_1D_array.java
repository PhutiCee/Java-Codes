import java.util.Scanner;

public class TicTacToe1D {
    public static void main(String[] args) {
        char[] board = {'-', '-', '-', '-', '-', '-', '-', '-', '-'};
        char currentPlayer = 'X';
        Scanner scanner = new Scanner(System.in);
        boolean gameOn = true;

        while (gameOn) {
            // Print the board
            System.out.println("Board:");
            for (int i = 0; i < 9; i++) {
                System.out.print(board[i] + " ");
                if ((i + 1) % 3 == 0) {
                    System.out.println();
                }
            }

            // Player move
            int move;
            while (true) {
                System.out.println("Player " + currentPlayer + ", enter your move (1-9): ");
                move = scanner.nextInt() - 1;

                if (move >= 0 && move < 9 && board[move] == '-') {
                    board[move] = currentPlayer;
                    break;
                } else {
                    System.out.println("Invalid move, try again.");
                }
            }

            // Check for a win
            if ((board[0] != '-' && board[0] == board[1] && board[1] == board[2]) || // Row 1
                (board[3] != '-' && board[3] == board[4] && board[4] == board[5]) || // Row 2
                (board[6] != '-' && board[6] == board[7] && board[7] == board[8]) || // Row 3
                (board[0] != '-' && board[0] == board[3] && board[3] == board[6]) || // Column 1
                (board[1] != '-' && board[1] == board[4] && board[4] == board[7]) || // Column 2
                (board[2] != '-' && board[2] == board[5] && board[5] == board[8]) || // Column 3
                (board[0] != '-' && board[0] == board[4] && board[4] == board[8]) || // Diagonal 1
                (board[2] != '-' && board[2] == board[4] && board[4] == board[6])) { // Diagonal 2
                gameOn = false;
                System.out.println("============================\nPlayer " + currentPlayer + " wins!");
            } else {
                // Check for a draw
                boolean draw = true;
                for (int i = 0; i < 9; i++) {
                    if (board[i] == '-') {
                        draw = false;
                        break;
                    }
                }

                if (draw) {
                    gameOn = false;
                    System.out.println("It's a draw!");
                } else {
                    // Switch player
                    if (currentPlayer == 'X') {
                        currentPlayer ='O';
                    }else {
                        currentPlayer = 'X';
                        
                    }
                }
            }
        }

        // Print final board
        System.out.println("============================\nFinal Board:");
        for (int i = 0; i < 9; i++) {
            System.out.print(board[i] + " ");
            if ((i + 1) % 3 == 0) {
                System.out.println();
            }
        }

        scanner.close();
    }
}