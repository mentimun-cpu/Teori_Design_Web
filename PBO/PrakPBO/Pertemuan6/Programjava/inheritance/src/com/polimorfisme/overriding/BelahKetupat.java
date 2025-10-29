package com.polimorfisme.overriding;

public class BelahKetupat extends BangunDatar {
    private int diagonal1;
    private int diagonal2;
    private int sisi;

    public BelahKetupat(int diagonal1, int diagonal2, int sisi) {
        this.diagonal1 = diagonal1;
        this.diagonal2 = diagonal2;
        this.sisi = sisi;
    }

    @Override
    public float luas() {
        super.luas();
        float luas = (diagonal1 * diagonal2) / 2;
        System.out.println("Luas Belah Ketupat: " + luas);
        return luas;
    }

    @Override
    public float keliling() {
        super.keliling();
        float keliling = 4 * sisi;
        System.out.println("Keliling Belah Ketupat: " + keliling);
        return keliling;
    }

}
