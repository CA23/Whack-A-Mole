/**
 * Created by CA23 on 1/7/17.
 */
import java.util.*;
public class WhackAMole {
    int score;
    int molesLeft;
    int attemptsLeft;
    char[][] moleGrid;

    WhackAMole(int numAttempts, int gridDimension){
        int attemptsLeft = numAttempts;
        char[][] moleGrid = new char[gridDimension][gridDimension];
    }

    public boolean place(int x, int y){
        if (x <= moleGrid[1].length && y <= moleGrid[1].length && moleGrid[x][y] != 'W'){
            moleGrid[x][y] = 'M';
            return true;
        }
        else{
            return false;
        }
    }
    void whack(int x, int y){
        if (x <= moleGrid[0].length && y <= moleGrid[0].length){
            moleGrid[x][y] = 'W';
        }
    }
    void printGridToUser(){
        for (int i = 0; i <= moleGrid[0].length; i ++ ){
            for (int j = 0; j <= moleGrid[0].length; j ++ ){
                if (moleGrid[i][j] == 'M'){
                    System.out.print('*');
                }
                else{
                    System.out.print(moleGrid[i][j]);
                }

            }
            System.out.println();
        }
    }

    void printActualGrid(){
        for (int i = 0; i < moleGrid[0].length; i ++){
            for (int j = 0; j < moleGrid[0].length; j ++){
                System.out.print(moleGrid[i][j]);
            }
            System.out.println();
        }
    }

    public static void main(String[] args){
        WhackAMole game = new WhackAMole(50, 10);
        for (int j = 0; j < WhackAMole.moleGrid[1].length; j ++){
            for (int k = 0; k < WhackAMole.moleGrid[1].length; k++){
                WhackAMole.moleGrid[i][j] = '*';
            }
        }
        Random rand = new Random();
        for (int r = 0; r < WhackAMole.moleGrid[0].length; r++){
            int m = rand.nextInt(moleGrid[0].length);
            int n = rand.nextInt(moleGrid[0].length);
            WhackAMole.place(m, n);
        }
        while (WhackAMole.attemptsLeft > 0){
            WhackAMole.printGridToUser();
            System.out.println("attempts left: "+WhackAMole.attemptsLeft);
            System.out.println("Pick your x and y coordinates to whack, Enter each and press ENTER: ");
            Scanner read = new Scanner(System.in);
            int a = Integer.parseInt(read.nextLine());
            int b = Integer.parseInt(read.nextLine());
            if (a != -1 && b != -1){
                WhackAMole.whack();
                WhackAMole.attemptsLeft = WhackAMole.attemptsLeft - 1;
                WhackAMole.printGridToUser();
            }
            else{
                System.out.print("try again later, well played");
                WhackAMole.printActualGrid();
                WhackAMole.attemptsLeft = 0;
            }

        }
        WhackAMole.printActualGrid();
        System.out.println("End of Game");

    }



}

