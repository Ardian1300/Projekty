package loginSystem;

public class LoginTest {

    static void assertTrue(boolean condition, String testName){
        if(condition){
            System.out.println("✅ " + testName + " - PASSED");
        }else{
            System.out.println("❌ " + testName + " - FAILED");
        }
    }

    public static void main(String[] args) {

        User admin = new AdminUser("Adrian", "Adelajza1", UserRole.ADMIN);
        User user = new RegularUser("Ania", "Ania12345", UserRole.USER);
        User newUser = new RegularUser("Ania", "mariusz231", UserRole.USER);

        // Przykłady logowania:
        boolean correctPassword = false;
        try {
            admin.login("Adelajza1");// poprawne hasło
            System.out.println(admin.getInfo());
            correctPassword = true;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        assertTrue(correctPassword,"Test poprawnego hasła");

        try {
            user.login("zle1"); // 1 błędna próba
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        boolean exceptionThrown = false;

        try {
            user.login("zlehaslo"); // 2 błędna próba
        } catch (InvalidPasswordException e) {
            exceptionThrown = true;
        }
        assertTrue(exceptionThrown, "Test złego hasła");

        boolean blocked = false;

        try {
            user.login("zle3"); // 3 błędna próba -> blokada
        } catch (UserBlockedException e) {

            if(user.isBlocked()){
                blocked = true;
            }
            //System.out.println(e.getMessage());
        }
        assertTrue(blocked, "Test 3 złego hasła");


        // Próba zalogowania poprawnym hasłem po zablokowaniu
        boolean afterBlocking = false;

        try {
            user.login("Ania12345");
        } catch (UserBlockedException e) {
            afterBlocking = true;
            System.out.println(e.getMessage());
        }
        assertTrue(afterBlocking, "Test logowania zablokowanego użytkownika");

        try {
            newUser.login("zlehaslo"); // 1 błędna próba
        } catch (InvalidPasswordException e) {
            System.out.println(e.getMessage());
        }

        boolean secondCorrect = false;
        try {
            newUser.login("mariusz231");// 1 błędna próba
            if(newUser.getCountIncorrectPassword()== 0){
                secondCorrect = true;
            }
        } catch (InvalidPasswordException e) {
            System.out.println(e.getMessage());
        }
        assertTrue(secondCorrect,"test resetowania licznika błędnych haseł");

        boolean adminBlock = false;

        try {
            admin.login("zlehaslo"); // 1 błędna próba
        } catch (InvalidPasswordException e) {
            System.out.println(e.getMessage());
        }

        try {
            admin.login("zlehaslo"); // 2 błędna próba
        } catch (InvalidPasswordException e) {
            System.out.println(e.getMessage());
        }

        try {
            admin.login("zlehaslo");// 3 błędna próba
        } catch (InvalidPasswordException e) {
            if(!admin.isBlocked()){
                adminBlock = true;
            }
            System.out.println(e.getMessage());
        }

        assertTrue(adminBlock,"Test blokowania admina");



    }
}