package com.polimorfisme.overriding;

public class Lingkaran extends BangunDatar {
    private int jariJari;
    private final float phi = 3.14f;

    public Lingkaran(int jariJari) {
        this.jariJari = jariJari;
    }
    
    @Override
    public float luas() {
        super.luas();
        float luas = phi * jariJari * jariJari;
        System.out.println("Luas Lingkaran: " + luas);
        return luas;
    }
    @Override
    public float keliling() {
        super.keliling();
        float keliling = 2 * phi * jariJari;
        System.out.println("Keliling Lingkaran: " + keliling);
        return keliling;
    }

}
