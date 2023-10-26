package com.ugursahin.javadersleri.nesne_tabanli;

public class Odev2Main {
    public static void main(String[] args) {

        Odev2 odev2 = new Odev2();
        //1.soru
        double dondurulenMile = odev2.kmDonusum(100);
        System.out.println("Kilometrenin Mile Dönüştürülmüş Hali : "+dondurulenMile);

        //2.soru
        odev2.dikdortgenAlan(4,5);

        //3.soru
        int faktoriyel = odev2.faktoriyel(6);
        System.out.println("Girilen Sayının Faktoriyeli : "+faktoriyel);

        //4.soru
        odev2.eHarfi("fsaEsdete");

        //5.soru
        double icAci = odev2.icAci(3);
        System.out.println("Bir iç açının değeri : "+icAci);

        //6.soru
        System.out.println("Alman gereken maaş : "+odev2.maasHesapla(19.71)+" TL");

        //7.soru
        System.out.println("Ödenmesi gereken otoparak ücreti : "+odev2.otoparkUcreti(3));
    }
}
