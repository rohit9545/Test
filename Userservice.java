Userservice.java
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

@Autowired
private UserRepository userRepository;

public List&lt;User&gt; findByUsername(String username) {
return userRepository.findByUsername(username);
}

public List&lt;User&gt; getAllUsers() {
return userRepository.findAll();
}

public User updateUser(Long userId, User user) {
if (userRepository.existsById(userId)) {
user.setId(userId);
return userRepository.save(user);

} else {
return null;
}
}

public User getUser(Long userId) {
return userRepository.findById(userId).orElse(null);
}
}
