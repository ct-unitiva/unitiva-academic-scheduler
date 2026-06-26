package mz.unitiva.academic_scheduler.config;

import lombok.RequiredArgsConstructor;
import mz.unitiva.academic_scheduler.role.Role;
import mz.unitiva.academic_scheduler.role.RoleName;
import mz.unitiva.academic_scheduler.role.RoleRepository;
import mz.unitiva.academic_scheduler.user.User;
import mz.unitiva.academic_scheduler.user.UserRepository;
import mz.unitiva.academic_scheduler.user.UserStatus;
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