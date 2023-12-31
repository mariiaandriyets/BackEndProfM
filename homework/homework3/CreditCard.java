package com.proftelran.homework.homework3;

public class CreditCard extends ATM {
    private String number;
    private int pin;
    private int sum;
    private String currency;

    public int getPin() {
        return pin;
    }

    public CreditCard(String number, int pin, int sum, String currency) {
        this.number = number;
        this.pin = pin;
        this.sum = sum;
        this.currency = currency;
    }



    @Override
    public double withdrawMoney(CreditCard creditCard, double usd) {
        return super.withdrawMoney(creditCard, usd);
    }
}

