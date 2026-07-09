package mz.unitiva.academic_scheduler.config.seed;

import lombok.RequiredArgsConstructor;
import mz.unitiva.academic_scheduler.role.entity.Role;
import mz.unitiva.academic_scheduler.role.entity.RoleName;
import mz.unitiva.academic_scheduler.role.repository.RoleRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

/**
 * Seeds initial system data during application startup.
 */
@Component
@RequiredArgsConstructor
public class DataSeeder implements CommandLineRunner {

    private final RoleRepository roleRepository;

    @Override
    public void run(String... args) {

        createRoleIfNotExists(
                RoleName.ADMIN,
                "System administrator with full access."
        );

        createRoleIfNotExists(
                RoleName.SECRETARIA,
                "Responsible for academic scheduling operations."
        );

        createRoleIfNotExists(
                RoleName.COORDENADOR,
                "Responsible for course and defense management."
        );

        createRoleIfNotExists(
                RoleName.DOCENTE,
                "Academic staff member participating in defenses."
        );

        createRoleIfNotExists(
                RoleName.ESTUDANTE,
                "Student requesting and participating in defenses."
        );

        createRoleIfNotExists(
                RoleName.DIRECAO,
                "Institutional management role."
        );

        createRoleIfNotExists(
                RoleName.RECURSOS,
                "Responsible for infrastructure and resource management."
        );
    }

    /**
     * Creates a role if it does not already exist.
     *
     * @param roleName role identifier
     * @param description role description
     */
    private void createRoleIfNotExists(
            RoleName roleName,
            String description
    ) {

        if (roleRepository.existsByName(roleName)) {
            return;
        }

        Role role = Role.builder()
                .name(roleName)
                .description(description)
                .active(true)
                .build();

        roleRepository.save(role);
    }
}