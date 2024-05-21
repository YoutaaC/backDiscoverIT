package project.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import project.models.EventEntity;
import project.models.UserEntity;

@Repository
public interface EventRepository extends JpaRepository<EventEntity,Long> {


}
