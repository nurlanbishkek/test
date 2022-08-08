package com.company;

public class Main {

    public static void main(String[] args) {

        Dog dog = new Dog();
        dog.setAty("Laika");
        dog.setJashy(3);
        dog.setParoda("Xatiko");
        dog.setTusu("Kara");

        System.out.println(" Aty " + dog.getAty());
        System.out.println("jashy "+ dog.getJashy());
        System.out.println(" porodasy " + dog.getParoda());
        System.out.println(" tusu " + dog.getTusu());

        System.out.println("----------------------------------");

        Cat cat = new Cat();
        cat.setAty(" Nurbek");
        cat.setTusu(" Belyi");
        cat.setJashy(4);

        System.out.println("Aty " + cat.getAty());
        System.out.println("jashy " + cat.getJashy());
        System.out.println("tusu " + cat.getTusu());

        System.out.println("-----------------------------------");

        Fish fish = new Fish();
        fish.setAty("Dorado");
        fish.setTusu("Zolotistyi");
        fish.setJashy(2);

        System.out.println("aty " + fish.getAty());
        System.out.println("tusu " + fish.getTusu());
        System.out.println("jashy " + fish.getJashy());

        System.out.println("------------------------------------");

        Parrot parrot = new Parrot();
        parrot.setAty("Drai");
        parrot.setPorodasy("Kakadu");
        parrot.setJashy(5);
        parrot.setTusu("Belyi");

        System.out.println("aty " + parrot.getAty());
        System.out.println("porodasy "+parrot.getPorodasy());
        System.out.println("jashy "+parrot.getJashy());
        System.out.println("sveti "+ parrot.getTusu());
    }
}
