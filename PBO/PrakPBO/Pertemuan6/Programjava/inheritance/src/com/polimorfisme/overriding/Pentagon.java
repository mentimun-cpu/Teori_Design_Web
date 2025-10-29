package com.polimorfisme.overriding;

public class Pentagon extends BangunDatar {
    private int sisi;

    public Pentagon(int sisi) {
        this.sisi = sisi;
    }

    @Override
    public float luas() {
        super.luas();
        float luas = (5 * sisi * sisi) / (4 * (float) Math.tan(Math.PI / 5));
        System.out.println("Luas Pentagon: " + luas);
        return luas;
    }

    @Override
    public float keliling() {
        super.keliling();
        float keliling = 5 * sisi;
        System.out.println("Keliling Pentagon: " + keliling);
        return keliling;
    }

}
