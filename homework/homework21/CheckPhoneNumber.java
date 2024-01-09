package com.proftelran.homework.homework21;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CheckPhoneNumber {
    public static void main(String[] args) {
//
//        Check email
//  777-7777 or  777 7777
//        Check password  8 letters, digit,letters and something else

        String regexOne = "\\d{7}";
        String regexTwo = "\\d{3}\\-\\d{4}";
        String regexThree = "\\d{3}\\s\\d{4}";
        String phoneNumber = "7777777";
        String phoneNumberTwo = "777-7777";
        String phoneNumberThree = "777 7777";

        CheckPhoneNumber checkPhoneNumber = new CheckPhoneNumber();
        boolean isCorrectOne = checkPhoneNumber.isCorrectPhoneNumber(regexOne, phoneNumber);
        boolean isCorrectTwo = checkPhoneNumber.isCorrectPhoneNumber(regexTwo, phoneNumberTwo);
        boolean isCorrectThree = checkPhoneNumber.isCorrectPhoneNumber(regexThree, phoneNumberThree);

        System.out.println("Is " + phoneNumber + " correct = " + isCorrectOne);
        System.out.println("Is " + phoneNumberTwo + " correct = " + isCorrectTwo);
        System.out.println("Is " + phoneNumberThree + " correct = " + isCorrectThree);

    }

    public boolean isCorrectPhoneNumber(String regex, String phoneNumber) {
        if (phoneNumber == null) {
            return false;
        }
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(phoneNumber);

        return matcher.matches();
    }
}
