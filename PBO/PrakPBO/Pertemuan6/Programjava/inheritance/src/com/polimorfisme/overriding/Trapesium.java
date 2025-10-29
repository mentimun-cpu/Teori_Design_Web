package com.polimorfisme.overriding;

public class Trapesium extends BangunDatar {
    private int sisiSejajar1;
    private int sisiSejajar2;
    private int tinggi;
    private int sisiMiring1;
    private int sisiMiring2;

    public Trapesium(int sisiSejajar1, int sisiSejajar2, int tinggi, int sisiMiring1, int sisiMiring2) {
        this.sisiSejajar1 = sisiSejajar1;
        this.sisiSejajar2 = sisiSejajar2;
        this.tinggi = tinggi;
        this.sisiMiring1 = sisiMiring1;
        this.sisiMiring2 = sisiMiring2;
    }

    @Override
    public float luas() {
        super.luas();
        float luas = ((sisiSejajar1 + sisiSejajar2) / 2) * tinggi;
        System.out.println("Luas Trapesium: " + luas);
        return luas;
    }

    @Override
    public float keliling() {
        super.keliling();
        float keliling = sisiSejajar1 + sisiSejajar2 + sisiMiring1 + sisiMiring2;
        System.out.println("Keliling Trapesium: " + keliling);
        return keliling;
    }

}
