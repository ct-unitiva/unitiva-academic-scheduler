package mz.unitiva.academic_scheduler.auth.controller;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import mz.unitiva.academic_scheduler.auth.dto.request.AuthenticationRequest;
import mz.unitiva.academic_scheduler.auth.dto.response.AuthenticationResponse;
import mz.unitiva.academic_scheduler.auth.service.AuthenticationService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 * Exposes authentication endpoints.
 */
@RestController
@RequestMapping("/api/v1/auth")
@RequiredArgsConstructor
public class AuthenticationController {

    private final AuthenticationService authenticationService;

    /**
     * Authenticates a user account.
     *
     * @param request authentication credentials
     * @return authentication response
     */
    @PostMapping("/login")
    public ResponseEntity<AuthenticationResponse> login(
            @Valid @RequestBody AuthenticationRequest request
    ) {
        return ResponseEntity.ok(authenticationService.authenticate(request));
    }
}