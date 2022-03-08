
package Data;

import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class MailValidator {
    private static final String EMAIL_PATTERN = "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
            + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";

    public MailValidator() {
        Pattern pattern = Pattern.compile(EMAIL_PATTERN);
    }
     public boolean validate(final String email) {

        Pattern pattern = Pattern.compile(EMAIL_PATTERN);

        Matcher matcher = pattern.matcher(email);

        return matcher.matches();
    }
}
