package com.proftelran.homework.homeworkthree;

public class Santander extends ATM implements Converter {

    @Override
    public double withdrawMoney(CreditCard creditCard, double usd) {
        return super.withdrawMoney(creditCard, usd);
    }

    @Override
    public double convert(int euro, double exchangeRate) {
        return euro * exchangeRate;
    }

    @Override
    public void greetings() {
        System.out.println("Hello I am a Santander ATM and I'm converter ");
    }
}
