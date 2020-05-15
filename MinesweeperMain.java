//Philippe Baron Minesweeper

import java.util.Scanner;
import java.util.Arrays;
public class MinesweeperMain {  
  static int a1 = 0;
  static int a2 = 0;
  static int a3 = 0;
  static int guess1 = 0;
  static int guess2 = 0;
  static int end = 0;
  static boolean[][] myArray = new boolean[10][10];
  static int[][] boardNums = new int[10][10];
  static String[][] userArr = new String[10][10];
  static boolean[][] testArr = new boolean[10][10];
    
  
  public static void main(String[] args){
    BoardNumbers board = new BoardNumbers(10,10);
    System.out.println("Welcome to Minesweeper!");
    Scanner scan1 = new Scanner(System.in);
    System.out.println("Would you like to play? Enter 1 for yes and 2 for no.");
    int agree = scan1.nextInt();
    long startTime = 0;
    if(agree == 1){
      for(int x = 0; x<10; x++){
        for(int z = 0; z<10; z++){
          if(userArr[x][z] == null){
            userArr[x][z] = "X";
          }
        }
      }
      System.out.print(" ");
      for(int i = 0; i<10; i++){
        System.out.print( "  " + i);
      }
      System.out.println(" ");
      for(int i = 0; i<10; i++){
        System.out.println( i + " " + Arrays.toString(userArr[i]));
      }
      Scanner scan3 = new Scanner(System.in);
      System.out.println("Enter a row number.");
      guess1 = scan3.nextInt();
      System.out.println("Enter a column number.");
      guess2 = scan3.nextInt();
      boardNums = board.getMines(guess1,guess2);
      ChangeBoard newBoard = new ChangeBoard(boardNums);
      newBoard.openMines(guess1,guess2,2,testArr,userArr);
      for(int x = 0; x<10; x++){
        for(int z = 0; z<10; z++){
          if(userArr[x][z] == null){
            userArr[x][z] = "X";
          }
        }
      }
      for(int i = 0; i<10; i++){
        System.out.print( "  " + i);
      }
      System.out.println(" ");
      for(int i = 0; i<10; i++){
        System.out.println( i + " " + Arrays.toString(userArr[i]));
      }
        
      //scan3.close();
      while(newBoard.endCondition() != 1 && newBoard.endCondition()!= 2){
        newBoard.newArray(testArr,userArr);
      }
      if(newBoard.endCondition() == 2){
        System.out.println("You Won!!");
        for(int x = 0; x<10; x++){
          for(int z = 0; z<10; z++){
            if(boardNums[x][z] == 9){
              userArr[x][z] = "*";
            }
          }
        }
        for(int i = 0; i<10; i++){
          System.out.println(Arrays.toString(userArr[i]));
        }
      }
      else if(newBoard.endCondition() == 1){
        System.out.println(" ");
        System.out.println("You Lost!!");
        System.out.println(" ");
        for(int x = 0; x<10; x++){
          for(int z = 0; z<10; z++){
            if(boardNums[x][z] == 9 ){
              userArr[x][z] = "*";
            }
          }
        }
        for(int i = 0; i<10; i++){
          System.out.println(Arrays.toString(userArr[i]));
        }
      }
    }
    else{
      System.out.println("Ok, Goodbye.");
    }
    //scan1.close();
  }
}
