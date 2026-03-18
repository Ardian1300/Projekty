package loginSystem;

public interface Authenticatable {



    boolean login(String password);
    boolean isPasswordStrong(String password);
}
