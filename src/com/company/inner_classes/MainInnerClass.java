package com.company.inner_classes;

public class MainInnerClass {

    public static void innerClassesExample(){
        Gearbox mcLaren = new Gearbox(6);
        System.out.println("Add gear 1");
        mcLaren.addGear(1, 5.3);
        System.out.println("Add gear 2");
        mcLaren.addGear(2, 10.6);
        System.out.println("Add gear 3");
        mcLaren.addGear(3, 15.9);
        System.out.println("Operate Clutch == true");
        mcLaren.operateClutch(true);
        System.out.println("Change gear to 1");
        mcLaren.changeGear(1);
        System.out.println("Operate Clutch == false");
        mcLaren.operateClutch(false);
        System.out.println("sout wheel speed called with 1000 revs");
        System.out.println(mcLaren.wheelSpeed(1000));
        System.out.println("Change gear to 2");
        mcLaren.changeGear(2);
        System.out.println("sout wheel speed called with 3000 revs");
        System.out.println(mcLaren.wheelSpeed(3000));
        System.out.println("Operate Clutch == true");
        mcLaren.operateClutch(true);
        System.out.println("Change gear to 3");
        mcLaren.changeGear(3);
        System.out.println("Operate Clutch == false");
        mcLaren.operateClutch(false);
        System.out.println("sout wheel speed called with 6000 revs");
        System.out.println(mcLaren.wheelSpeed(6000));
    }
}
