import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CheckPasswordTest {
    private CheckPassword checkPassword = new CheckPassword();
    private String password = "Abcd09!qwertyu";

    @Test
    public void hasGoodLength(){
        Assertions.assertTrue(checkPassword.hasGoodLength(password));
    }
    @Test
    public void hasNoWhiteSpaces(){
        Assertions.assertTrue(checkPassword.hasNoWhiteSpaces(password));

    }
    @Test
    public void hasNoRepetitions(){
        Assertions.assertTrue(checkPassword.hasNoRepetitions(password));

    }
    @Test
    public void hasNumbers(){
        Assertions.assertTrue(checkPassword.hasNumbers(password));

    }
    @Test
    public void hasSpecialCharacter(){
        Assertions.assertTrue(checkPassword.hasSpecialCharacter(password));

    }
}
