package com.proftelran.homework.homework17.taskthree;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class TaskThreeApp {
    public static void main(String[] args) {
        Client alex = new Client(1, "Alex", 32);
        alex.addPhone(new Phone("Landline"));

        Client oleg = new Client(2, "Oleg", 56);
        oleg.addPhone(new Phone("Landline"));

        Client maria = new Client(3, "Maria", 18);
        maria.addPhone(new Phone("Mobile"));

        List<Client> clientList = new ArrayList<>();
        clientList.add(alex);
        clientList.add(oleg);
        clientList.add(maria);


        Optional<Client> max = clientList.stream().max((o1, o2) -> o1.getAge() - o2.getAge());
        max.stream().map(x -> x.getPhoneList())
                .flatMap(x -> x.stream()
                        .filter(a -> "Landline".equals(a.getTypeOfPhone()))).forEach(x -> System.out.println(max.get()));

    }
}
