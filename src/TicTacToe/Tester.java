package TicTacToe;

import java.util.*;
public class Tester
{
    public static void main(String args[])
    {
        Scanner scan=new Scanner(System.in);
        String player1="O";
        String player2="X";
        int rowSelect=0;
        int colSelect=0;
        int winner1=0;
        int winner2=0;
        int exit=1;
        String[][] board=new String[3][3];
        for(int row=0; row<board.length; row++)
        {
            for(int col=0; col<board.length; col++)
            {
                board[row][col]=" ";
            }
        }

        System.out.println("Welcom to Tic Tac Toe!");
        System.out.println(" ");
        do{

            System.out.println("Do you want to play again? Type 1 for yes or 2 for no");
            exit=scan.nextInt();
            System.out.print("");
            if(exit==1)
            {
                for(int i=0; i<9; i++)
                {
                    System.out.println("Player 1 choose your position.");
                    System.out.print("Select row. Input 1, 2, or 3 \n Input:");
                    rowSelect=scan.nextInt();
                    System.out.print("Select column. Input 1, 2, or 3 \n Input:");
                    colSelect=scan.nextInt();
                    board[rowSelect -1][colSelect-1]=player1;
                    System.out.println(" "+board[0][0]+" | "+board[0][1]+" | "+board[0][2]+" \n---|---|---\n "+board[1][0]+" | "+board[1][1]+" | "+board[1][2]+" \n---|---|---\n "+board[2][0]+" | "+board[2][1]+" | "+board[2][2]+" ");

                    if(board[0][0].equals(player1) & board[0][1].equals(player1) & board[0][2].equals(player1) || board[1][0].equals(player1) & board[1][1].equals(player1) & board[1][2].equals(player1) || board[2][0].equals(player1) & board[2][1].equals(player1) & board[2][2].equals(player1))
                    {
                        for(int row=0; row<board.length; row++)
                        {
                            for(int col=0; col<board.length; col++)
                            {
                                board[row][col]=" ";
                            }
                        }
                        winner1++;
                        System.out.println("Player 1 wins this round, on to the next round!!");
                        System.out.println("Player 1:"+winner1+"pts.  Player 2="+winner2+"pts.");
                        System.out.print("");
                    }
                    else if(board[0][0].equals(player1) & board[1][0].equals(player1) & board[2][0].equals(player1) || board[0][1].equals(player1) & board[1][1].equals(player1) & board[2][1].equals(player1) || board[0][2].equals(player1) & board[1][2].equals(player1) & board[2][2].equals(player1))
                    {
                        for(int row=0; row<board.length; row++)
                        {
                            for(int col=0; col<board.length; col++)
                            {
                                board[row][col]=" ";
                            }
                        }
                        winner1++;
                        System.out.println("Player 1 wins this round, on to the next round!!");
                        System.out.println("Player 1:"+winner1+"pts.  Player 2="+winner2+"pts.");
                        System.out.print("");
                    }
                    else if(board[0][0].equals(player1) & board[1][1].equals(player1) & board[2][2].equals(player1) || board[0][2].equals(player1) & board[1][1].equals(player1) & board[2][2].equals(player1))
                    {
                        for(int row=0; row<board.length; row++)
                        {
                            for(int col=0; col<board.length; col++)
                            {
                                board[row][col]=" ";
                            }
                        }
                        winner1++;
                        System.out.println("Player 1 wins this round, on to the next round!!");
                        System.out.println("Player 1:"+winner1+"pts.  Player 2="+winner2+"pts.");
                        System.out.print("");
                    }
                    System.out.println("Player 2 choose your position.");
                    System.out.print("Select row. Input 1, 2, or 3 \n Input:");
                    rowSelect=scan.nextInt();
                    System.out.print("Select column. Input 1, 2, or 3 \n Input:");
                    colSelect=scan.nextInt();
                    board[rowSelect -1][colSelect-1]=player2;
                    System.out.println(" "+board[0][0]+" | "+board[0][1]+" | "+board[0][2]+" \n---|---|---\n "+board[1][0]+" | "+board[1][1]+" | "+board[1][2]+" \n---|---|---\n "+board[2][0]+" | "+board[2][1]+" | "+board[2][2]+" ");

                    if(board[0][0].equals(player2) & board[0][1].equals(player2) & board[0][2].equals(player2) || board[1][0].equals(player2) & board[1][1].equals(player2) & board[1][2].equals(player2) || board[2][0].equals(player2) & board[2][1].equals(player2) & board[2][2].equals(player2))
                    {
                        for(int row=0; row<board.length; row++)
                        {
                            for(int col=0; col<board.length; col++)
                            {
                                board[row][col]=" ";
                            }
                        }
                        winner2++;
                        System.out.println("Player 2 wins this round, on to the next round!!");
                        System.out.println("Player 1:"+winner1+"pts.  Player 2="+winner2+"pts.");
                        System.out.print("");
                    }
                    else if(board[0][0].equals(player2) & board[1][0].equals(player2) & board[2][0].equals(player2) || board[0][1].equals(player2) & board[1][1].equals(player2) & board[2][1].equals(player2) || board[0][2].equals(player2) & board[1][2].equals(player2) & board[2][2].equals(player2))
                    {
                        for(int row=0; row<board.length; row++)
                        {
                            for(int col=0; col<board.length; col++)
                            {
                                board[row][col]=" ";
                            }
                        }
                        winner2++;
                        System.out.println("Player 2 wins this round, on to the next round!!");
                        System.out.println("Player 1:"+winner1+"pts.  Player 2="+winner2+"pts.");
                        System.out.print("");
                    }
                    else if(board[0][0].equals(player2) & board[1][1].equals(player2) & board[2][2].equals(player2) || board[0][2].equals(player2) & board[1][1].equals(player2) & board[2][0].equals(player2))
                    {
                        for(int row=0; row<board.length; row++)
                        {
                            for(int col=0; col<board.length; col++)
                            {
                                board[row][col]=" ";
                            }
                        }
                        winner2++;
                        System.out.println("Player 2 wins this round, on to the next round!!");
                        System.out.println("Player 1:"+winner1+"pts.  Player 2="+winner2+"pts.");
                        System.out.print("");
                    }
                }
                for(int row=0; row<board.length; row++)
                {
                    for(int col=0; col<board.length; col++)
                    {
                        board[row][col]=" ";
                    }
                }
            }
            else{
                System.out.print("");
                System.out.println("Thank you for playing");
            }
        }while(exit==1);
    }
}
