// models/GroceryItem.java
// ***************************************************

package josem111.models;
// ***************************************************

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;
// ***************************************************

public record GroceryItem(String name, String type, int count) {
  // default constructor
  public GroceryItem(String name) {
    this(name, "Dairy", 1);
  }
  
  @Override
  public String toString() {
    // Create a list of key-value pairs for the GroceryItem properties
    List<Map.Entry<String, Object>> keyValuePairs = Stream.<Map.Entry<String, Object>> of(
        Map.entry("name", name.toUpperCase()),
        Map.entry("type", type),
        Map.entry("count", count))
      .toList();
    
    // Call the toStrFormatter method with the object name "GroceryItem" and the keyValuePairs list
    return toStrFormatter("\nGroceryItem", keyValuePairs);
  }
  
  private String toStrFormatter(String objName, List<Map.Entry<String, Object>> keyValuePair) {
    // Use Java streams to process the keyValuePairs list
    String formatKeyValues = keyValuePair.stream()
      .map(keyAndValues -> { // For each key-value pair, create a formatted string "  key: value"
        return String.format("  %s: %s",
          keyAndValues.getKey(),
          keyAndValues.getValue());
      }) // Join all formatted strings using a newline character as a separator
      .collect(Collectors.joining("\n"));
    
    // Create the final formatted string by combining the objectName, opening curly brace,
    // the formattedPairs, and a closing curly brace, with newline characters as needed
    return String.format("%s: {\n%s\n}", objName, formatKeyValues);
  }
  
  
  //@Override
  //public String toString() {
  //  return toStrFormatter(name.toUpperCase(), type, count);
  //}
  //
  //private String toStrFormatter(Object... args) {
  //  return (
  //    """
  //    GroceryItem: {
  //      name: %s
  //      type: %s
  //      count: %d
  //    }
  //    """).formatted(args);
  //}
}
// ***************************************************
