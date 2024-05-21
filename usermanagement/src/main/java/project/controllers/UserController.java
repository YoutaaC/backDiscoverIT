package project.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import project.models.EventEntity;
import project.models.PostEntity;
import project.models.UserEntity;
import project.repository.UserRepository;
import project.service.EventServiceInter;
import project.service.PostServiceInter;
import project.service.UserServiceImpl;
import project.service.UserServiceInter;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/user")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class UserController {

    @Autowired
    private UserServiceInter userServiceInter;

    @Autowired
    private UserRepository userRepository;

    @DeleteMapping("/delete/{username}")
    public ResponseEntity<?> deleteUserByUsername(@PathVariable String username) {
        Optional<UserEntity> userOptional = userRepository.findByUsername(username);
        if (userOptional.isPresent()) {
            userRepository.delete(userOptional.get());
            return ResponseEntity.ok("User deleted successfully");
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @GetMapping("/getAllUsers")
    public List<UserEntity> getAllUsers() {
        return userServiceInter.getAllUsers();
    }

    @PutMapping("/updateUser/{id}")
    public UserEntity updateUser(@PathVariable Long id, @RequestBody UserEntity user) {
        return userServiceInter.updateUser(id, user);
    }

    @GetMapping("/getUserById/{id}")
    public UserEntity getUserById(@PathVariable Long id) {
        return userServiceInter.getById(id);
    }

    @DeleteMapping("/deleteById/{id}")
    public ResponseEntity<?> deleteUserById(@PathVariable Long id) {
        Optional<UserEntity> userOptional = userRepository.findById(id);
        if (userOptional.isPresent()) {
            userServiceInter.deleteUserId(id);
            return ResponseEntity.ok("User deleted successfully");
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @GetMapping("/count")
    public long getUserCount() {
        return userServiceInter.countUsers();
    }

    @GetMapping("/search")
    public ResponseEntity<List<UserEntity>> searchUsers(
            @RequestParam(value = "username", required = false) String username,
            @RequestParam(value = "id", required = false) Long id,
            @RequestParam(value = "email", required = false) String email) {
        List<UserEntity> users = userServiceInter.searchUsers(username, id, email);
        return ResponseEntity.ok(users);
    }


}
