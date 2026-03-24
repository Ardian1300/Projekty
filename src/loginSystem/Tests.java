package loginSystem;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class Tests {

    @Test
    void correctPassword(){
        User user = new RegularUser("Ania", "Ania12345", UserRole.USER);

        boolean result = user.login("Ania12345");

        assertTrue(result);
    }

    @Test
    void badPassword(){
        User admin = new AdminUser("Adrian", "Marka12@", UserRole.ADMIN);

        assertThrows(InvalidPasswordException.class, () -> {
            admin.login("zlehaslo");
        });
    }

    @Test
    void thirdBadPassword(){
        User user = new RegularUser("Marek", "Natasza32!", UserRole.USER);

        assertThrows(InvalidPasswordException.class, () -> {user.login("Ma325523#");});
        assertThrows(InvalidPasswordException.class, () -> {user.login("Pdfsdf@");});
        assertThrows(UserBlockedException.class, () -> {user.login("dobre33dsfsdf41#");});


    }

    @Test
    void correctPasswordAfterBlock(){
        User user = new RegularUser("Andrzej", "Anakonda23@", UserRole.USER);

        assertThrows(InvalidPasswordException.class, () -> {user.login("Marta21#");});
        assertThrows(InvalidPasswordException.class, () -> {user.login("Pawel31@");});
        assertThrows(UserBlockedException.class, () -> {user.login("dobrehaslo2341#");});
        assertThrows(UserBlockedException.class, () -> {user.login("Anakonda23@");});

    }

    @Test
    void resetCounter() {
        User user = new RegularUser("Adrian", "Marmolada21@", UserRole.USER);

        assertThrows(InvalidPasswordException.class, () -> {user.login("Marta21#");});
        user.login("Marmolada21@");
        assertEquals(0, user.getCountIncorrectPassword());
    }

    @Test
    void adminBlocking(){
        User admin = new AdminUser("Marian", "DobreHasło12@", UserRole.ADMIN);

        assertThrows(InvalidPasswordException.class, () -> {admin.login("M4325324#");});
        assertThrows(InvalidPasswordException.class, () -> {admin.login("P324324#");});
        assertThrows(InvalidPasswordException.class, () -> {admin.login("do25335235lo2341#");});
        boolean result = admin.isBlocked();
        assertFalse(result);

    }

    @Test
    void shouldIncreaseFailedAttempts() {
        User user = new RegularUser("Test", "Haslo123!", UserRole.USER);

        assertThrows(InvalidPasswordException.class, () -> user.login("zle"));

        assertEquals(1, user.getCountIncorrectPassword());
    }

}
