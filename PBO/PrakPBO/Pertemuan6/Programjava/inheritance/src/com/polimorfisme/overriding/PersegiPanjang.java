package com.polimorfisme.overriding;

public class PersegiPanjang extends BangunDatar {
    private float panjang;
    private float lebar;

    public PersegiPanjang(float panjang, float lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
    }

    @Override
    public float luas() {
        super.luas();
        float luas = panjang * lebar;
        System.out.println("Luas Persegi Panjang: " + luas);
        return luas;
    }

    @Override
    public float keliling() {
        super.keliling();
        float keliling = 2 * (panjang + lebar);
        System.out.println("Keliling Persegi Panjang: " + keliling);
        return keliling;
    }
    
}
