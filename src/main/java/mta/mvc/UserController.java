package mta.mvc;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/")
public class UserController {

    @Autowired
    private UserService userService;
    @CrossOrigin
    @GetMapping("/users")
    public List<User> getAllUsers() {
        return userService.getAllUsers();
    }
    @CrossOrigin
    @GetMapping("/users/{id}")
    public User getUserById(@PathVariable Long id) {
        return userService.getUserById(id);
    }
    @CrossOrigin
    @PostMapping("/users")
    public void addUser(@RequestBody User user) {
        userService.addUser(user);
    }
    @CrossOrigin
    @PutMapping("/uses/{id}")
    public void updateUser(@PathVariable Long id, @RequestBody User user) {
        user.setId(id);
        userService.updateUser(user);
    }
    @CrossOrigin
    @DeleteMapping("/user/{id}")
    public void deleteUser(@PathVariable Long id) {
        userService.deleteUser(id);
    }
}
