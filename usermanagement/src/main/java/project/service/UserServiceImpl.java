package project.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import project.models.EventEntity;
import project.models.UserEntity;
import project.repository.EventRepository;
import project.repository.RoleRepository;
import project.repository.UserRepository;
import project.security.JWTGenerator;

import javax.management.relation.Role;
import java.util.Collections;
import java.util.List;

@Service
public class UserServiceImpl implements UserServiceInter{


    @Autowired
    private UserRepository userRepository;




    @Override
    public List<UserEntity> getAllUsers() {
        return userRepository.findAll();
    }

    @Override
    public UserEntity updateUser(Long id, UserEntity user) {
        return userRepository.findById(id)
                .map(existingUser -> {
                    existingUser.setFirstName(user.getFirstName());
                    existingUser.setLastName(user.getLastName());
                    existingUser.setUsername(user.getUsername());
                    existingUser.setEmail(user.getEmail());
                    existingUser.setTel(user.getTel());
                    existingUser.setPassword(user.getPassword());
                    return userRepository.save(existingUser);
                })
                .orElseThrow(() -> new IllegalArgumentException("User not found"));
    }

    @Override
    public UserEntity getById(Long id) {
        return userRepository.findById(id).orElse(null);
    }

    @Override
    public void deleteUserId(Long id) {
        userRepository.deleteById(id);
    }

    @Override
    public long countUsers() {
        return userRepository.count();
    }

    @Override
    public List<UserEntity> searchUsers(String username, Long id, String email) {
        if (username != null) {
            return userRepository.findByUsernameContaining(username);
        } else if (id != null) {
            return userRepository.findById(id)
                    .map(Collections::singletonList)
                    .orElse(Collections.emptyList());
        } else if (email != null) {
            return userRepository.findByEmail(email);
        } else {
            return Collections.emptyList();
        }
    }

}
