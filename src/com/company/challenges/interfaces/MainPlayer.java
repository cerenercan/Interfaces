package com.company.challenges.interfaces;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainPlayer {

    public static void mainMethod(){
        Player tim = new Player("Tim", 10, 15);
        System.out.println(tim);
        saveObject(tim);

        tim.setHitPoints(8);
        System.out.println(tim);

        tim.setWeapon("Stormbringer");
        saveObject(tim);
//        loadObject(tim);
        System.out.println(tim);


        System.out.println("***************");
        Saveable werewolf = new Monster("Werewolf", 20, 40);
        System.out.println(werewolf);
        saveObject(werewolf);

    }

    public static List<String> readValues(){
        List<String> values = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        boolean quit = false;
        int index = 0;
        System.out.println("Choose");
        System.out.println("1 - to enter a string");
        System.out.println("0 - to quit");

        while (!quit){
            System.out.println("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice){
                case 0:
                    quit = true;
                    break;
                case 1:
                    System.out.println("Enter a string: ");
                    String stringInput = scanner.nextLine();
                    values.add(index, stringInput);
                    index++;
                    break;
            }
        }
        return values;
    }

    public static void saveObject(Saveable objectToSave){
        for (int i = 0 ; i < objectToSave.write().size() ; i++){
            System.out.println("Saving " + objectToSave.write().get(i) + " to storage device.");
        }
    }
    public static void loadObject(Saveable objectToLoad){
        List<String> values = readValues();
        objectToLoad.read(values);
    }
}
