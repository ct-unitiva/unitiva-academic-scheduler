package mz.unitiva.academic_scheduler.role.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import mz.unitiva.academic_scheduler.role.entity.Role;
import mz.unitiva.academic_scheduler.role.entity.RoleName;
import java.util.Optional;

/**
 * Repository for role persistence operations.
 */
public interface RoleRepository extends JpaRepository<Role, Long> {

    Optional<Role> findByName(RoleName name);

    boolean existsByName(RoleName name);
}