package mz.unitiva.academic_scheduler.auth;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;

/**
 * Represents an authentication request.
 */
public record AuthenticationRequest(

        @NotBlank
        @Email
        String email,

        @NotBlank
        String password

) {
}