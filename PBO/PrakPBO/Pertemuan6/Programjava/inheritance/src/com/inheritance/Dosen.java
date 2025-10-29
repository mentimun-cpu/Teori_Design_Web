package com.inheritance;

class Dosen extends Karyawan {
    private String NIDN;

    public Dosen(String nama, String kodeKaryawan, String NIDN) {
        super(kodeKaryawan, nama);
        this.NIDN = NIDN;
    }

    public void getNIDN() {
        System.out.println("NIDN Dosen: " + this.NIDN);
    }
    
    public void mengajar() {
        System.out.println(this.nama + " sedang mengajar.");
    }

    public void getinfo() {
        super.getinfo();
        System.out.println("NIDN: " + this.NIDN);
    }
    
}
