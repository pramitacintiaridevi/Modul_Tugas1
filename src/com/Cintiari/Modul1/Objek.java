package com.Cintiari.Modul1;

public class Objek {
    public static void main(String[] args) {
        //Deklarasi objek tanpa parameter
        Mahasiswa mahasiswaTanpa = new Mahasiswa();
        mahasiswaTanpa.setNama("pramita");
        mahasiswaTanpa.setNim(19104009);

        //Output
        System.out.println("Mahasiswa 1");
        System.out.println("Nama\t:"+ mahasiswaTanpa.getNama());
        System.out.println("Nim\t:" + mahasiswaTanpa.getNim());

        //Deklarasi objek dengan parameter
        Mahasiswa mahasiswa= new Mahasiswa("Cintiari",11110409);

        //Output
        System.out.println("Mahasiswa 2");
        System.out.println("Nama\t:" + mahasiswa.getNama());
        System.out.println("Nim\t:" + mahasiswa.getNim());

    }
}
