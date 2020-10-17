package com.Cintiari.Modul1;

public class Manusia {
    private  String nama;
    private  int umur;

    //definisi constructor
    //construktor pertama = default tanpa paramter
    public Manusia() {}

    //contruktor kedua
    public  Manusia(String nama){
        this.nama = nama;
    }

    //construktor ketiga
    public Manusia(String nama, int umur){
        this.nama = nama;
        this.umur = umur;
    }

    // definisi method
    public String getNama() {
        return nama;
    }

    public void  setNama(String nama){
        this.nama = nama;
    }

    public  int getUmur() {
        return umur;
    }

    public void  setUmur(int umur) {
        this.umur = umur;

    }
}
