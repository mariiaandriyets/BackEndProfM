package com.proftelran.homework.homework21;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CheckEmail {
    public static void main(String[] args) {

        String email = "andriyets2004@gmail.com";
        boolean validEmail = isValidEmail(email);
        System.out.println("The email is valid = " + validEmail);

    }
    private static boolean isValidEmail(String email) {
        String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";
        Pattern pattern = Pattern.compile(emailRegex);
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
    }
}

