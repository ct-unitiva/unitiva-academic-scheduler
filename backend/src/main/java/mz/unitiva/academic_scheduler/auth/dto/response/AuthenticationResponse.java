package mz.unitiva.academic_scheduler.auth.dto.response;

/**
 * Represents a successful authentication response.
 */
public record AuthenticationResponse(

        String message,
        String email,
        String accessToken

) {
}