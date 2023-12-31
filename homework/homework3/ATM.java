package com.proftelran.homework.homework3;

public abstract class ATM {

    private String name;
    private double usd;


    public double withdrawMoney(CreditCard creditCard, double usd) {
        creditCard = new CreditCard("7898479838928489", 876, 1986, "EUR");
        double a = 10000;
        double o = a - usd;
        if (usd < 10000) {
            System.out.println("You successfully withdrew " + usd +
                    " current sum in ATM is " + o);
        } else if (usd > 10000) {
            System.out.println("The sum is too big to withdraw");
        }
        this.usd = usd;
        return usd;
    }

}



