package com.polimorfisme.overriding;

public class Segitiga extends BangunDatar {
    private float alas;
    private float tinggi;
    private float sisiA;
    private float sisiB;
    private float sisiC;

    public Segitiga(float alas, float tinggi, float sisiA, float sisiB, float sisiC) {
        this.alas = alas;
        this.tinggi = tinggi;
        this.sisiA = sisiA;
        this.sisiB = sisiB;
        this.sisiC = sisiC;
    }

    @Override
    public float luas() {
        super.luas();
        float luas = 0.5f * alas * tinggi;
        System.out.println("Luas Segitiga: " + luas);
        return luas;
    }

    @Override
    public float keliling() {
        super.keliling();
        float keliling = sisiA + sisiB + sisiC;
        System.out.println("Keliling Segitiga: " + keliling);
        return keliling;
    }

}
