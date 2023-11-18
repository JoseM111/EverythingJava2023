package alias111.utils;
// ___________________________________________________________

import alias111.models.Employee;

import java.util.List;
import java.util.Random;
// ___________________________________________________________

public class Utils {
  
  public static void singleResponsibilityPrincipal(List<Employee> employees) {
    employees.forEach((Employee employee) -> {
      System.out.println(employee);
      System.out.println("\n************************************\n");
    });
  }
  // ___________________________________________________________
  
  public static String checkSeniority(double expInYears) {
    return expInYears >= 5 ? "Senior Developer" :
        expInYears >= 3 ? "Mid-Level Developer" :
            "Junior Developer";
  }
  
  public static String generateEmpId(String empFirstName) {
    int randomNum = new Random().nextInt(1000);
    var employeeID = STR."\{empFirstName.substring(0, 1)}-\{randomNum}";
    return employeeID;
  }
  
  public static void format_print(String charStr, int times) {
    System.out.println(charStr.repeat(times));
  }
}
// ___________________________________________________________