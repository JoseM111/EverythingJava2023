package alias111;
// ___________________________________________________________

// ___________________________________________________________

import static alias111.utils.Utilities.*;

public class Main {
  public static void main(String[] args) {
    spacer("*", 55);
    // ***************************************************
    var value1 = 100.0d;
    var value2 = 0.0d;
    var result = 0.0d;
    var opCode = 'd';
    
    switch (opCode) {
      case 'a' -> result = value1 + value2;
      case 's' -> result = value1 - value2;
      case 'm' -> result = value1 * value2;
      case 'd' -> result = (value2 != 0)
        ? value1 / value2
        : 0.0d;
      default -> {
        System.out.printf("Invalid operation code: %c%n",
          opCode
        );
        result = 0.0d;
      }
    }
    
    
    System.out.printf("\nResult: %s%n", result);
    // ***************************************************
    spacer("*", 55);
  }
}
// ___________________________________________________________








