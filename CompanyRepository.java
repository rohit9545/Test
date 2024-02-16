CompanyRepository.java
import org.springframework.data.jpa.repository.JpaRepository;

public interface CompanyRepository extends JpaRepository&lt;Company, Long&gt; {
}
