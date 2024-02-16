Application.java:
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {&quot;com.example&quot;}) // Replace &quot;com.example&quot; with your base
package
public class Application {

public static void main(String[] args) {
SpringApplication.run(Application.class, args);
}
}
