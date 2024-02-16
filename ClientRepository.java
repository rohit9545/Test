ClientRepository.java
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository&lt;Client, Long&gt; {
}
