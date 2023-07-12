package josem111.graphqlplayground.section01.lecture02.models;
// FILE: Models/Customer.java
// ___________________________________________________________

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
// ___________________________________________________________

@Data
@NoArgsConstructor
// will create a new customer like so `Customer.create()`
@AllArgsConstructor(staticName = "create")
public class Customer {
  private Integer id;
  private String name;
  private Integer age;
  private String city;
}
// ___________________________________________________________
