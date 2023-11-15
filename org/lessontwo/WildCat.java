package com.proftelran.org.lessontwo;

// наследник, дочерний класс, саб-класс
public class WildCat extends Cat {

    @Override
    public void voice() {
        super.voice();
        System.out.println("AAAAAAAAAAA!!!");
    }

    public WildCat(int age) {
        super(age);
    }
}
