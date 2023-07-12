package josem111.examples;

import josem111.models.GroceryItem;

import java.util.ArrayList;

public class Example1 {
  public static void display() {
    ArrayList<GroceryItem> groceries = new ArrayList<>();
    groceries.add(new GroceryItem("Butter"));
    groceries.add(new GroceryItem("Milk"));
    groceries.add(new GroceryItem("Oranges", "Produce", 5));
    
    // specifying the index
    groceries.add(0, new GroceryItem("Apple", "Produce", 6));
    // using set to replaces <Oranges>
    groceries.set(3, new GroceryItem("Mango", "Produce", 6));
    // using remove to remove <Mango> which brings back <Milk>
    groceries.remove(3);
    
    System.out.println(groceries);
  }
}
