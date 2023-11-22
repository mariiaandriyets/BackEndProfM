package com.proftelran.homework.homework2;

public class HomeworkTwoApp {
    public static void main(String[] args) {

        ButtonPhone buttonPhone = new ButtonPhone();
        buttonPhone.setPhoneName("Nokia");
        buttonPhone.setOwnNumber("878929910");
        buttonPhone.call(111111111);
        buttonPhone.receiveCall(222222222);

        SmartPhone smartPhone = new SmartPhone();
        smartPhone.setPhoneName("Iphone");
        smartPhone.setOwnNumber("722799834");
        smartPhone.call(333333333);
        smartPhone.receiveCall(444444444);

        RadioPhone radioPhone = new RadioPhone();
        radioPhone.setPhoneName("RadioPhone");
        radioPhone.setOwnNumber("927398367");
        radioPhone.call(555555555);
        radioPhone.receiveCall(666666666);

        Phone[] phones = {buttonPhone, smartPhone, radioPhone};
        makeCall(phones);


    }

    private static void makeCall(Phone[] phones){
        for (Phone phone : phones) {
        phone.makeCall0(phone.getPhoneName(), phone.getOwnNumber(), 944983294);
        }


    }


}
