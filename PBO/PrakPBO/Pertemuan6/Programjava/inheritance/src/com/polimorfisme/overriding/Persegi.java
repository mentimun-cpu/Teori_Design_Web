package com.polimorfisme.overriding;

public class Persegi extends BangunDatar {
    private float sisi;

    public Persegi(float sisi) {
        this.sisi = sisi;
    }

    @Override
    public float luas() {
        super.luas();
        float luas = sisi * sisi;
        System.out.println("Luas Persegi: " + luas);
        return luas;
    }

    @Override
    public float keliling() {
        super.keliling();
        float keliling = 4 * sisi;
        System.out.println("Keliling Persegi: " + keliling);
        return keliling;
    }
}
