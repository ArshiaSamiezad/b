package model;

import java.util.regex.Pattern;

public enum Validation {
    VALID_USERNAME("[A-Za-z0-9_]+"),
    STRONG_PASSWORD("(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[^0-9a-zA-Z]).{6,}"),
    VALID_EMAIL("[a-zA-Z0-9_\\.]+@[a-zA-Z0-9_\\.]+\\.[a-zA-Z0-9_\\.]+");
    private final String regex;
    
    Validation(String regex) {
        this.regex = regex;
    }
    
    public static boolean check(String string, Validation validation) {
        return Pattern.matches(validation.regex, string);
    }
}
