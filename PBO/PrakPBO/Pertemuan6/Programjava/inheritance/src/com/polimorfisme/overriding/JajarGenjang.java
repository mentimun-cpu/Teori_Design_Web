package com.polimorfisme.overriding;

public class JajarGenjang extends BangunDatar {
    private int alas;
    private int tinggi;
    private int sisiMiring;

    public JajarGenjang(int alas, int tinggi, int sisiMiring) {
        this.alas = alas;
        this.tinggi = tinggi;
        this.sisiMiring = sisiMiring;
    }

    @Override
    public float luas() {
        super.luas();
        float luas = alas * tinggi;
        System.out.println("Luas Jajar Genjang: " + luas);
        return luas;
    }

    @Override
    public float keliling() {
        super.keliling();
        float keliling = 2 * (alas + sisiMiring);
        System.out.println("Keliling Jajar Genjang: " + keliling);
        return keliling;
    }

}
