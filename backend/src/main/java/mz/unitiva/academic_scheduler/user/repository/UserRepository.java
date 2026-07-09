package mz.unitiva.academic_scheduler.user.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import mz.unitiva.academic_scheduler.user.entity.User;
import java.util.Optional;

/**
 * Repository responsible for user persistence operations.
 */
public interface UserRepository extends JpaRepository<User, Long> {

    Optional<User> findByEmail(String email);

    boolean existsByEmail(String email);
}