package josem111.graphqlplayground.section01.lecture03.controllers;
// FILE: controllers/CustomerController.java
// ___________________________________________________________

import josem111.graphqlplayground.section01.lecture03.dto.Customer;
import josem111.graphqlplayground.section01.lecture03.dto.CustomerOrderDto;
import josem111.graphqlplayground.section01.lecture03.services.CustomerService;
import josem111.graphqlplayground.section01.lecture03.services.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.SchemaMapping;
import org.springframework.stereotype.Controller;
import reactor.core.publisher.Flux;

import static java.text.MessageFormat.*;
// ___________________________________________________________

@Controller
public class CustomerController {
  @Autowired
  private CustomerService customerService;
  @Autowired
  private OrderService orderService;
  
  //@QueryMapping(name = "customers")
  @SchemaMapping(typeName = "Query", value = "customers")// needed the value because I used another name
  public Flux<Customer> fetchCustomers() {
    return this.customerService.allCustomers();
  }
  
  @SchemaMapping(typeName = "Customer")
  public Flux<CustomerOrderDto> orders(Customer customer) {
    System.out.println(format("Invoke for {0}", customer.getName()));
    
    return this.orderService.ordersByCustomerName(customer.getName());
  }
}
// ___________________________________________________________

/**
 * getting the data back from `graphql`
 * -------------------------------------------------------------
 * {
 * customers {
 * id
 * name
 * age
 * orders {
 * id
 * description
 * }
 * }
 * }
 * -------------------------------------------------------------
 * RESPONSE:
 * {
 * "data": {
 * "customers": [
 * {
 * "id": "1",
 * "name": "Sami",
 * "age": 20,
 * "orders": [
 * {
 * "id": "a5df6f2e-a829-4013-866c-14922783df4b",
 * "description": "sami-product1"
 * },
 * {
 * "id": "0f266591-ef88-48d9-8668-2c47cc4fcec5",
 * "description": "sami-product2"
 * }
 * ]
 * },
 * {
 * "id": "2",
 * "name": "Jake",
 * "age": 10,
 * "orders": []
 * },
 * {
 * "id": "3",
 * "name": "Mike",
 * "age": 15,
 * "orders": [
 * {
 * "id": "2fec92c0-eef4-4141-ad4b-fa78e4fc801a",
 * "description": "mike-product1"
 * },
 * {
 * "id": "24b14b07-2c79-4eb8-b059-679e40b8b979",
 * "description": "mike-product2"
 * },
 * {
 * "id": "d78e4603-e58d-4cb8-8e0d-a6163af16a76",
 * "description": "mike-product3"
 * }
 * ]
 * },
 * {
 * "id": "4",
 * "name": "John",
 * "age": 5,
 * "orders": []
 * }
 * ]
 * }
 * }
 */
// ___________________________________________________________


