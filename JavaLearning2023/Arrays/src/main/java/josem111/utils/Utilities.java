package josem111.utils;
// ***************************************************

import java.util.Arrays;
import java.util.Random;
import java.util.stream.IntStream;
// ***************************************************

public class Utilities {
  // helper function ============================
  public static void printFormatted(String strArg, String[] array) {
    System.out.printf("%s: %%s%%n".formatted(strArg), stringMeUp(array));
  }
  
  public static String stringMeUp(String[] arrayValue) {
    return Arrays.toString(arrayValue);
  }
  
  public static void printArrayWithIndices(String strArg, int itemIndex, double[] array) {
    System.out.printf("\n%s: %%s%%n".formatted(strArg),
      array[ itemIndex ]);
  }
  
  public static void printArrayWithIndices(String strArg, int itemIndex, int[] array) {
    System.out.printf("\n%s: %%s%%n".formatted(strArg),
      array[ itemIndex ]);
  }
  
  @SuppressWarnings( "unused" )
  public static String stringMeUp(Double[] arrayValue) {
    return Arrays.toString(arrayValue);
  }
  
  public static void testEquality(String label, int[] arr1, int[] arr2, String areArraysEqual) {
    System.out.printf("%s\n   {%%s} == {%%s}: %%s%%n".formatted(label),
      Utilities.stringMeUp(arr1),
      Utilities.stringMeUp(arr2),
      areArraysEqual);
  }
  
  public static String stringMeUp(int[] arrayValue) {
    return Arrays.toString(arrayValue);
  }
  
  @SuppressWarnings( "unused" )
  public static void testEquality(String label, String[] arr1, String[] arr2, String areArraysEqual) {
    System.out.printf("%s\n   {%%s} == {%%s}: %%s%%n".formatted(label),
      Utilities.stringMeUp(arr1),
      Utilities.stringMeUp(arr2),
      areArraysEqual);
  }
  
  public static int[] getRandomArray(int len) {
    Random rand = new Random();
    
    // Generate an IntStream with the length 'len' and map each
    // element to a random integer in the range of 0-99
    // Convert the IntStream to an int[] array
    return IntStream.generate(() -> rand.nextInt(100))
      .limit(len)
      .toArray();
  }
  
  @SuppressWarnings( "unused" )
  public static <TodoType> TodoType todo() {
    throw new UnsupportedOperationException("Method not implemented");
  }
  
  public static void sortIntegers(int[] array) {
    int[] sortedArr = IntStream.of(array) // 1. Create an IntStream from the input array
      .boxed() // 2. Box the primitive int values to Integer objects
      .sorted((Integer a, Integer b) -> b - a) // 3. Sort the boxed integers in descending order
      .mapToInt(Integer::intValue) // 4. Unbox the sorted Integer objects back to primitive int values
      .toArray();
    
    printFormatted("*. sortedArr", sortedArr);
  }
  
  public static void printFormatted(String strArg, int[] array) {
    System.out.printf("%s: %%s%%n".formatted(strArg), stringMeUp(array));
  }
}
// ***************************************************
