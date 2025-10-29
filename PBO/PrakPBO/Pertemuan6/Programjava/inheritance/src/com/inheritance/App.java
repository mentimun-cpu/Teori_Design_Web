package com.inheritance;

public class App {
    public static void main(String[] args) throws Exception {
    Karyawan Ridho = new Karyawan("Ridho","12345");
    Karyawan Melan = new Karyawan("Melan","67890");
    Ridho.getinfo();
    Ridho.absenpagi();
    Ridho.absenpagi();
    Ridho.sedangbekerja();
    Melan.absenpagi();
    Melan.sedangbekerja();
    Ridho.absenpulang();
    Melan.absenpulang();

    System.out.println("\n");

    Dosen Andiani = new Dosen("23455", "332211", "Andiani");
    Dosen Ionia = new Dosen("23456", "332212", "Ionia");
    Andiani.getinfo();
    Ionia.getinfo();
    Andiani.absenpagi();
    Andiani.mengajar();
    Ionia.absenpagi();
    Ionia.sedangbekerja();
    Andiani.absenpulang();
    Ionia.absenpulang();
    }
    
}
