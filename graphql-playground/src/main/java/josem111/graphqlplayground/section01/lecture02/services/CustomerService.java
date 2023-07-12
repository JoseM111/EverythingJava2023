package josem111.graphqlplayground.section01.lecture02.services;
// FILE: services/CustomerService.java
// ___________________________________________________________

import josem111.graphqlplayground.section01.lecture02.models.AgeRangeFilter;
import josem111.graphqlplayground.section01.lecture02.models.Customer;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
// ___________________________________________________________


@Service
public class CustomerService {
  private final Flux<Customer> fluxCustomer = Flux.just(
    Customer.create(1, "Sami", 20, "Atlanta"),
    Customer.create(2, "Jake", 10, "Las Vegas"),
    Customer.create(3, "Mike", 15, "Miami"),
    Customer.create(4, "John", 5, "Houston"));
  
  public Flux<Customer> allCustomers() {
    return fluxCustomer;
  }
  
  public Mono<Customer> customerByID(Integer id) {
    return fluxCustomer
      .filter((Customer customer) -> {
        return customer
          .getId()
          .equals(id);
      })
      .next();
  }
  
  public Flux<Customer> nameContains(String name) {
    return fluxCustomer.filter((Customer customer) -> {
      return customer
        .getName()
        .contains(name);
    });
  }
  
  public Flux<Customer> filterByAge(AgeRangeFilter filter) {
    return fluxCustomer.filter((Customer customer) -> {
      return (
        customer.getAge() >= filter.getMinAge()
          &&
          customer.getAge() <= filter.getMaxAge()
      );
    });
  }
}
// ___________________________________________________________















