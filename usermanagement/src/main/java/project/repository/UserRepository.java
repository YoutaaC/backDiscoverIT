package project.repository;
import org.apache.catalina.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import project.models.UserEntity;

import java.util.List;
import java.util.Map;
import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<UserEntity,Integer > {

    Optional<UserEntity> findByUsername(String username);
    Boolean existsByUsername(String username);
    Boolean existsByEmail(String email);

    void deleteById(Long id);

    Optional<UserEntity> findById(Long userId);

    List<UserEntity> findByUsernameContaining(String username);

    List<UserEntity> findByEmail(String email);
}
