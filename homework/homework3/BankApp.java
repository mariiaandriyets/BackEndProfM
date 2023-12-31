package com.proftelran.homework.homework3;

import java.util.Scanner;

public class BankApp {
    public static void main(String[] args) {

        Santander santander = new Santander();
        PrivateBank privateBank1 = new PrivateBank();
        PrivateBank privateBank2 = new PrivateBank();
        PKOBankPoland pkoBankPoland = new PKOBankPoland();
        CreditCard creditCard = new CreditCard("7898479838928489", 876, 1986, "EUR");

        ATM[] ATMs = {santander, privateBank1, privateBank2, pkoBankPoland};
        Converter[] converter = new Converter[2];
        sortATM(ATMs, converter);

        for (Converter element : converter) {
            if (element != null) {
                element.convert(5, 1.2);
                element.greetings();
            }
        }


        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the pin:");
        int yourPin = sc.nextInt();
        if (yourPin == 876) {
            System.out.println("Enter the sum in EURO:");
        } else if (yourPin != 876) {
            System.out.println("error");
        }
        int yourSum = sc.nextInt();
        System.out.println("Your sum to withdraw in USD " + santander.convert(yourSum, 1.2));
        double a = santander.convert(yourSum, 1.2);
        creditCard.withdrawMoney(creditCard, a);
    }

    private static void sortATM(ATM[] ATMs, Converter[] converter) {
        int atmIndex = 0;
        for (ATM atm : ATMs) {
            if (atm instanceof Converter) {
                converter[atmIndex++] = (Converter) atm;
            }
        }

    }

}



