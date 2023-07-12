package josem111.graphqlplayground.section01.lecture01;
// FILE: graphqlplayground/GraphQLController.java
// ___________________________________________________________

import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;
import reactor.core.publisher.Mono;

import java.time.Duration;
import java.util.concurrent.ThreadLocalRandom;
// ___________________________________________________________

@Controller
public class GraphQLController {
  @QueryMapping(name = "sayHello")
  public Mono<String> healthCheck() {
    return Mono
      .just("Health check!")
      .delayElement(Duration.ofMillis(800));
  }
  
  @QueryMapping(name = "sayHelloTwo")
  public Mono<String> healthCheck2(@Argument("age") int value) {
    return Mono
      .fromSupplier(() -> {
        return String.format("Health Check 2: %d", value);
      })
      .delayElement(Duration.ofMillis(900));
  }
  
  @QueryMapping(name = "randomEndpoint")
  public Mono<String> healthCheck3() {
    var rand = ThreadLocalRandom
      .current()
      .nextInt(1, 10);
    
    return Mono
      .fromSupplier(() -> {
        return String.format("Random number in range: %d", rand);
      })
      .delayElement(Duration.ofMillis(1000));
  }
}
// ___________________________________________________________
























