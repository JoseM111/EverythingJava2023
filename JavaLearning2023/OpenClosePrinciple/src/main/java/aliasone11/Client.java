package aliasone11;
// ___________________________________________________________


// ___________________________________________________________

import aliasone11.models.ArtsDepartment;
import aliasone11.models.ScienceDepartment;
import aliasone11.models.Student;
import aliasone11.utils.Utils;

import java.util.List;

public class Client {
  public static void main(String[] args) {
    Utils.format_print("=", 50);
    // ___________________________________________________________
    String header = "\n*** A demo that follows the Open Close Principal (OCP) ***\n";
    System.out.println(header);
    // ___________________________________________________________

    var artsDepartment = new ArtsDepartment();
    var scienceDepartment = new ScienceDepartment();

    List<Student> artStudents = Utils.enrollStudents(artsDepartment);
    List<Student> scienceStudents = Utils.enrollStudents(scienceDepartment);

    artStudents.forEach(System.out::println);
    scienceStudents.forEach(System.out::println);
    // ___________________________________________________________
    Utils.format_print("=", 50);
  }
}










