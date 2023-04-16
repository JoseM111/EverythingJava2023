package josem111.examples;

import josem111.utils.Utilities;

import java.util.Arrays;

public class Example2 {
  public static void display() {
    String[] strArray = { "Able", "Jane", "Mark", "Ralph", "David" };
    // Sort our array = [Able, David, Jane, Mark, Ralph]
    Arrays.sort(strArray);
    
    Utilities.printFormatted("*. strArray", strArray);
    
    if (Arrays.binarySearch(strArray, "Mark") >= 0) {
      System.out.printf("*. Found (%s) in the list%n", strArray[ 3 ]);
    }
    
    int[] s1 = { 1, 2, 3, 4, 5 };
    int[] s2 = { 1, 2, 3, 4, 5, 0 };
    
    String areArraysEqual = Arrays.equals(s1, s2)
      ? "Arrays are equal"
      : "Arrays are not equal";
    
    Utilities.testEquality("*. areArraysEqual", s1, s2, areArraysEqual);
  }
}
