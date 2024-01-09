package com.proftelran.org.lesson21;

import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

public class TestSplit {
    public static void main(String[] args) {
        String text = "I learned about TelRan College and now I am studying Java";
        String[] strings = text.split(" ");
        for (String temp : strings) {
            System.out.println(temp);
        }

        String textOne = "I+learned+about+TelRan+College+and+now+I+am+studying+Java";
        String[] stringsOne = textOne.split("\\+");
        for (String temp : stringsOne) {
            System.out.println(temp);
        }

        String textTwo = "I1learned2about3TelRan4College5and6now7I8am9studying0Java";
        String[] stringsTwo = textTwo.split("\\d");
        for (String temp : stringsTwo) {
            System.out.println(temp);
        }

       String [] split = new String[0];
        try {
            Pattern pattern = Pattern.compile("\\d{}");
            split = pattern.split(textTwo);
        } catch (PatternSyntaxException e) {
            System.out.println(e.getPattern());
            System.out.println(e.getDescription());
        }



       for (String temp : split) {
           System.out.println(temp);
       }
    }
}

