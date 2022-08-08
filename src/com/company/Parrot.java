package com.company;

public class Parrot {
    public String aty;
    public int jashy;
    public String porodasy;
    public String tusu;

    void setAty(String name) {
        aty = name;
    }

    void setJashy(int vozrost) {
        jashy = vozrost;
    }

    void setPorodasy(String poroda) {
        porodasy = poroda;
    }

    void setTusu(String sveti) {
        tusu = sveti;

    }
    String getAty(){
        return aty;
    }int getJashy(){
        return jashy;
    }
    String getPorodasy(){
        return porodasy;
    }
    String getTusu(){
        return tusu;
    }
}

