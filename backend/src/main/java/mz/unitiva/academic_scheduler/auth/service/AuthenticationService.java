package mz.unitiva.academic_scheduler.auth.service;

import lombok.RequiredArgsConstructor;
import mz.unitiva.academic_scheduler.auth.dto.request.AuthenticationRequest;
import mz.unitiva.academic_scheduler.auth.dto.response.AuthenticationResponse;
import mz.unitiva.academic_scheduler.auth.jwt.JwtService;
import mz.unitiva.academic_scheduler.user.entity.User;
import mz.unitiva.academic_scheduler.user.repository.UserRepository;
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
    private final JwtService jwtService;

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

        String accessToken = jwtService.generateToken(user);

        return new AuthenticationResponse(
                "Authentication successful",
                user.getEmail(),
                accessToken
        );
    }
}