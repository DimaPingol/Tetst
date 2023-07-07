import org.junit.Assert;
import org.junit.Before;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;


import static org.junit.jupiter.api.Assertions.*;

public class PasswordValidatorTest {
    private PasswordValidator validator;
    @BeforeEach
    public void setUp() {
        validator = new PasswordValidator();
    }
    @Test
    public void testValidPassword(){
        String validPassword = "Password123&";
        boolean isValid = validator.isValidPassword(validPassword);
        Assertions.assertTrue(isValid);
    }
    @Test
    public void notValid(){
        String notValidPassword = "";
        boolean noValid = validator.isValidPassword(notValidPassword);
        Assertions.assertFalse(noValid);
    }


}