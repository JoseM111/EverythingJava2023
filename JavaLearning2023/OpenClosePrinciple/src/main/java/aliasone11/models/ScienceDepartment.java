package aliasone11.models;

// ___________________________________________________________

import java.util.List;

public class ScienceDepartment implements IDepartment {
  @Override
  public String getDepartmentName() {
    return "Science";
  }

  @Override
  public String evaluateDistinction(Student student) {
    String msg = STR."\{ student.regNumber() } has received a distinction in science.";
    return student.score() > 80 ? msg : "Did not pass in science.";
  }

  @Override
  public void enrollStudents(List<Student> students) {
    students.add(new Student("Sam", "R1", 81.5, this));
    students.add(new Student("Bob", "R2", 72, this));
  }
}
// ___________________________________________________________
