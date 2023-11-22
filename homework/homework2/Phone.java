package com.proftelran.homework.homework2;

public class Phone {
    private String phoneName;

    private String ownNumber;

    public String getPhoneName() {
        return phoneName;
    }

    public void setPhoneName(String phoneName) {
        this.phoneName = phoneName;
    }

    public String getOwnNumber() {
        return ownNumber;
    }

    public void setOwnNumber(String ownNumber) {
        this.ownNumber = ownNumber;
    }

    public void call(int callNumber){
        System.out.println("try to make a call to number " + callNumber);

    }

    public void receiveCall(int receiveCallNumber){
        System.out.println("try to receive a call from number " + receiveCallNumber);

    }

    public void makeCall0 (String phoneName, String ownNumber, int makeCall) {
        this.phoneName = phoneName;
        this.ownNumber = ownNumber;
        System.out.println("The call from " + getPhoneName() + " " + getOwnNumber() + " is making to " + makeCall);
    }



}
