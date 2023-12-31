package com.proftelran.org.lesson4;

public class ATMApp {
    public static void main(String[] args) {
        CreditCard creditCard = new CreditCard();
        creditCard.setCurrencyType(Currency.EUR);

        CreditCard creditCard1 = new CreditCard();
        creditCard1.setCurrencyType(Currency.EUR);
        checkCurrency(creditCard);
        checkCurrency(creditCard1);


    }

    public static void checkCurrency(CreditCard creditCard) {
        if (Currency.EUR == creditCard.getCurrencyType()) {
            System.out.println("It is correct type");
        }
    }


}
