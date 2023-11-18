package alias111;
// ___________________________________________________________

import alias111.models.Employee;
import alias111.utils.Utils;

import java.util.Arrays;
import java.util.List;
// ___________________________________________________________

public class Client {
  public static void main(String[] args) {
    Utils.format_print("=", 50);
    // ___________________________________________________________
    String header = "\n*** A demo that follows the Single Responsibility Principle (SRP).***\n";
    System.out.println(header);
    
    List<Employee> employees = Arrays.asList(
        new Employee("Danny", "Johnson", "Danny", 2),
        new Employee("Jose", "Martinez", "Jose", 4),
        new Employee("Donna", "Cherry", "Donna", 5)
    );
    
    Utils.singleResponsibilityPrincipal(employees);
    // ******************************************
    // ___________________________________________________________
    Utils.format_print("=", 50);
  }
}