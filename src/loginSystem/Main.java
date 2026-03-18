package loginSystem;

public class Main {
    public static void main(String[] args) {

        User admin = new AdminUser("Adrian", "Adelajza1", UserRole.ADMIN);
        User user = new RegularUser("Ania", "Ania12345", UserRole.USER);

        // Przykłady logowania:
        try {
            admin.login("Adelajza1"); // poprawne hasło
            System.out.println(admin.getInfo());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        try {
            user.login("zle1"); // 1 błędna próba
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        try {
            user.login("zle2"); // 2 błędna próba
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        try {
            user.login("zle3"); // 3 błędna próba -> blokada
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        // Próba zalogowania poprawnym hasłem po zablokowaniu
        try {
            user.login("Ania12345");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}