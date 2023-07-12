// src/main.java
// ***************************************************

package josem111;
// ***************************************************

import josem111.examples.Example1;

import java.util.ArrayList;
import java.util.List;
// ***************************************************

public class Main {
  
  public static void main(String[] args) {
    System.out.println("**************************************");
    /* example #1 */
    Example1.display();
    // -----------------------------------------------------
    /* example #2 */
    //Example2.display();
    display();
    // -----------------------------------------------------
    /* challenge #1 */
    //Challenge1.display();
    // -----------------------------------------------------
    System.out.println("**************************************\n");
  }
  
  public static void display() {
    String[] items = { "apples", "bananas", "milk", "eggs" };
    
    // Elements cannot be added, removed, or replaced. Calling
    // any mutator method on the List will always cause
    // UnsupportedOperationException to be thrown.
    List<String> groceryList = List.of(items);
    System.out.printf("*. grocery list: %s%n", groceryList);
    
    ArrayList<String> mutableGroceries = new ArrayList<>();
    mutableGroceries.add("Yogurt");
    
    System.out.printf("*. Mutable grocery list: %s%n", mutableGroceries);
    
    // immutable list
    List<String> quickList = List.of("Pickles", "Mustard", "Cheese");
    ArrayList<String> nextGroceryList = new ArrayList<>(quickList);
    
    System.out.printf("*. nextGroceryList: %s%n", nextGroceryList);
    
    // adding one list to another list:
    // Appends all the elements in the specified collection
    // to the end of this list, in the order that they are
    // returned by the specified collection's Iterator.
    mutableGroceries.addAll(nextGroceryList);
    
    String addAllLabel = "*. mutableGroceries.addAll(nextGroceryList): %s%n";
    System.out.printf(addAllLabel, mutableGroceries);
    
    // getting an item in a list from a specific index
    String getIndexLabel = "*. mutableGroceries at index[2]: %s%n";
    System.out.printf(getIndexLabel, mutableGroceries.get(2));
    
    // using the `contains` method to see if the list contains that item:
    // Returns true if this list contains the specified element. More formally,
    // returns true if and only if this list contains at least one element e
    // such that Objects.equals(o, e).
    System.out.println(mutableGroceries.contains("Cheese")
      ? "*. mutableGroceries: Does contain (Mustard)"
      : "*. mutableGroceries: Does not contain (Mustard)");
    
    mutableGroceries.add("Yogurt");
    
    String firstIndexLabel = "*. First index of mutableGroceries: %s%n";
    System.out.printf(firstIndexLabel, mutableGroceries.indexOf("Yogurt"));
    
    String lastIndexLabel = "*. Last index of mutableGroceries: %s%n";
    System.out.printf(lastIndexLabel, mutableGroceries.lastIndexOf("Yogurt"));
    
    
  }
  
  
  // ***************************************************
  
}













