import org.junit.Assert;
import org.junit.Before;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;


import static org.junit.jupiter.api.Assertions.*;

public class PasswordValidatorTest {
    private PasswordValidator validatorr;
    @BeforeEach
    public void setUp() {
        validatorr = new PasswordValidator();
    }
    @Test
    public void testValidPassword(){
        String validPassword = "Password123&";
        boolean isValid = validatorr.isValidPassword(validPassword);
        Assertions.assertTrue(isValid);
    }
    @Test
    public void notValid(){
        String notValidPassword = "";
        boolean noValid = validatorr.isValidPassword(notValidPassword);
        Assertions.assertFalse(noValid);
    }


}