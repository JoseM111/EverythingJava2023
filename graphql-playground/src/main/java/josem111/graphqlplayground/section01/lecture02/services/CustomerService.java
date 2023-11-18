package josem111.graphqlplayground.section01.lecture02.services;
// FILE: services/CustomerService.java
// ___________________________________________________________

import josem111.graphqlplayground.section01.lecture02.dto.AgeRangeFilter;
import josem111.graphqlplayground.section01.lecture02.dto.Customer;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
// ___________________________________________________________


@Service
public class CustomerService {
  private final Flux<Customer> fluxCustomer = Flux.just(
    new Customer(1, "Sami", 20, "Atlanta"),
    new Customer(2, "Jake", 10, "Las Vegas"),
    new Customer(3, "Mike", 15, "Miami"),
    new Customer(4, "John", 5, "Houston"));
  
  public Flux<Customer> allCustomers() {
    return fluxCustomer;
  }
  
  public Mono<Customer> customerByID(Integer id) {
    return fluxCustomer
      .filter((Customer customer) -> {
        return customer
          .id()
          .equals(id);
      })
      .next();
  }
  
  public Flux<Customer> nameContains(String name) {
    return fluxCustomer.filter((Customer customer) -> {
      return customer
        .name()
        .contains(name);
    });
  }
  
  public Flux<Customer> filterByAge(AgeRangeFilter filter) {
    return fluxCustomer.filter((Customer customer) -> {
      return (
        customer.age() >= filter.minAge()
          &&
          customer.age() <= filter.maxAge()
      );
    });
  }
}
// ___________________________________________________________















