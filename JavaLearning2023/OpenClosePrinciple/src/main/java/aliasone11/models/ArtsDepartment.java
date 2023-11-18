package aliasone11.models;

// ___________________________________________________________

import java.util.List;

public class ArtsDepartment implements IDepartment {
  @Override
  public String getDepartmentName() {
    return "Arts";
  }

  @Override
  public String evaluateDistinction(Student student) {
    String msg = STR."\{ student.regNumber() } has received a distinction in arts.";
    return student.score() > 70 ? msg : "Did not pass in arts.";
  }

  @Override
  public void enrollStudents(List<Student> students) {
    students.add(new Student("John", "R3", 81, this));
    students.add(new Student("Kate", "R4", 66.5, this));
  }
}
// ___________________________________________________________
