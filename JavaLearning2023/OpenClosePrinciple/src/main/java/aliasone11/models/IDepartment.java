package aliasone11.models;

// ___________________________________________________________

import java.util.List;

public interface IDepartment {
  String getDepartmentName();
  String evaluateDistinction(Student student);
  void enrollStudents(List<Student> students);
}
// ___________________________________________________________
