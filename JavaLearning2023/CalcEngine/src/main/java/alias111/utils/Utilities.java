package alias111.utils;

// ___________________________________________________________

public class Utilities {
  public static void spacer(String strChar, int repeatChar) {
    String stringBuilder = String
      .valueOf(strChar)
      .repeat(Math.max(0, repeatChar));
    
    System.out.println(stringBuilder);
  }
}
// ___________________________________________________________
