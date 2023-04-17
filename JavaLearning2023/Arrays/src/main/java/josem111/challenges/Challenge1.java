package josem111.challenges;
// ***************************************************

import josem111.utils.Utilities;
// ***************************************************

public class Challenge1 {
  public static void display() {
    int[] unsortedArr = Utilities.getRandomArray(5);
    Utilities.printFormatted("*. unsortedArr", unsortedArr);
    
    // test arrays to sort
    int[] sortedArr = { 1, 27, 4, 75, 34, 2 };
    Utilities.sortIntegers(sortedArr);
  }
}
// ***************************************************
