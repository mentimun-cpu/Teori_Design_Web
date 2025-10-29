package com.inheritance;

public class Karyawan {
    protected String nama; 
    protected String kodeKaryawan;

    public Karyawan(String nama, String kodeKaryawan) {
        this.kodeKaryawan = kodeKaryawan;
        this.nama = nama;
    }

    public void absenpagi() {
        System.out.println(this.nama + " melakukan absen pagi.");
    }

    public void sedangbekerja() {
        System.out.println(this.nama + " sedang bekerja.");
    }

    public void absenpulang() {
        System.out.println(this.nama + " melakukan absen pulang.");
    }

    public void getinfo() {
        System.out.println("Kode Karyawan: " + this.kodeKaryawan);
        System.out.println("Nama Karyawan: " + this.nama);
    }
    
}
