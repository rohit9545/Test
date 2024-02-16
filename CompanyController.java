
@RestController
@RequestMapping(&quot;/companies&quot;)
public class CompanyController {

@Autowired
private CompanyService companyService;

@GetMapping(&quot;/&quot;)
public List&lt;Company&gt; searchCompaniesByEmployeeRange(@RequestParam int
minEmployees, @RequestParam int maxEmployees) {
return companyService.findCompaniesByEmployeeRange(minEmployees, maxEmployees);
}

@GetMapping(&quot;/{userId}/clients&quot;)
public List&lt;Client&gt; getClientsByUser(@PathVariable Long userId) {
return companyService.findClientsByUser(userId);
}

@GetMapping(&quot;/search&quot;)
public List&lt;Company&gt; searchCompaniesByName(@RequestParam String name) {
return companyService.findCompaniesByName(name);

}

@GetMapping(&quot;/max-revenue&quot;)
public List&lt;Company&gt; getCompaniesWithMaxRevenue() {
return companyService.findCompaniesWithMaxRevenue();
}
}
