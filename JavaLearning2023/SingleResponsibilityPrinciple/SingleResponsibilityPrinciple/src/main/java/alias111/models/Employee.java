package alias111.models;

// ___________________________________________________________

import alias111.utils.Utils;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
// ___________________________________________________________

public record Employee(
    String firstName, String lastName,
    String employeeID, double expInYears,
    String seniority) {
  
  public Employee(
      String firstName,
      String lastName,
      String employeeID,
      double expInYears
  ) {
    this(
        firstName,
        lastName,
        Utils.generateEmpId(employeeID),
        expInYears,
        Utils.checkSeniority(expInYears) // Calculate seniority and include it as a record component
    );
  }
  
  @Override
  public String toString() {
    // example without Gson
//    return STR."""
//        Employee = {
//          First Name: \{firstName},
//          Last Name: \{lastName},
//          Employee ID: \{employeeID},
//          Years of Experience: \{expInYears}
//        }
//      """;
//      .trim()
//      .formatted(firstName, lastName, employeeID, expInYears);
    
    Gson gsonResponse = new GsonBuilder()
        .setPrettyPrinting()
        .create();
    
    // `STR`: This StringTemplate.Processor instance is conventionally used
    //  for the string interpolation of a supplied StringTemplate.
    //  For better visibility and when practical, it is recommended that
    //  users use the STR processor instead of invoking the interpolate() method.
    return STR. "Employee = \{ gsonResponse.toJson(this) }" ;
  }
}
// ___________________________________________________________