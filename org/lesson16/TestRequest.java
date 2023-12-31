package com.proftelran.org.lesson16;

import java.util.function.Consumer;

public class TestRequest {
    public static void main(String[] args) {
        Request requestOne = new Request("Hello", 545);

        // Message is : 'message', number is : 'number';

        Consumer<Request> requestConsumer = request -> System.out.println("Message is : " +
                request.getMessage() + " , number is " + request.getNumber());
       requestConsumer.accept(requestOne);
        System.out.println(requestOne);

        RequestImpL requestImpL = new RequestImpL();
        requestImpL.accept(requestOne);

    }
}
