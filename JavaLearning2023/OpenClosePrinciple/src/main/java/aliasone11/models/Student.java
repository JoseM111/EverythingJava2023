package aliasone11.models;

// ___________________________________________________________

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
// ___________________________________________________________


public record Student(
    String name, String regNumber,
    double score, String departmentName,
    String distinction) {

  public Student(
      String name,
      String regNumber,
      double score,
      IDepartment department
  ) {
    this(
        name, regNumber, score,
        department.getDepartmentName(),
        department.evaluateDistinction(
            new Student(
                name, regNumber, score, department.getDepartmentName(),
                null
            )
        )
    );
  }

  @Override
  public String toString() {
    Gson gsonResponse = new GsonBuilder()
        .setPrettyPrinting()
        .create();

    String jsonStudent = gsonResponse.toJson(this);

    // `STR`: This StringTemplate.Processor instance is conventionally used
    //  for the string interpolation of a supplied StringTemplate.
    //  For better visibility and when practical, it is recommended that
    //  users use the STR processor instead of invoking the interpolate() method.
    return STR."Student in (\{ departmentName }) Department = \{ jsonStudent }";
  }
}
// ___________________________________________________________