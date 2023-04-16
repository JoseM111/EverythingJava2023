package josem111.utils;

import java.util.Arrays;
import java.util.Random;
import java.util.stream.IntStream;

public interface Utilities {
  // helper function ============================
  static void printFormatted(String strArg, String[] myIntArray) {
    System.out.printf("%s: %%s%%n".formatted(strArg),
      stringMeUp(myIntArray));
  }
  
  static void printFormatted(String strArg, int[] myIntArray) {
    System.out.printf("%s: %%s%%n".formatted(strArg),
      stringMeUp(myIntArray));
  }
  
  static void printArrayWithIndices(String strArg, int itemIndex, double[] myDoubleArray) {
    System.out.printf("\n%s: %%s%%n".formatted(strArg),
      myDoubleArray[ itemIndex ]);
  }
  
  static void printArrayWithIndices(String strArg, int itemIndex, int[] myIntArray) {
    System.out.printf("\n%s: %%s%%n".formatted(strArg),
      myIntArray[ itemIndex ]);
  }
  
  static String stringMeUp(int[] arrayValue) {
    return Arrays.toString(arrayValue);
  }
  static String stringMeUp(Double[] arrayValue) {
    return Arrays.toString(arrayValue);
  }
  static String stringMeUp(String[] arrayValue) {
    return Arrays.toString(arrayValue);
  }
  
  static void testEquality(String label, int[] arr1, int[] arr2, String areArraysEqual) {
    System.out.printf("%s\n   {%%s} == {%%s}: %%s%%n".formatted(label),
      Utilities.stringMeUp(arr1),
      Utilities.stringMeUp(arr2),
      areArraysEqual);
  }
  static void testEquality(String label, String[] arr1, String[] arr2, String areArraysEqual) {
    System.out.printf("%s\n   {%%s} == {%%s}: %%s%%n".formatted(label),
      Utilities.stringMeUp(arr1),
      Utilities.stringMeUp(arr2),
      areArraysEqual);
  }
  
  static int[] getRandomArray(int len) {
    Random rand = new Random();
    
    // Generate an IntStream with the length 'len' and map each
    // element to a random integer in the range of 0-99
    // Convert the IntStream to an int[] array
    return IntStream.generate(() -> rand.nextInt(100))
      .limit(len)
      .toArray();
  }
}
