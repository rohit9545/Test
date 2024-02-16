ClientController.java
@RestController
@RequestMapping(&quot;/clients&quot;)
public class ClientController {

@Autowired
private ClientService clientService;

@PostMapping(&quot;/&quot;)
@PreAuthorize(&quot;hasRole(&#39;ROLE_ADMIN&#39;)&quot;)
public ResponseEntity&lt;Client&gt; createClient(@RequestBody Client client) {
Client createdClient = clientService.createClient(client);
if (createdClient != null) {
return ResponseEntity.ok(createdClient);
} else {
return ResponseEntity.badRequest().build();
}
}

@PatchMapping(&quot;/{clientId}&quot;)
public ResponseEntity&lt;Client&gt; updateClient(@PathVariable Long clientId, @RequestBody
Client client) {
Client updatedClient = clientService.updateClient(clientId, client);
if (updatedClient != null) {
return ResponseEntity.ok(updatedClient);
} else {
return ResponseEntity.notFound().build();
}
}
}
