package com.proftelran.org.lesson22;

//параметризированные классы
public class GenericTest<T>{
    private T obj;

    GenericTest(T obj) {
        this.obj = obj;
    }

    public T getObj() {
        return obj;
    }


}
