package mz.unitiva.academic_scheduler.config.seed;

import lombok.RequiredArgsConstructor;
import mz.unitiva.academic_scheduler.role.entity.Role;
import mz.unitiva.academic_scheduler.role.entity.RoleName;
import mz.unitiva.academic_scheduler.role.repository.RoleRepository;
import mz.unitiva.academic_scheduler.user.entity.User;
import mz.unitiva.academic_scheduler.user.entity.UserStatus;
import mz.unitiva.academic_scheduler.user.repository.UserRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

import java.util.Set;

/**
 * Seeds the initial administrator account.
 */
@Component
@RequiredArgsConstructor
public class AdminSeeder implements CommandLineRunner {

    private static final String ADMIN_EMAIL = "admin@unitiva.ac.mz";
    private static final String ADMIN_PASSWORD = "Admin@12345";

    private final UserRepository userRepository;
    private final RoleRepository roleRepository;
    private final PasswordEncoder passwordEncoder;

    @Override
    public void run(String... args) {
        if (userRepository.existsByEmail(ADMIN_EMAIL)) {
            return;
        }

        Role adminRole = roleRepository.findByName(RoleName.ADMIN)
                .orElseThrow(() -> new IllegalStateException("ADMIN role was not found."));

        User admin = User.builder()
                .fullName("System Administrator")
                .email(ADMIN_EMAIL)
                .password(passwordEncoder.encode(ADMIN_PASSWORD))
                .phone(null)
                .status(UserStatus.ACTIVE)
                .roles(Set.of(adminRole))
                .build();

        userRepository.save(admin);
    }
}