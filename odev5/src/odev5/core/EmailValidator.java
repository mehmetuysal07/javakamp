package odev5.core;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailValidator implements IEmailValidator{
	private Pattern pattern;
    private Matcher matcher;

    private static final String EMAIL_REGEX = "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
            + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";

    public EmailValidator()
    {
        pattern = Pattern.compile(EMAIL_REGEX);
    }

    public boolean validate(final String email)
    {
        matcher = pattern.matcher(email);
        return matcher.matches();
    }
}
