import java.util.Scanner;
import java.util.Arrays;
public class ChangeBoard{
  
  private static int[][] newMines = new int[10][10]; 
  private static int end = 0;
  
  public ChangeBoard(int[][] numArr){
    newMines = numArr;
  } 
 
  public static int endCondition(){
    if(end == 1){
      return 1;
    }
    else if(end == 2){
      return 2;
    }
    return 0;
  }
 
  public static void checkSurroundings(int a, int b, boolean[][] testArr, String[][] userArr){
    if(a>0 && a<9 && b>0 && b<9 && newMines[a][b] == 0){
      testArr[a][b] = true;
      userArr[a][b] = "0";
      if(newMines[a][b+1] < 9 && newMines[a][b+1] != 0){
        userArr[a][b+1]= Integer.toString(newMines[a][b+1]);
        testArr[a][b+1] = true;
      }
      if(newMines[a][b-1] < 9 && newMines[a][b-1] != 0){
        userArr[a][b-1]= Integer.toString(newMines[a][b-1]);
        testArr[a][b-1] = true;
      }
      if(newMines[a-1][b] < 9 && newMines[a-1][b] != 0){
        userArr[a-1][b]= Integer.toString(newMines[a-1][b]);
        testArr[a-1][b] = true;
      }
      if(newMines[a-1][b-1] < 9 && newMines[a-1][b-1] != 0){
        userArr[a-1][b-1]= Integer.toString(newMines[a-1][b-1]);
        testArr[a-1][b-1] = true;
      }
      if(newMines[a-1][b+1] < 9 && newMines[a-1][b+1] != 0){
        userArr[a-1][b+1]= Integer.toString(newMines[a-1][b+1]);
        testArr[a-1][b+1] = true;
      }
      if(newMines[a+1][b] < 9 && newMines[a+1][b] != 0){
        userArr[a+1][b]= Integer.toString(newMines[a+1][b]);
        testArr[a+1][b] = true;
      }
      if(newMines[a+1][b-1] < 9 && newMines[a+1][b-1] != 0){
        userArr[a+1][b-1]= Integer.toString(newMines[a+1][b-1]);
        testArr[a+1][b-1] = true;
      }
      if(newMines[a+1][b+1] < 9 && newMines[a+1][b+1] != 0){
        userArr[a+1][b+1]= Integer.toString(newMines[a+1][b+1]);
        testArr[a+1][b+1] = true;
      } 
    }
    else if(a>0 && a<9 && b>0 && b<9 && newMines[a][b] > 0 && newMines[a][b] < 9){
      userArr[a][b] = Integer.toString(newMines[a][b]);
      testArr[a][b] = true;
    }
    else if(a==0 && b<9 && b>0 && newMines[a][b] == 0){
      userArr[a][b] = "0";
      testArr[a][b] = true;
      if(newMines[a][b+1] < 9 && newMines[a][b+1] != 0){
        userArr[a][b+1]= Integer.toString(newMines[a][b+1]);
        testArr[a][b+1] = true;
      }
      if(newMines[a][b-1] < 9 && newMines[a][b-1] != 0){
        userArr[a][b-1]= Integer.toString(newMines[a][b-1]);
        testArr[a][b-1] = true;
      }
      if(newMines[a+1][b] < 9 && newMines[a+1][b] != 0){
        userArr[a+1][b]= Integer.toString(newMines[a+1][b]);
        testArr[a+1][b] = true;
      }
      if(newMines[a+1][b-1] < 9 && newMines[a+1][b-1] != 0){
        userArr[a+1][b-1]= Integer.toString(newMines[a+1][b-1]);
        testArr[a+1][b-1] = true;
      }
      if(newMines[a+1][b+1] < 9 && newMines[a+1][b+1] != 0){
        userArr[a+1][b+1]= Integer.toString(newMines[a+1][b+1]);
        testArr[a+1][b+1] = true;
      }
    }
    else if(a==0 && b<9 && b>0 && newMines[a][b] < 9){
      userArr[a][b] = Integer.toString(newMines[a][b]);
      testArr[a][b] = true;
    }
    else if(a==9 && b<9 && b>0 && newMines[a][b] == 0){
      userArr[a][b] = "0";
      testArr[a][b] = true;
      if(newMines[a][b+1] < 9 && newMines[a][b+1] != 0){
        userArr[a][b+1]= Integer.toString(newMines[a][b+1]);
        testArr[a][b+1] = true;
      }
      if(newMines[a][b-1] < 9 && newMines[a][b-1] != 0){
        userArr[a][b-1]= Integer.toString(newMines[a][b-1]);
        testArr[a][b-1] = true;
      }
      if(newMines[a-1][b] < 9 && newMines[a-1][b] != 0){
        userArr[a-1][b]= Integer.toString(newMines[a-1][b]);
        testArr[a-1][b] = true;
      }
      if(newMines[a-1][b-1] < 9 && newMines[a-1][b-1] != 0){
        userArr[a-1][b-1]= Integer.toString(newMines[a-1][b-1]);
        testArr[a-1][b-1] = true;
      }
      if(newMines[a-1][b+1] < 9 && newMines[a-1][b+1] != 0){
        userArr[a-1][b+1]= Integer.toString(newMines[a-1][b+1]);
        testArr[a-1][b+1] = true;
      } 
    }
    else if(a==9 && b<9 && b>0 && newMines[a][b] < 9){
      userArr[a][b] = Integer.toString(newMines[a][b]);
      testArr[a][b] = true;
    }
    else if(b==0 && a<9 && a>0 && newMines[a][b] == 0){
     userArr[a][b] = "0";
     testArr[a][b] = true;
     if(newMines[a][b+1] < 9 && newMines[a][b+1] != 0){
        userArr[a][b+1]= Integer.toString(newMines[a][b+1]);
        testArr[a][b+1] = true;
      }
      if(newMines[a-1][b] < 9 && newMines[a-1][b] != 0){
        userArr[a-1][b]= Integer.toString(newMines[a-1][b]);
        testArr[a-1][b] = true;
      }
      if(newMines[a-1][b+1] < 9 && newMines[a-1][b+1] != 0){
        userArr[a-1][b+1]= Integer.toString(newMines[a-1][b+1]);
        testArr[a-1][b+1] = true;
      }
      if(newMines[a+1][b] < 9 && newMines[a+1][b] != 0){
        userArr[a+1][b]= Integer.toString(newMines[a+1][b]);
        testArr[a+1][b] = true;
      }
      if(newMines[a+1][b+1] < 9 && newMines[a+1][b+1] != 0){
        userArr[a+1][b+1]= Integer.toString(newMines[a+1][b+1]);
        testArr[a+1][b+1] = true;
      }
    }
    else if(b==0 && a<9 && a>0 && newMines[a][b] < 9){
      userArr[a][b] = Integer.toString(newMines[a][b]);
      testArr[a][b] = true;
    }
    else if(b==9 && a<9 && a>0 && newMines[a][b] == 0){
      userArr[a][b] = "0";
      testArr[a][b] = true;
      if(newMines[a][b-1] < 9 && newMines[a][b-1] != 0){
        userArr[a][b-1]= Integer.toString(newMines[a][b-1]);
        testArr[a][b-1] = true;
      }
      if(newMines[a-1][b] < 9 && newMines[a-1][b] != 0){
        userArr[a-1][b]= Integer.toString(newMines[a-1][b]);
        testArr[a-1][b] = true;
      }
      if(newMines[a-1][b-1] < 9 && newMines[a-1][b-1] != 0){
        userArr[a-1][b-1]= Integer.toString(newMines[a-1][b-1]);
        testArr[a-1][b-1] = true;
      }
      if(newMines[a+1][b] < 9 && newMines[a+1][b] != 0){
        userArr[a+1][b]= Integer.toString(newMines[a+1][b]);
        testArr[a+1][b] = true;
      }
      if(newMines[a+1][b-1] < 9 && newMines[a+1][b-1] != 0){
        userArr[a+1][b-1]= Integer.toString(newMines[a+1][b-1]);
        testArr[a+1][b-1] = true;
      }
    }
    else if(b==9 && a<9 && a>0 && newMines[a][b] < 9){
      userArr[a][b] = Integer.toString(newMines[a][b]);
      testArr[a][b] = true;
    }
    else if(a==0 && b==0 && newMines[a][b] != 9 && newMines[a][b] == 0){
      userArr[a][b] = "0";
      if(newMines[a][b+1] < 9 && newMines[a][b+1] != 0){
        userArr[a][b+1]= Integer.toString(newMines[a][b+1]);
        testArr[a][b+1] = true;
      }
      if(newMines[a+1][b] < 9 && newMines[a+1][b] != 0){
        userArr[a+1][b]= Integer.toString(newMines[a+1][b]);
        testArr[a+1][b] = true;
      }
      if(newMines[a+1][b+1] < 9 && newMines[a+1][b+1] != 0){
        userArr[a+1][b+1]= Integer.toString(newMines[a+1][b+1]);
        testArr[a+1][b+1] = true;
      }
    }
    else if(b==0 && a==0 && newMines[a][b] < 9){
      userArr[a][b] = Integer.toString(newMines[a][b]);
      testArr[a][b] = true;
    }
    else if(a==0 && b==9 && newMines[a][b] < 9 && newMines[a][b] == 0){
      userArr[a][b] = "0";
      testArr[a][b] = true;
      if(newMines[a][b-1] < 9 && newMines[a][b-1] != 0){
        userArr[a][b-1]= Integer.toString(newMines[a][b-1]);
        testArr[a][b-1] = true;
      }
      if(newMines[a+1][b] < 9 && newMines[a+1][b] != 0){
        userArr[a+1][b]= Integer.toString(newMines[a+1][b]);
        testArr[a+1][b] = true;
      }
      if(newMines[a+1][b-1] < 9 && newMines[a+1][b-1] != 0){
        userArr[a+1][b-1]= Integer.toString(newMines[a+1][b-1]);
        testArr[a+1][b-1] = true;
      }
    }
    else if(b==9 && a==0 && newMines[a][b] < 9){
      userArr[a][b] = Integer.toString(newMines[a][b]);
      testArr[a][b] = true;
    }
    else if(a==9 && b==9 && newMines[a][b] != 9 && newMines[a][b] == 0){
      userArr[a][b] = "0";
      testArr[a][b] = true;
      if(newMines[a][b-1] < 9 && newMines[a][b-1] != 0){
        userArr[a][b-1]= Integer.toString(newMines[a][b-1]);
        testArr[a][b-1] = true;
      }
      if(newMines[a-1][b] < 9 && newMines[a-1][b] != 0){
        userArr[a-1][b]= Integer.toString(newMines[a-1][b]);
        testArr[a-1][b] = true;
      } 
      if(newMines[a-1][b-1] < 9 && newMines[a-1][b-1] != 0){
        userArr[a-1][b-1]= Integer.toString(newMines[a-1][b-1]);
        testArr[a-1][b-1] = true;
      }
    }
    else if(b==9 && a==9 && newMines[a][b] < 9){
      userArr[a][b] = Integer.toString(newMines[a][b]);
      testArr[a][b] = true;
    }
    else if(a==9 && b==0 && newMines[a][b] != 9 && newMines[a][b] == 0){
      userArr[a][b] = "0";
      testArr[a][b] = true;
      if(newMines[a][b+1] < 9 && newMines[a][b+1] != 0){
        userArr[a][b+1]= Integer.toString(newMines[a][b+1]);
        testArr[a][b+1] = true;
      }
      if(newMines[a-1][b] < 9 && newMines[a-1][b] != 0){
        userArr[a-1][b]= Integer.toString(newMines[a-1][b]);
        testArr[a-1][b] = true;
      }
      if(newMines[a-1][b+1] < 9 && newMines[a-1][b+1] != 0){
        userArr[a-1][b+1]= Integer.toString(newMines[a-1][b+1]);
        testArr[a-1][b+1] = true;
      }
    }
    else if(b==0 && a==9 && newMines[a][b] < 9){
      userArr[a][b] = Integer.toString(newMines[a][b]);
      testArr[a][b] = true;
    }
    else{
      return;
    }
  }
  
