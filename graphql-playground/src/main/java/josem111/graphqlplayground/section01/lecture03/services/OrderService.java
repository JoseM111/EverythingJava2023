package josem111.graphqlplayground.section01.lecture03.services;
// FILE: services/OrderService.java
// ___________________________________________________________

import josem111.graphqlplayground.section01.lecture03.dto.CustomerOrderDto;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;

import java.util.*;
// ___________________________________________________________


@Service
public class OrderService {
  private final Map<String, List<CustomerOrderDto>> customerOrderMap = Map.of(
    "Sami", List.of(
      CustomerOrderDto.create(UUID.randomUUID(), "sami-product1"),
      CustomerOrderDto.create(UUID.randomUUID(), "sami-product2")
    ),
    "Mike", List.of(
      CustomerOrderDto.create(UUID.randomUUID(), "mike-product1"),
      CustomerOrderDto.create(UUID.randomUUID(), "mike-product2"),
      CustomerOrderDto.create(UUID.randomUUID(), "mike-product3")
    )
  );
  
  public Flux<CustomerOrderDto> ordersByCustomerName(String name) {
    return Flux.fromIterable(
      customerOrderMap.getOrDefault(
      name,
      Collections.emptyList()
      )
    );
  }
}
// ___________________________________________________________
