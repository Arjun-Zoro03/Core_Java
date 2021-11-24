import java.util.ArrayList;
import java.util.Scanner;

public class Proj6_2_TicTacToe {
    public static void main(String[] args) {
        ArrayList<String> board = new ArrayList<>(3);
        boolean turn = true; //if player is X turn is true
        Scanner sc = new Scanner(System.in);
        int row, column;

        initializeGame(board);
        printCurrentBoard(board);

        while(gameOver(board) == false){
            if (turn){
                System.out.println("PLayer (X) has to make a move, enter the row, column: ");
                row = sc.nextInt();
                column = sc.nextInt();
                if (cellAlreadyOccupied(row,column,board) == false){
                    getUserInput("X",row,column,board);
                    turn = false;
                }
                else
                    System.out.println("Cell already occupied, please choose another cell.");
            }
            else{
                System.out.println("PLayer (O) has to make a move, enter the row, column: ");
                row = sc.nextInt();
                column = sc.nextInt();
                if (cellAlreadyOccupied(row,column,board) == false){
                    getUserInput("O",row,column,board);
                    turn = true;
                }
                else
                    System.out.println("Cell already occupied, please choose another cell.");
            }
            printCurrentBoard(board);
        }
    }

    public static void initializeGame(ArrayList<String> board){
        for(int i = 0;i < 3;i++)
            board.add("   ");
    }

    public static void printCurrentBoard(ArrayList<String> board) {
        System.out.println();
        for(int i = 0; i < board.size(); i++) {
            for (int j = 0; j < board.get(i).length(); j++) {
                System.out.print(board.get(i).charAt(j));
                if (j<2)
                    System.out.print(" | ");
            }
            if (i<2)
                System.out.println("\n" + "_ _ _ _ _");
        }
        System.out.println();
    }

    public static void getUserInput(String playerTurn, int row, int column, ArrayList<String> board){
        StringBuilder newRow = new StringBuilder(board.get(row));
        newRow.replace(column,column+1,playerTurn);
        String finalRow = new String(newRow);
        board.set(row, finalRow);
    }

    public static boolean cellAlreadyOccupied(int row, int column, ArrayList<String> board){
        if (row > 2 || column > 2) {
            System.out.println("Values only between 0 and 2 are allowed");
            return true;
        }
        else if (Character.compare(board.get(row).charAt(column),' ') != 0) {
            return true;
        }
        else
            return false;
    }

    public static boolean gameOver(ArrayList<String> board){
        //horizontal winner
        for(String row: board) {
            if (row.equals("XXX")) {
                System.out.println("Player (X) is the winner!");
                return true;
            } else if (row.equals("OOO")) {
                System.out.println("Player (O) is the winner!");
                return true;
            }
        }

        //Diagonal winner
        if (Character.compare(board.get(0).charAt(0),' ') != 0 &&
                board.get(0).charAt(0) == board.get(1).charAt(1) && board.get(0).charAt(0) == board.get(2).charAt(2)) {
            System.out.println("Player " + "(" + board.get(0).charAt(0) + ")" + " is the winner!");
            return true;
        }

        else if (Character.compare(board.get(0).charAt(2),' ') != 0 &&
                board.get(0).charAt(2) == board.get(1).charAt(1) && board.get(0).charAt(2) == board.get(2).charAt(0)) {
            System.out.println("Player " + "(" + board.get(0).charAt(2) + ")" + " is the winner!");
            return true;
        }

        //vertical winner column0
        else if (Character.compare(board.get(0).charAt(0),' ') != 0 &&
                board.get(0).charAt(0) == board.get(1).charAt(0) && board.get(0).charAt(0) == board.get(2).charAt(0)) {
            System.out.println("Player " + "(" + board.get(0).charAt(2) + ")" + " is the winner!");
            return true;
        }

        //vertical winner column1
        else if (Character.compare(board.get(0).charAt(1),' ') != 0 &&
                board.get(0).charAt(1) == board.get(1).charAt(1) && board.get(0).charAt(1) == board.get(2).charAt(1)) {
            System.out.println("Player " + "(" + board.get(0).charAt(1) + ")" + " is the winner!");
            return true;
        }

        //vertical winner column2
        else if (Character.compare(board.get(0).charAt(2),' ') != 0 &&
                board.get(0).charAt(2) == board.get(1).charAt(2) && board.get(0).charAt(2) == board.get(2).charAt(2)) {
            System.out.println("Player " + "(" + board.get(0).charAt(2) + ")" + " is the winner!");
            return true;
        }

        else{
            //board is full
            for(int i = 0; i < board.size(); i++) {
                for (int j = 0; j < board.get(i).length(); j++) {
                    if (cellAlreadyOccupied(i,j,board))
                        continue;
                    else
                        return false;
                }
            }
            System.out.println("board is full, no winner");
            return true;
        }
    }

}
