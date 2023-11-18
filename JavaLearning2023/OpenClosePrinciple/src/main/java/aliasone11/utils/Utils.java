package aliasone11.utils;
// ___________________________________________________________

import aliasone11.models.IDepartment;
import aliasone11.models.Student;

import java.util.ArrayList;
import java.util.List;
// ___________________________________________________________


public class Utils {
  public static void format_print(String charStr, int times) {
    System.out.println(charStr.repeat(times));
  }

  public static List<Student> enrollStudents(IDepartment department) {
    List<Student> students = new ArrayList<>();
    department.enrollStudents(students);
    return students;
  }
}
// ___________________________________________________________