package com.proftelran.homework.homework21;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CheckPassword {
    public static void main(String[] args) {
        String regex = "[A-Za-z]{8}\\d{1}[A-Za-z]{1,}.{1,}";
        String password = "sEyRgdjo9ygou***88&";
        CheckPassword checkPassword = new CheckPassword();
        boolean b = checkPassword.CheckPassword(regex, password);
        System.out.println(b);


    }
    public boolean CheckPassword(String regex, String password) {
        if (password == null) {
            return false;
        }
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(password);

        return matcher.matches();
    }
}
