package josem111.graphqlplayground.section01.lecture03.dto;
// FILE: Models/Customer.java
// ___________________________________________________________

import lombok.*;
// ___________________________________________________________

@Data
@NoArgsConstructor
@AllArgsConstructor(staticName = "create")
public class Customer {
  private Integer id;
  private String name;
  private Integer age;
  private String city;
}
// ___________________________________________________________
