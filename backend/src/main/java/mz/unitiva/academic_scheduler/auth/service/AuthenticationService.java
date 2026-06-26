package mz.unitiva.academic_scheduler.auth;

import lombok.RequiredArgsConstructor;
import mz.unitiva.academic_scheduler.user.User;
import mz.unitiva.academic_scheduler.user.UserRepository;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.stereotype.Service;

/**
 * Handles authentication operations.
 */
@Service
@RequiredArgsConstructor
public class AuthenticationService {

    private final AuthenticationManager authenticationManager;
    private final UserRepository userRepository;

    /**
     * Authenticates a user using email and password.
     *
     * @param request authentication credentials
     * @return authentication response
     */
    public AuthenticationResponse authenticate(AuthenticationRequest request) {
        authenticationManager.authenticate(
                new UsernamePasswordAuthenticationToken(
                        request.email(),
                        request.password()
                )
        );

        User user = userRepository.findByEmail(request.email())
                .orElseThrow(() -> new IllegalArgumentException("Invalid user credentials."));

        return new AuthenticationResponse(
                "Authentication successful",
                user.getEmail()
        );
    }
}