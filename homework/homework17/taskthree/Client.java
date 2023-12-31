package com.proftelran.homework.homework17.taskthree;

import java.util.ArrayList;
import java.util.List;

public class Client {
    private int id;
    private String name;
    private int age;

    private List<Phone> phoneList;

    public Client(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public void addPhone(Phone phone) {
        if (this.phoneList == null) {
            this.phoneList = new ArrayList<>();
        }
        this.phoneList.add(phone);
    }

    public int getAge() {
        return age;
    }

    public List<Phone> getPhoneList(String typeOfPhone) {
        return phoneList;
    }

    public List<Phone> getPhoneList() {
        return phoneList;
    }

    @Override
    public String toString() {
        return "Client{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", phoneList=" + phoneList +
                '}';
    }
}
