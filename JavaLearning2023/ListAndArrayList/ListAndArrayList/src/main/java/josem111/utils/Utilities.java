package josem111.utils;
// ***************************************************

import java.util.Arrays;
import java.util.Random;
import java.util.stream.IntStream;
// ***************************************************

public class Utilities {
  // helper function ============================
  @SuppressWarnings( "unused" )
  public static String stringMeUp(int[] arrayValue) {
    return Arrays.toString(arrayValue);
  }
  
  @SuppressWarnings( "unused" )
  public static int[] getRandomArray(int len) {
    Random rand = new Random();
    
    // Generate an IntStream with the length 'len' and map each
    // element to a random integer in the range of 0-99
    // Convert the IntStream to an int[] array
    return IntStream.generate(() -> rand.nextInt(100))
      .limit(len)
      .toArray();
  }
  
  // remember to return this method when using it as a placeholder return type.
  @SuppressWarnings( "unused" )
  public static <TodoType> TodoType todo() {
    throw new UnsupportedOperationException("Method not implemented");
  }
}
// ***************************************************
