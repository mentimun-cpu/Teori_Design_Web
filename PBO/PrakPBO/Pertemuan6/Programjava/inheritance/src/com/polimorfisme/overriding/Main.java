package com.polimorfisme.overriding;

public class Main {
    public static void main(String[] args) throws Exception {
    BangunDatar bangunDatar;

    bangunDatar = new Persegi(4);
    bangunDatar.luas(); 
    bangunDatar.keliling();

    bangunDatar = new Lingkaran(7);
    bangunDatar.luas();
    bangunDatar.keliling();

    bangunDatar = new Segitiga(4, 5, 3, 4, 5);
    bangunDatar.luas();
    bangunDatar.keliling();

    bangunDatar = new PersegiPanjang(4, 6);
    bangunDatar.luas(); 
    bangunDatar.keliling();

    bangunDatar = new BelahKetupat(6, 8, 5);
    bangunDatar.luas();
    bangunDatar.keliling();

    bangunDatar = new Pentagon(6);
    bangunDatar.luas();
    bangunDatar.keliling();

    bangunDatar = new JajarGenjang(4, 6, 5);
    bangunDatar.luas();
    bangunDatar.keliling();

    bangunDatar = new Trapesium(6, 4, 5, 5, 4);;
    bangunDatar.luas();
    bangunDatar.keliling();

    bangunDatar = new LayangLayang(6, 8, 5, 7);
    bangunDatar.luas();
    bangunDatar.keliling();
    }
    
}
