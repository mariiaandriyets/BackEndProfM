package com.proftelran.org.lesson6.hwr;

public class CreditCard {
    private int amount;
    private Currency currency;

    public CreditCard(int amount, Currency currency) {
        this.amount = amount;
        this.currency = currency;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public Currency getCurrency() {
        return currency;
    }

    public void setCurrency(Currency currency) {
        this.currency = currency;
    }

    @Override
    public String toString() {
        return "CreditCard{" +
                "amount=" + amount +
                ", currency=" + currency +
                '}';
    }
}
