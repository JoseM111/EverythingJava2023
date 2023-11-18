package josem111.graphqlplayground.section01.lecture03.services;
// FILE: services/CustomerService.java
// ___________________________________________________________

import josem111.graphqlplayground.section01.lecture03.dto.Customer;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
// ___________________________________________________________


@Service
public class CustomerService {
  private final Flux<Customer> fluxCustomer = Flux.just(
    Customer.create(1, "Sami", 20, "Atlanta"),
    Customer.create(2, "Jake", 10, "Las Vegas"),
    Customer.create(3, "Mike", 15, "Miami"),
    Customer.create(4, "John", 5, "Houston")
  );
  
  public Flux<Customer> allCustomers() {
    return fluxCustomer;
  }
}
// ___________________________________________________________















