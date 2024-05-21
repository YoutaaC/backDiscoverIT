package project.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import project.models.ContactEntity;

public interface ContactRepository extends JpaRepository<ContactEntity,Long> {
}
