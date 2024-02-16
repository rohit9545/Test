UserRepository.java
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository&lt;User, Long&gt; {
List&lt;User&gt; findByUsername(String username);
}
