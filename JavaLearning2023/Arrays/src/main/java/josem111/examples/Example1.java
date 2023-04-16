package josem111.examples;


import josem111.utils.Utilities;


public class Example1 {
  
  public static void display() {
    // an array of integers with the size of 10
    // the size of an array is fixed. you cannot
    // change the size once it is created.
    // you cant add or delete elements
    int[] myIntArray = new int[ 6 ];
    // assigns the value of the array to index 6
    myIntArray[ 0 ] = 45;
    myIntArray[ 1 ] = 1;
    myIntArray[ 5 ] = 50;
    
    Utilities.printFormatted("*. myDoubleArray", myIntArray);
    
    
    double[] myDoubleArray = new double[ 10 ];
    myDoubleArray[ 2 ] = 3.5;
    
    Utilities.printArrayWithIndices("*. myDoubleArray[2]",
      2,
      myDoubleArray);
    
    // anonymous array initializer
    int[] firstSix = { 1, 2, 3, 4, 5, 17 };
    
    System.out.printf("\n* first index in firstSix: %s%n", firstSix[ 0 ]);
    
    int firstSixLength = firstSix.length;
    
    System.out.printf("*. length of firstSix = %s%n", firstSixLength);
    Utilities.printArrayWithIndices("*. last item in firstSix",
      firstSixLength - 1,
      firstSix);
    
    // anonymous array initializer other syntax without initializing at first
    int[] newFirstSix;
    newFirstSix = new int[] { 5, 4, 3, 2, 1 };
    System.out.println();
    
    Utilities.printFormatted("*. newFirstSix", newFirstSix);
  }
}
