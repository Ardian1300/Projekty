package loginSystem;

public class RegularUser extends User implements Authenticatable {

    public RegularUser(String username, String password, UserRole role) {
        super(username, password, role);
    }

    @Override
    public boolean login(String password) {
        if (isBlocked()) {
            throw new UserBlockedException("Użytkownik jest zablokowany");
        }

        if (!password.equals(getPassword())) {
            incrementFailedAttempts();
            if (getCountIncorrectPassword() >= 3) {
                blockUser();
                throw new UserBlockedException("Zbyt wiele prób - użytkownik zablokowany");
            }
            throw new InvalidPasswordException("Niepoprawne hasło");
        }

        resetFailedAttempts();
        return true;
    }

    @Override
    public boolean isPasswordStrong(String password) {
        return password.length() >= 8 && password.matches(".*\\d.*");
    }
}