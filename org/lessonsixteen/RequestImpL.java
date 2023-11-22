package com.proftelran.org.lessonsixteen;

import java.util.function.Consumer;

public class RequestImpL implements Consumer<Request> {
    @Override
    public void accept(Request request) {
        System.out.println("Message is: " + request.getMessage() + " , number is: " + request.getNumber());
    }

    @Override
    public Consumer<Request> andThen(Consumer<? super Request> after) {
        return Consumer.super.andThen(after);
    }
}
