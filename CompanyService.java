import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CompanyService {

@Autowired
private CompanyRepository companyRepository;

public List&lt;Company&gt; findCompaniesByEmployeeRange(int minEmployees, int
maxEmployees) {

return companyRepository.findByEmployeesBetween(minEmployees, maxEmployees);
}

public List&lt;Company&gt; findCompaniesByName(String name) {
return companyRepository.findByNameContaining(name);
}

public List&lt;Company&gt; findCompaniesWithMaxRevenue() {
// Implement logic to find companies with max revenue
return null;
}
}
