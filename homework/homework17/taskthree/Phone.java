package com.proftelran.homework.homework17.taskthree;

public class Phone {
    private String typeOfPhone;

    public Phone(String typeOfPhone) {
        this.typeOfPhone = typeOfPhone;
    }

    public String getTypeOfPhone() {
        return typeOfPhone;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "typeOfPhone=" + typeOfPhone +
                '}';
    }
}
