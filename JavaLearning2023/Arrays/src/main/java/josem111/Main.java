package josem111;
// **************************************************

import josem111.examples.Example1;
import josem111.examples.Example2;
import josem111.utils.Utilities;

import static josem111.utils.Utilities.*;
// ***************************************************

public class Main {
  
  public static void main(String[] args) {
    System.out.println("**************************************");
    /* example #1 */
    Example1.display();
    // -----------------------------------------------------
    /* example #2 */
    Example2.display();
    // -----------------------------------------------------
    /* challenge #1 */
    display();
    // -----------------------------------------------------
    
    
    System.out.println("**************************************\n");
  }
  // ***************************************************
  public static void display() {
    int[] unsortedArr = Utilities.getRandomArray(5);
    Utilities.printFormatted("*. unsortedArr", unsortedArr);
    
    
  }
  
  public static int[] sortIntegers(int[] array) {
    
    return todo();
  }
  
  
}







