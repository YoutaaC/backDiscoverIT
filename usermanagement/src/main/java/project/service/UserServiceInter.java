package project.service;

import project.models.EventEntity;
import project.models.UserEntity;

import java.util.List;

public interface UserServiceInter {

    void deleteUserId(Long id);
    List<UserEntity> getAllUsers();
    UserEntity updateUser(Long id,UserEntity user);
    UserEntity getById(Long id);


    List<UserEntity> searchUsers(String username, Long id, String email);

    long countUsers();
}
