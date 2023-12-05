package com.proftelran.homework.homeworkseventeen.taskfour;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class AutoStreamApp {
    public static void main(String[] args) {
        Auto toyota = new Auto(1, "black", "Toyota", 0, 10000);
        Auto ferrari = new Auto(2, "red", "BMW", 200000, 50000);
        Auto bmw = new Auto(3, "black", "BMW", 0, 30000);
        Auto porsche = new Auto(4, "yellow", "Porsche", 600000, 20000);
        Auto suzuki = new Auto(5, "white", "Suzuki", 900000, 45000);

        List<Auto> carList = Arrays.asList(toyota, ferrari, bmw, porsche, suzuki);
        List<Auto> filteredCarList = carList.stream().filter(s -> "black".equals(s.getColor()))
                .filter(s -> s.getMileage() == 0).collect(Collectors.toList());
        System.out.println(filteredCarList);
        System.out.println();
       carList.stream().filter(x -> x.getPrice() >= 30000 && x.getPrice() <= 50000)
               .map(x -> x.getModel()).distinct().forEach(x -> System.out.println(x));




    }
}
