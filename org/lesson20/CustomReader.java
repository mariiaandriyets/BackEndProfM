package com.proftelran.org.lesson20;

public class CustomReader implements AutoCloseable{
    @Override
    public void close() throws Exception {
        System.out.println("Hello from close method");
    }
}
