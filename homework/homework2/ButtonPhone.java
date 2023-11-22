package com.proftelran.homework.homework2;

public class ButtonPhone extends Phone{
    @Override
    public void call(int callNumber) {
        System.out.println("The phone " + getPhoneName() + " " + getOwnNumber());
        super.call(callNumber);
    }

    @Override
    public void receiveCall(int receiveCallNumber) {
        System.out.println("The phone " + getPhoneName() + " " + getOwnNumber());
        super.receiveCall(receiveCallNumber);
    }
}
