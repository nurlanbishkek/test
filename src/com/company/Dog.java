package com.company;

public class Dog {

    public String aty;
    public int jashy;
    public String paroda;
    public String tusu;

    void setAty(String name) {
        //  if (aty.length()>3){
        aty = name;
        //  }

    }

    void setJashy(int vozrost) {
        // if (jashy>0) {
        jashy = vozrost;
        // }
    }

    void setParoda(String breed) {
        //  if (paroda.length()>4){
        paroda = breed;


        //     }else {
        //       System.out.println("myndai poroda jok");
        //   }
    }

    void setTusu(String ak) {
        tusu = ak;
    }

    String getAty() {
        return aty;
    }

    int getJashy() {
        return jashy;
    }

    String getParoda() {
        return paroda;
    }

    String getTusu() {
        return tusu;
    }
}

