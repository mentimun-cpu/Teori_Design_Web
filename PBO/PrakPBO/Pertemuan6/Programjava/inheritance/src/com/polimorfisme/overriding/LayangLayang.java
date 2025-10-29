package com.polimorfisme.overriding;

public class LayangLayang extends BangunDatar {
    private int diagonal1;
    private int diagonal2;
    private int sisiA;
    private int sisiB;

    public LayangLayang(int diagonal1, int diagonal2, int sisiA, int sisiB) {
        this.diagonal1 = diagonal1;
        this.diagonal2 = diagonal2;
        this.sisiA = sisiA;
        this.sisiB = sisiB;
    }

    @Override
    public float luas() {
        super.luas();
        float luas = (diagonal1 * diagonal2) / 2;
        System.out.println("Luas Layang-Layang: " + luas);
        return luas;
    }

    @Override
    public float keliling() {
        super.keliling();
        float keliling = 2 * (sisiA + sisiB);
        System.out.println("Keliling Layang-Layang: " + keliling);
        return keliling;
    }

}
