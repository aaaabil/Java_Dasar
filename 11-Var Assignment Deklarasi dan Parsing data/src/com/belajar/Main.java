package com.belajar;

public class Main {
    public static void main(String[] args){
        //variabel

        //Assignment
        int x = 10; //assignment (x memiliki nilai)
        System.out.println("jumlah x = " + x);

        //Deklarasi
        int y; //ini adalah deklarasi (integer tetapi tidak memiliki nilai)
        y = 20;
        System.out.println("nilai y = " + y);


        int hasil;

        //jumlah
        hasil = x + y;
        System.out.println("hasil x + y = " + hasil);

        //kurang
        hasil = x - y;
        System.out.printf("%d - %d = %d\n", x, y, hasil);

        //Parsing atau Konversi data int ke float
        int a= 10;
        float b= 4;
        float c= a/b;
        System.out.printf("%d / %f = %f\n", a,b,c);

        int i= 10;
        int j= 4;
        float k= (float) i/j;
        System.out.printf("%d / %d = %f \n", i, j,k );

        //Parsing atau Konversi data float ke int
        float l= 10;
        float m= 4;
        int n= (int) (l/m);
        System.out.printf("%f / %f = %d \n", l,m,n );

    }
}
