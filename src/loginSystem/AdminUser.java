package loginSystem;

public class AdminUser extends User implements Authenticatable {

    public AdminUser(String username, String password, UserRole role) {
        super(username, password, role);
    }

    @Override
    public boolean login(String password) {
        if (isBlocked()) {
            throw new UserBlockedException("Użytkownik jest zablokowany");
        }
        if (!password.equals(getPassword())) {
            throw new InvalidPasswordException("Niepoprawne hasło");
        }
        return true;
    }

    @Override
    public boolean isPasswordStrong(String password) {
        return password.length() >= 8 && password.matches(".*\\d.*");
    }
}