import java.util.Scanner;

public class Main {
  // CONSTANTES

  public static void main(String[] args) {

    /* CALLING 3 METHOD INTO ONE. 
    * 1. arrayInitialization
    * 2. swapper
    * 3. screener
    */
    screener(swapper(arrayInitialization()));

  }

  // THIS METHOD WILL INITILISE THE ARRAY
  public static int [] arrayInitialization (){

    // INITIALIZATION OF AN ARRAY (5 POSITIONS)
    int array[] = { 9, 5, 6, 2, 0 };

    return array;
  }

  // THIS METHOD WILL TAKE CARE OF SWAPPING
  public static int[] swapper(int array[]){

    // INITIALIZATION OF A TEMPORARY VARIABLE
    int temp;

    // QUITTER FROM THE WHILE
    boolean quit = false;

    // A WHILE LOOP TO KEEP THE PROGRAM SORTING UNTIL IT'S DONE
    while (quit==false) {
      
      // THIS QUIT = TRUE IS TO MAKE THE WHILE LOOP ACTIVE UNTIL THE SWAP PROCESS IS DONE
      quit=true;

      // THROUGH EACH POSITION OF THE ARRAY WE EVALUATE ... :
      for (int i = 0; i < array.length - 1; i++) {

        // WE COMPARE FIRST POSITION WITH SECOND POSITION TO SWAP OR NOT
        if (array[i] > array[i + 1]) {

          // SWAPING TIME !
          temp = array[i + 1];
          array[i + 1] = array[i];
          array[i] = temp;
          quit=false;
        }
      }
    }
    return array;
  }

  // THIS METHOD WILL PRINT TO THE SCREEN THE RESULT
  public static void screener (int array[]){

    //THIS LOOP IS MADE TO PRINT THE NEW ARRAY
    for (int j=0;j<array.length;j++){

      // PRINTING THE RESULT. SHOULD BE : {0,2,5,6,9}
      System.out.print(array[j] + " ");
    }
  }
}
