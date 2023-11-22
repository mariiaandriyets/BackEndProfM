package com.proftelran.org.lessonsixteen.practice;

import java.time.temporal.ValueRange;

public enum HttpCodes {
    INFORMATIONAL(100, 199,(code, v) -> System.out.println("http code : " + code + " : " + v)), // 100 -199
    SUCCESS(200, 299, (code, v) -> System.out.println("http code : " + code + " : " + v)), //200 -299
    REDIRECTION(300, 399, (code, v) -> System.out.println("http code : " + code + " : " + v)), //300 -399
    CLIENT_ERROR(400, 499, (code, v) -> System.out.println("http code : " + code + " : " + v)), // 400 -499
    SERVER_ERROR(500, 599, (code, v) -> System.out.println("http code : " + code + " : " + v) ); //500 -599

    public static void printValueByCode(int code) {
        for (HttpCodes value : HttpCodes.values()) {
//            if (ValueRange.of(value.minCode, value.maxCode).isValidIntValue(code))
            if (code >= value.minCode && code <= value.maxCode) {
                value.doIt(code, value);
            }
        }
    }

    private void doIt(int code, HttpCodes v) {
           action.action(code,v);
    }
    final int minCode;
    final int maxCode;
    final Action action;


    HttpCodes(int minCode, int maxCode, Action action) {
        this.minCode = minCode;
        this.maxCode = maxCode;
        this.action = action;
    }


}
