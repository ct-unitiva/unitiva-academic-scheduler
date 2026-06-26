package mz.unitiva.academic_scheduler.auth;

/**
 * Represents an authentication response.
 */
public record AuthenticationResponse(

        String message,
        String email

) {
}