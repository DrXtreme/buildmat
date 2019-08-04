package hello;

import java.util.concurrent.atomic.AtomicLong;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
//import org.springframework.web.bind.annotation.*;

@RestController
@SpringBootApplication
public class Application {
  private final AtomicLong counter = new AtomicLong();

    @RequestMapping("/")
    public Pay home() {
      return new Pay(counter.incrementAndGet(),"because he's building me a new apartment",1000,"10/10/12 11:22","Mudathar himself");
    }

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
