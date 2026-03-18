package loginSystem;

public abstract class User {

    private String username;
    private String password;
    private UserRole role;
    private boolean isBlocked;
    private int countIncorrectPassword = 0;

    public User(String username, String password, UserRole role) {
        this.username = username;
        this.password = password;
        this.role = role;
        this.isBlocked = false;
    }

    // GETTERY
    public String getUsername() { return username; }
    public String getPassword() { return password; }
    public UserRole getRole() { return role; }
    public boolean isBlocked() { return isBlocked; }
    public int getCountIncorrectPassword() { return countIncorrectPassword; }

    // INKREMENTACJA / RESET BŁĘDNYCH PRÓB
    public void incrementFailedAttempts() { countIncorrectPassword++; }
    public void resetFailedAttempts() { countIncorrectPassword = 0; }

    // BLOKOWANIE / ODPOBLOKOWANIE
    public void blockUser() { this.isBlocked = true; }
    public void unblockUser() {
        this.isBlocked = false;
        resetFailedAttempts();
    }

    // INFO
    public String getInfo() {
        return "User: " + username + ", Role: " + role + ", Blocked: " + isBlocked;
    }

    // 🔹 KLUCZOWE: abstrakcyjna metoda login
    public abstract boolean login(String password);
    public abstract boolean isPasswordStrong(String password);
}