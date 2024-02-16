UserController.java
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@RestController
@RequestMapping(&quot;/users&quot;)
public class UserController {

@Autowired
private UserService userService;

@GetMapping(&quot;/&quot;)
public List&lt;User&gt; listUsers(@RequestParam(required = false) String username) {
if (username != null) {
return userService.findByUsername(username);
} else {

return userService.getAllUsers();
}
}

@PutMapping(&quot;/{userId}&quot;)
public ResponseEntity&lt;User&gt; updateUser(@PathVariable Long userId, @RequestBody User
user) {
User updatedUser = userService.updateUser(userId, user);
if (updatedUser != null) {
return ResponseEntity.ok(updatedUser);
} else {
return ResponseEntity.notFound().build();
}
}

@GetMapping(&quot;/{userId}/profile&quot;)
public ResponseEntity&lt;User&gt; getUserProfile(@PathVariable Long userId) {
User user = userService.getUser(userId);
if (user != null) {
if (isValidEmail(user.getEmail())) {
return ResponseEntity.ok(user);
} else {
return ResponseEntity.badRequest().build();
}

} else {
return ResponseEntity.notFound().build();
}
}

private boolean isValidEmail(String email) {
String emailRegex = &quot;^[a-zA-Z0-9_+&amp;*-]+(?:\\.[a-zA-Z0-9_+&amp;*-]+)*@(?:[a-zA-Z0-9-
]+\\.)+[a-zA-Z]{2,7}$&quot;;

Pattern pattern = Pattern.compile(emailRegex);

Matcher matcher = pattern.matcher(email);

return matcher.matches();
}
}
