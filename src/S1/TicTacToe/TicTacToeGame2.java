package S1.TicTacToe;

import java.util.Scanner;

// && (!(board[0][0] == 0) || !(board[1][0] == 0)  || !(board[2][0] == 0)))

public class TicTacToeGame2 {
    public static void main(String[] args) {
        int[][] board = new int[3][3];
        boolean player = false;
        int r = 0;
        int c = 0;
        int player1Win = 0;
        int cpuWin = 0;
        int round = 0;
        int eZrow = 0;
        Scanner scan = new Scanner(System.in);

        System.out.println("Welcome to Tic Tac Toe! please enter 1 for X and 2 for O");
        System.out.println("Player 1's turn!");
        for (int[] ints : board) {
            for (int col = 0; col < board[0].length; col++) {
                System.out.print(ints[col] + "\t");
            }
            System.out.println();
        }

        System.out.println();

        gamePlay(board, player1Win, cpuWin, scan, false, r, c, round, eZrow);
    }

    private static void gamePlay(int[][] board, int player1Win, int cpuWin, Scanner scan, boolean player, int r, int c, int round, int eZrow) {
        for (int i = 0; i <= 9; i++) {

            if (board[0][0] == board[0][1] && board[0][1] == board[0][2]) { eZrow = 1;} if (board[1][0] == board[1][1] && board[1][1] == board[1][2]) {eZrow = 2;} if (board[2][0] == board[2][1] && board[2][1] == board[2][2]) {eZrow = 3;}

            switch (eZrow) {
                case 1:
                    if (board[0][0] == 1) {
                        player1Win++;
                        System.out.println("PLAYER 1 WINS!!");
                        System.out.println("P1: "+ player1Win+ " P2: " + cpuWin);
                    } else if (board[0][0] == 2) {
                        cpuWin++;
                        System.out.println("PLAYER 2 WINS!!");
                        System.out.println("P1: "+ player1Win+ " P2: " + cpuWin);
                    }
                    break;
                case 2:
                    if (board[1][0] == 1) {
                        player1Win++;
                        System.out.println("PLAYER 1 WINS!!");
                        System.out.println("P1: "+ player1Win+ " P2: " + cpuWin);
                    } else if (board[1][0] == 2) {
                        cpuWin++;
                        System.out.println("PLAYER 2 WINS!!");
                        System.out.println("P1: "+ player1Win+ " P2: " + cpuWin);
                    }
                    break;
                case 3:
                    if (board[2][0] == 1) {
                        player1Win++;
                        System.out.println("PLAYER 1 WINS!!");
                        System.out.println("P1: "+ player1Win+ " P2: " + cpuWin);
                    } else if (board[2][0] == 2) {
                        cpuWin++;
                        System.out.println("PLAYER 2 WINS!!");
                        System.out.println("P1: "+ player1Win+ " P2: " + cpuWin);
                    }
                    break;
            }

        if ((board[0][0] == board[1][0] && board[1][0] == board[2][0]) && (board[0][0] != 0)) {
                if (board[0][0] == 1) {
                    player1Win++;
                    System.out.println("PLAYER 1 WINS!!");
                    System.out.println("P1: "+ player1Win+ " P2: " + cpuWin);
                } else if (board[0][0] == 2){
                    cpuWin++;
                    System.out.println("PLAYER 2 WINS!!");
                    System.out.println("P1: "+ player1Win+ " P2: " + cpuWin);
                }
            }
            if ((board[0][1] == board[1][1] && board[1][1] == board[2][1]) && (board[0][1] != 0)) {
                if (board[0][1] == 1) {
                    player1Win++;
                    System.out.println("PLAYER 1 WINS!!");
                    System.out.println("P1: "+ player1Win+ " P2: " + cpuWin);
                } else if (board[0][1] == 2){
                    cpuWin++;
                    System.out.println("PLAYER 2 WINS!!");
                    System.out.println("P1: "+ player1Win+ " P2: " + cpuWin);
                }
            }
            if ((board[0][2] == board[1][2] && board[1][2] == board[2][2]) && (board[0][2] != 0)) {
                if (board[0][2] == 1) {
                    player1Win++;
                    System.out.println("PLAYER 1 WINS!!");
                    System.out.println("P1: "+ player1Win+ " P2: " + cpuWin);
                } else if (board[0][2] == 2 ){
                    cpuWin++;
                    System.out.println("PLAYER 2 WINS!!");
                    System.out.println("P1: "+ player1Win+ " P2: " + cpuWin);
                }
            }
            if ((board[0][0] == board[1][1] && board[1][1] == board[2][2]) && (board[0][0] != 0)) {
                if (board[0][0] == 1) {
                    player1Win++;
                    System.out.println("PLAYER 1 WINS!!");
                    System.out.println("P1: "+ player1Win+ " P2: " + cpuWin);
                } else if (board[0][0] == 2){
                    cpuWin++;
                    System.out.println("PLAYER 2 WINS!!");
                    System.out.println("P1: "+ player1Win+ " P2: " + cpuWin);
                }
            }
            if ((board[0][2] == board[1][1] && board[1][1] == board[2][0]) && (board[0][2] != 0)) {
                if (board[0][2] == 1) {
                    player1Win++;
                    System.out.println("PLAYER 1 WINS!!");
                    System.out.println("P1: "+ player1Win+ " P2: " + cpuWin);
                } else if (board[0][2] == 2){
                    cpuWin++;
                    System.out.println("PLAYER 2 WINS!!");
                    System.out.println("P1: "+ player1Win+ " P2: " + cpuWin);
                }
            }
            System.out.print("Please enter 1-3 for the row: ");
            r = scan.nextInt()-1;
            System.out.print("Please enter 1-3 for the column: ");
            c = scan.nextInt()-1;

            if (!(r < 3) || !(c < 3)) {
                System.out.println("Out of bounds, try again");
                i--;
            } else if (board[r][c] == 0) {
                if(!player) {
                    board[r][c]=1;
                    player = true;
                    System.out.println("Player 2's turn!");
                } else {
                    board[r][c]=2;
                    player = false;
                    System.out.println("Player 1's turn!");
                }
            } else {
                System.out.println("This spot is already taken");
                i--;
            }
            for (int[] ints : board) {
                for (int col = 0; col < board[0].length; col++) {
                    System.out.print(ints[col] + "\t");
                }
                System.out.println();
            }

            if (player) {
                System.out.println("Player 2's turn!");
            } else {
                System.out.println("Player 1's turn!");

            }

        }
        System.out.println("Next Round!");
        round++;
        gamePlay(board, player1Win, cpuWin, scan, player, r, c, round, eZrow);

    }
}

