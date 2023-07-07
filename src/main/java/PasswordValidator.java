
import java.util.regex.Pattern;
public class PasswordValidator {
    private static final int MIN_LENGTH = 8;
    private static final String SPECIAL_CHARACTERS_REGEX = "[!@#$%^&*()-+=]";
    private static final String DIGITS_REGEX = "\\d";
    private static final String UPPERCASE_REGEX = "[A-Z]";
    private static final String LOWERCASE_REGEX = "[a-z]";

    public boolean isValidPassword(String password) {
        if (password == null || password.length() < MIN_LENGTH) {
            return false;
        }
            // Проверка наличия специальных символов
            if (!Pattern.compile(SPECIAL_CHARACTERS_REGEX).matcher(password).find()) {
                return false;
            }

        // Проверка наличия цифр
        if (!Pattern.compile(DIGITS_REGEX).matcher(password).find()) {
            return false;
        }

        // Проверка наличия заглавных и строчных букв
        if (!Pattern.compile(UPPERCASE_REGEX).matcher(password).find()
                || !Pattern.compile(LOWERCASE_REGEX).matcher(password).find()) {
            return false;
        }

        return true;
    }
}
