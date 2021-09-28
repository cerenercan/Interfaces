package com.company.interfaces;

public class MainPhone {

    public static void telephoneInterface(){

        Telephone cerensPhone = new DeskPhone(534411534);
        cerensPhone.powerOn();
        cerensPhone.callPhone(534411534);
        cerensPhone.answer();
        System.out.println("***********************");
        cerensPhone = new MobilePhone(12345);
        cerensPhone.powerOn();
        cerensPhone.callPhone(12345);
        cerensPhone.answer();

    }
}
