package josem111.graphqlplayground.section01.lecture03.dto;
// FILE: dto/CustomerOrderDto.java
// ___________________________________________________________

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;
// ___________________________________________________________

@Data
@NoArgsConstructor
@AllArgsConstructor(staticName = "create")
public class CustomerOrderDto {
  private UUID id;
  private String description;
}
// ___________________________________________________________

