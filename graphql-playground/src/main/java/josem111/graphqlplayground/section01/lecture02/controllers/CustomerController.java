package josem111.graphqlplayground.section01.lecture02.controllers;
// FILE: controllers/CustomerController.java
// ___________________________________________________________

import josem111.graphqlplayground.section01.lecture02.dto.AgeRangeFilter;
import josem111.graphqlplayground.section01.lecture02.dto.Customer;
import josem111.graphqlplayground.section01.lecture02.services.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
// ___________________________________________________________

@Controller
public class CustomerController {
  @Autowired
  private CustomerService customerService;
  
  @QueryMapping(name = "customers")
  public Flux<Customer> fetchCustomers() {
    return this.customerService.allCustomers();
  }
  
  @QueryMapping(name = "customerByID")
  public Mono<Customer> fetchCustomerByID(@Argument Integer id) {
    return this.customerService.customerByID(id);
  }
  
  @QueryMapping(name = "customersNameContains")
  public Flux<Customer> fetchCustomerNameContains(@Argument String name) {
    return this.customerService.nameContains(name);
  }
  
  @QueryMapping(name = "customerByAgeRange")
  public Flux<Customer> fetchCustomerNameContains(@Argument AgeRangeFilter filter) {
    return this.customerService.filterByAge(filter);
  }
}
// ___________________________________________________________

/**
 * getting the data back from `graphql`
 * -------------------------------------------------------------
 * {
 *   customers {
 *     name
 *     city
 *   }
 *   customerByID(id: 2) {
 *     id
 *     name
 *     city
 *   }
 *   customersNameContains(name: "S") {
 *     name
 *     age
 *   }
 *   customerByAgeRange(filter: {minAge: 8, maxAge: 19}) {
 *     id
 *     name
 *     age
 *   }
 * }
 * -------------------------------------------------------------
 * RESPONSE:
 * {
 *   "data": {
 *     "customers": [
 *       {
 *         "name": "Sami",
 *         "city": "Atlanta"
 *       },
 *       {
 *         "name": "Jake",
 *         "city": "Las Vegas"
 *       },
 *       {
 *         "name": "Mike",
 *         "city": "Miami"
 *       },
 *       {
 *         "name": "John",
 *         "city": "Houston"
 *       }
 *     ],
 *     "customerByID": {
 *       "id": "2",
 *       "name": "Jake",
 *       "city": "Las Vegas"
 *     },
 *     "customersNameContains": [
 *       {
 *         "name": "Sami",
 *         "age": 20
 *       }
 *     ],
 *     "customerByAgeRange": [
 *       {
 *         "id": "2",
 *         "name": "Jake",
 *         "age": 10
 *       },
 *       {
 *         "id": "3",
 *         "name": "Mike",
 *         "age": 15
 *       }
 *     ]
 *   }
 * }
 * */
// ___________________________________________________________


