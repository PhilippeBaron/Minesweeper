public class BoardNumbers {
  
 private static int r = 0; 
 private static int c = 0;
 
 public BoardNumbers(int numRows, int numCols){
   r = numRows;
   c = numCols;
 }
 
 public static int[][] getMines(int guess1, int guess2){
    int[][] newMines = new int[10][10];
    boolean[][] myArray = new boolean[10][10];
    int p = 0;
    for(int y = 0; y < r; y++){
       for(int z = 0; z < c; z++){
         myArray[y][z] = false;
       }
    }
    while(p<15){
      int num = (int)(Math.random()*10);
      int num2 = (int)(Math.random()*10);
      while((num==guess1 && num2==guess2) || (((num==guess1-1)||(num==guess1+1))&&((num2==guess2-1)||(num2==guess1+1))) || (((num==guess1-1)||(num==guess1+1))&& num2 == guess2) || (num == guess1 &&((num2==guess2-1)||(num2==guess1+1)))){
        num = (int)(Math.random()*10);
        num2 = (int)(Math.random()*10);
      }
      while(myArray[num][num2] == true){
        num = (int)(Math.random()*10);
        num2 = (int)(Math.random()*10);
      } 
      myArray[num][num2] = true;
      p++;
    }
    for(int y = 1; y < 9; y++){
       for(int z = 1; z < 9; z++){
         if(myArray[y][z] == false){
           if(myArray[y][z+1] == true){
             newMines[y][z]+=1;
           }
           if(myArray[y][z-1] == true){
             newMines[y][z]+=1;
           }
           if(myArray[y-1][z] == true){
             newMines[y][z]+=1;
           }
           if(myArray[y-1][z-1] == true){
             newMines[y][z]+=1;
           }
           if(myArray[y-1][z+1] == true){
             newMines[y][z]+=1;
           }
           if(myArray[y+1][z] == true){
             newMines[y][z]+=1;
           }
           if(myArray[y+1][z-1] == true){
             newMines[y][z]+=1;
           }
           if(myArray[y+1][z+1] == true){
             newMines[y][z]+=1;
           }
         }
         else if(myArray[y][z] == true) {
           newMines[y][z] = 9;
         }
      } 
    }
    for(int i=1; i<9; i++){
      if(myArray[0][i] == false){
        if(myArray[0][i-1] == true){
          newMines[0][i]+=1;
        }
        if(myArray[0][i+1] == true){
          newMines[0][i]+=1;
        }
        if(myArray[1][i-1] == true){
          newMines[0][i]+=1;
        }
        if(myArray[1][i] == true){
          newMines[0][i]+=1;
        }
        if(myArray[1][i+1] == true){
          newMines[0][i]+=1;
        }
      }
      else {
        newMines[0][i] = 9;
      }
    }
    for(int i=1; i<9; i++){
      if(myArray[9][i] == false){
        if(myArray[9][i+1] == true){
          newMines[9][i]+=1;
        }
        if(myArray[9][i-1] == true){
          newMines[9][i]+=1;
        }
        if(myArray[8][i+1] == true){
          newMines[9][i]+=1;
        }
        if(myArray[8][i] == true){
          newMines[9][i]+=1;
        }
        if(myArray[8][i-1] == true){
          newMines[9][i]+=1;
        }
      }
      else {
        newMines[9][i] = 9;
      }
    }
    for(int i=1; i<9; i++){
      if(myArray[i][0] == false){
        if(myArray[i+1][0] == true){
          newMines[i][0]+=1;
        }
        if(myArray[i-1][0] == true){
          newMines[i][0]+=1;
        }
        if(myArray[i-1][1] == true){
          newMines[i][0]+=1;
        }
        if(myArray[i+1][1] == true){
          newMines[i][0]+=1;
        }
        if(myArray[i][1] == true){
          newMines[i][0]+=1;
        }
      }
      else {
        newMines[i][0] = 9;
      }
    }
    for(int i=1; i<9; i++){
      if(myArray[i][9] == false){
        if(myArray[i+1][9] == true){
          newMines[i][9]+=1;
        }
        if(myArray[i-1][9] == true){
          newMines[i][9]+=1;
        }
        if(myArray[i-1][8] == true){
          newMines[i][9]+=1;
        }
        if(myArray[i+1][8] == true){
          newMines[i][9]+=1;
        }
        if(myArray[i][8] == true){
          newMines[i][9]+=1;
        }
      }
      else {
        newMines[i][9] = 9;
      }
    }
    if(myArray[0][0] == false){
      if(myArray[0][1] == true){
        newMines[0][0] += 1;
      }
      if(myArray[1][0] == true){
        newMines[0][0] += 1;
      }
      if(myArray[1][1] == true){
        newMines[0][0] += 1;
      }
    }
    else {
      newMines[0][0] = 9;
    }
    if(myArray[0][9] == false){
      if(myArray[0][8] == true){
        newMines[0][9] += 1;
      }
      if(myArray[1][8] == true){
        newMines[0][9] += 1;
      }
      if(myArray[1][9] == true){
        newMines[0][9] += 1;
      }
    }
    else {
      newMines[0][9] = 9;
    }
    if(myArray[9][0] == false){
      if(myArray[8][1] == true){
        newMines[9][0] += 1;
      }
      if(myArray[8][0] == true){
        newMines[9][0] += 1;
      }
      if(myArray[9][1] == true){
        newMines[9][0] += 1;
      }
    }
    else {
      newMines[9][0] = 9;
    }
    if(myArray[9][9] == false){
      if(myArray[8][8] == true){
        newMines[9][9] += 1;
      }
      if(myArray[9][8] == true){
        newMines[9][9] += 1;
      }
      if(myArray[8][9] == true){
        newMines[9][9] += 1;
      }
    }
    else {
      newMines[9][9] = 9;
    }
    newMines[guess1][guess2] = 0;
    return newMines;
  }
}