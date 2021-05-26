public class ValidationUtil {
    public static void validate(LoginRequest loginRequest) throws ValidationException {
        if (loginRequest.username() == null) {
            throw new ValidationException("Username is null");
        } else if (loginRequest.username().isBlank()) {
            throw new ValidationException("Username is black");
        } else if (loginRequest.password() == null) {
            throw new ValidationException("Username is black");
        } else if (loginRequest.password().isBlank()) {
            throw new ValidationException("Username is black");
        }
    }

    public static void validateRuntime(LoginRequest loginRequest) {
        if (loginRequest.username() == null) {
            throw new NullPointerException("Username is null");
        } else if (loginRequest.username().isBlank()) {
            throw new BlankException("Username is black");
        } else if (loginRequest.password() == null) {
            throw new NullPointerException("Username is black");
        } else if (loginRequest.password().isBlank()) {
            throw new BlankException("Username is black");
        }
    }
}
