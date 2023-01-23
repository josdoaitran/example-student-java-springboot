package com.testing4everyone.studentsvc.validation;

import java.util.regex.Pattern;

public class EmailValidation {

    public static boolean patternMatches(String emailAddress, String regexPattern) {
        return Pattern.compile(regexPattern)
                .matcher(emailAddress)
                .matches();
    }
}
