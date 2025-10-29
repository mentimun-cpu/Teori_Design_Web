package com.polimorfisme.overloading;
public class App {
    public static void main(String[] args) throws Exception {
        MobilSport ms = new MobilSport("Ferrari");
        ms.gigi(1);
        ms.gigi(2);
        ms.gigi(3);
        ms.gigi(4);
        ms.gigi(5);
        ms.gigi(1, 1);
        ms.gigi(2, 1);
        ms.gigi(3, 1);
        ms.gigi(4, 1);
        ms.gigi(5, 1);
        ms.gigi(1, 2);
        ms.gigi(2, 2);
        ms.gigi(3, 2);
        ms.gigi(4, 2);
        ms.gigi(5, 2);      
    }
}
