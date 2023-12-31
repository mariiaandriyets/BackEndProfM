package com.proftelran.homework.homework16.searchengine;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class SearchEngineApp {
    public static void main(String[] args) {
        Product pizza = new Product(1, "Strawberry Pizza");
        pizza.addStringProperties(Color.RED, Flavour.STRAWBERRY);
        pizza.addIntegerProperties("weight", 30);

        Product strawberryCake = new Product(2, "Strawberry Cake");
        strawberryCake.addStringProperties(Color.WHITE, Flavour.STRAWBERRY);
        strawberryCake.addIntegerProperties("weight", 50);

        Product lemonJuice = new Product(3, "Lemon Juice");
        lemonJuice.addStringProperties(Color.YELLOW, Flavour.LEMON);
        lemonJuice.addIntegerProperties("weight", 20);

        Product applePie = new Product(4, "Apple Pie");
        applePie.addStringProperties(Color.GREEN, Flavour.APPLE);
        applePie.addIntegerProperties("weight", 60);

        Product mandarins = new Product(5, "Mandarins");
        mandarins.addStringProperties(Color.ORANGE, Flavour.MANDARIN);
        mandarins.addIntegerProperties("weight", 100);

        Product blueberryDonut = new Product(6, "Blueberry Donut");
        blueberryDonut.addStringProperties(Color.BLUE, Flavour.BLACKBERRY);
        blueberryDonut.addIntegerProperties("weight", 50);

        Product orangeJuice = new Product(7,"Orange Juice");
        orangeJuice.addStringProperties(Color.ORANGE, Flavour.ORANGE);
        orangeJuice.addIntegerProperties("weight", 35);

        List<Product> listProducts = Arrays.asList(pizza, strawberryCake, lemonJuice, applePie, mandarins, blueberryDonut, orangeJuice);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter by what option do you want to collect products: 1 - by weight, 2 - by flavour");

        switch (scanner.nextInt()) {
            case 1 :
                System.out.println("To filter products by weight input next parameters: value, " +
                        "condition name (LESS_THAN, EQUAL, NOT_EQUAL, GREATER_THAN, LESS_OR_EQUAL_THAN, GREATER_OR_EQUAL_THAN)");
                IntegerPredicate integerPredicate = new IntegerPredicate(scanner.nextInt(), IntegerOperator.valueOf(scanner.next().toUpperCase()));
                List<Product> productsListOne = collectByWeight(listProducts, integerPredicate);
                System.out.println(productsListOne);
                break;
            case 2:
                System.out.println("To filter products by flavour input next parameters: flavour (APPLE, MANDARIN, STRAWBERRY, LEMON, BLACKBERRY, ORANGE) and condition (equal or not_equal) ");
                StringPredicate stringPredicate = new StringPredicate(Flavour.valueOf(scanner.next().toUpperCase()),
                        StringOperator.valueOf(scanner.next().toUpperCase()));
                List<Product> productsListTwo = collectByFlavour(listProducts, stringPredicate);
                System.out.println(productsListTwo);

        }
        scanner.close();
    }
    private static List<Product> collectByFlavour (List<Product> products, StringPredicate filter) {
        List<Product> result = new ArrayList<>();
        for (Product product : products) {
            boolean test = filter.test(product);
            if (test == true) {
                result.add(product);
            }
        }
        return result;
    }
    private static List<Product> collectByWeight (List<Product> products, IntegerPredicate filter) {
        List<Product> result = new ArrayList<>();
        for (Product product : products) {
            boolean test = filter.test(product);
            if (test == true) {
                result.add(product);
            }
        }
        return result;
    }
}