  public static void openMines(int a, int b, int c, boolean[][] testArr, String[][] userArr){
    //for(int i = 0; i<10; i++){
      //System.out.println(Arrays.toString(newMines[i]));
    //}
    //System.out.println("    ");
    
    if(c==2){
      checkSurroundings(a,b,testArr,userArr);
      if(newMines[a][b] ==0){
        if(a>0 && a<9 && b>0 && b<9 && newMines[a+1][b] == 0 && testArr[a+1][b]==false ){
          openMines(a+1,b,2, testArr, userArr);
        }
        if(a>0 && a<9 && b>0 && b<9 && newMines[a+1][b+1] == 0 && testArr[a+1][b+1]==false){
          openMines(a+1,b+1,2, testArr, userArr);
        }
        if(a>0 && a<9 && b>0 && b<9 && newMines[a+1][b-1] == 0 && testArr[a+1][b-1]==false){
          openMines(a+1,b-1,2, testArr, userArr);
        }
        if(a>0 && a<9 && b>0 && b<9 && newMines[a][b+1] == 0 && testArr[a][b+1]==false){
          openMines(a,b+1,2, testArr, userArr);
        }
        if(a>0 && a<9 && b>0 && b<9 && newMines[a][b-1] == 0 && testArr[a][b-1]==false){
          openMines(a,b-1,2, testArr, userArr);
        }
        if(a>0 && a<9 && b>0 && b<9 && newMines[a-1][b] == 0 && testArr[a-1][b]==false){
          openMines(a-1,b,2, testArr, userArr);
        }
        if(a>0 && a<9 && b>0 && b<9 && newMines[a-1][b-1] == 0 && testArr[a-1][b-1]==false){
          openMines(a-1,b-1,2, testArr, userArr);
        }
        if(a>0 && a<9 && b>0 && b<9 && newMines[a-1][b+1] == 0 && testArr[a-1][b+1]==false){
          openMines(a-1,b+1,2, testArr, userArr);
        }
        if(a==0 && b>0 && b<9 && newMines[a+1][b] == 0 && testArr[a+1][b]==false){
          openMines(a+1,b,2, testArr, userArr);
        }
        if(a==0 && b>0 && b<9 && newMines[a+1][b+1] == 0 && testArr[a+1][b+1]==false){
          openMines(a+1,b+1,2, testArr, userArr);
        }
        if(a==0 && b>0 && b<9 && newMines[a+1][b-1] == 0 && testArr[a+1][b-1]==false){
          openMines(a+1,b-1,2, testArr, userArr);
        }
        if(a==0 && b>0 && b<9 && newMines[a][b+1] == 0 && testArr[a][b+1]==false){
          openMines(a,b+1,2, testArr, userArr);
        }
        if(a==0 && b>0 && b<9 && newMines[a][b-1] == 0 && testArr[a][b-1]==false){
          openMines(a,b-1,2, testArr, userArr);
        }
        if(a==9 && b>0 && b<9 && newMines[a][b+1] == 0 && testArr[a][b+1]==false){
          openMines(a,b+1,2, testArr, userArr);
        }
        if(a==9 && b>0 && b<9 && newMines[a][b-1] == 0 && testArr[a][b-1]==false){
          openMines(a,b-1,2, testArr, userArr);
        }
        if(a==9 && b>0 && b<9 && newMines[a-1][b] == 0 && testArr[a-1][b]==false){
          openMines(a-1,b,2, testArr, userArr);
        }
        if(a==9 && b>0 && b<9 && newMines[a-1][b-1] == 0 && testArr[a-1][b-1]==false){
          openMines(a-1,b-1,2, testArr, userArr);
        }
        if(a==9 && b>0 && b<9 && newMines[a-1][b+1] == 0 && testArr[a-1][b+1]==false){
          openMines(a-1,b+1,2, testArr, userArr);
        }
        if(a>0 && a<9 && b==0 && newMines[a+1][b] == 0 && testArr[a+1][b]==false){
          openMines(a+1,b,2, testArr, userArr);
        }
        if(a>0 && a<9 && b==0 && newMines[a+1][b+1] == 0 && testArr[a+1][b+1]==false){
          openMines(a+1,b+1,2, testArr, userArr);
        }
        if(a>0 && a<9 && b==0 && newMines[a][b+1] == 0 && testArr[a][b+1]==false){
          openMines(a,b+1,2, testArr, userArr);
        }
        if(a>0 && a<9 && b==0 && newMines[a-1][b] == 0 && testArr[a-1][b]==false){
          openMines(a-1,b,2, testArr, userArr);
        }
        if(a>0 && a<9 && b==0 && newMines[a-1][b+1] == 0 && testArr[a-1][b+1]==false){
          openMines(a-1,b+1,2, testArr, userArr);
        }
        if(a>0 && a<9 && b==9 && newMines[a+1][b] == 0 && testArr[a+1][b]==false){
          openMines(a+1,b,2, testArr, userArr);
        }
        if(a>0 && a<9 && b==9 && newMines[a+1][b-1] == 0 && testArr[a+1][b-1]==false){
          openMines(a+1,b-1,2, testArr, userArr);
        }
        if(a>0 && a<9 && b==9 && newMines[a][b-1] == 0 && testArr[a][b-1]==false){
          openMines(a,b-1,2, testArr, userArr);
        }
        if(a>0 && a<9 && b==9  && newMines[a-1][b] == 0 && testArr[a-1][b]==false){
          openMines(a-1,b,2, testArr, userArr);
        }
        if(a>0 && a<9 && b==9 && newMines[a-1][b-1] == 0 && testArr[a-1][b-1]==false){
          openMines(a-1,b-1,2, testArr, userArr);
        }
        if(a==0 && b==0 && newMines[a][b+1]==0 && testArr[a][b+1]==false){
          openMines(a,b+1,2, testArr, userArr);
        }
        if(a==0 && b==0 && newMines[a+1][b+1]==0 && testArr[a+1][b+1]==false){
          openMines(a+1,b+1,2, testArr, userArr);
        }
        if(a==0 && b==0 && newMines[a+1][b]==0 && testArr[a+1][b]==false){
          openMines(a+1,b,2, testArr, userArr);
        }
        if(a==9 && b==0 && newMines[a][b+1]==0 && testArr[a][b+1]==false){
          openMines(a,b+1,2, testArr, userArr);
        }
        if(a==9 && b==0 && newMines[a-1][b+1]==0 && testArr[a-1][b+1]==false){
          openMines(a-1,b+1,2, testArr, userArr);
        }
        if(a==9 && b==0 && newMines[a-1][b]==0 && testArr[a-1][b]==false){
          openMines(a-1,b,2, testArr, userArr);
        }
        if(a==0 && b==9 && newMines[a][b-1]==0 && testArr[a][b-1]==false){
          openMines(a,b-1,2, testArr, userArr);
        }
        if(a==0 && b==9 && newMines[a+1][b-1]==0 && testArr[a+1][b-1]==false){
          openMines(a+1,b-1,2, testArr, userArr);
        }
        if(a==0 && b==9 && newMines[a+1][b]==0 && testArr[a+1][b]==false){
          openMines(a+1,b,2, testArr, userArr);
        }
        if(a==9 && b==9 && newMines[a][b-1]==0 && testArr[a][b-1]==false){
          openMines(a,b-1,2, testArr, userArr);
        }
        if(a==9 && b==9 && newMines[a-1][b-1]==0 && testArr[a-1][b-1]==false){
          openMines(a-1,b-1,2, testArr, userArr);
        }
        if(a==9 && b==9 && newMines[a-1][b]==0 && testArr[a-1][b]==false){
          openMines(a-1,b,2, testArr, userArr);
        }
        return;
      }
    }  
    else if(c==3){
      userArr[a][b] = "?";
    } 
    if(c==1){
      newMines[a][b] = 10;
      userArr[a][b] = "F";
    }
    for(int x = 0; x<10; x++){
      for(int z = 0; z<10; z++){
        if(userArr[x][z] == null){
          userArr[x][z] = "X";
        }
      }
    }
  }

  public static boolean checkWin(String[][] userArr){
    for(int x = 0; x<10; x++){
      for(int z = 0; z<10; z++){
        if(userArr[x][z] == "X" && newMines[x][z] != 9){
          return false;
        }
      }
    }
    return true;
  }
  
  public static void newArray(boolean [][] testArr, String[][] userArr){
    if(checkWin(userArr) == true){
      end = 2;
    }
    if(end==2){
      return;
    }
    Scanner scan = new Scanner(System.in);
    System.out.println("Would you like to flag a box or place a question mark? Enter 1 for a flag, 2 for regular input, and 3 for a question mark.");
    int a3 = scan.nextInt();
    System.out.println("Enter a row number.");
    int a1 = scan.nextInt();
    System.out.println("Enter a column number.");
    int a2 = scan.nextInt();
    openMines(a1,a2,a3,testArr,userArr);
    System.out.print(" ");
    for(int i = 0; i<10; i++){
      System.out.print( "  " + i);
    }
    System.out.println(" ");
    for(int i = 0; i<10; i++){
      System.out.println( i + " " + Arrays.toString(userArr[i]));
    }
    if(a3==2 && newMines[a1][a2] == 9){
      end =1;
    }
    //scan.close();
   }
}
  
 