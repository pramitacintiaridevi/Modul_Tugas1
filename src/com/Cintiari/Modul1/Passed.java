package com.Cintiari.Modul1;

public class Passed {
    public static void main(String[] args) {
        int nomer1, nomer2;

        TestPass pass = new TestPass(50,100);
        nomer1 = 10;
        nomer2 = 20;

        //Passed by value
        System.out.println("NILAI SEBELUM PASSSED BY VALUE\t :");
        System.out.println("nomer1\t:"+ nomer1);
        System.out.println("nomer2\t:"+ nomer2);

        pass.calculate(nomer1, nomer2);
        System.out.println("NILAI SETELAH PASSED BY VALUE\t:");
        System.out.println("nomer1\t:"+ nomer1);
        System.out.println("nomer2\t:"+ nomer2);
        System.out.println();

        //passed by reference
        System.out.println("NILAI SEBELUM PASSED BY REFERNCE\t:");
        System.out.println("Passed.nomer1\t:"+ pass.nomer1);
        System.out.println("Passed.nomer2\t:"+ pass.nomer2);

        pass.calculate(pass);
        System.out.println("NILAI SESUDAH PASSED BY REFERENCE\t:");
        System.out.println("Passed.nomer1\t:"+ pass.nomer1);
        System.out.println("passed.nomer2\t:"+ pass.nomer2);
    }
}
