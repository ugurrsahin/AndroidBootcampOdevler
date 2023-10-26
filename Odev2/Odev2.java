package com.ugursahin.javadersleri.nesne_tabanli;

public class Odev2 {

    public double kmDonusum(int km){
        double mile = km * 0.621;
        return mile;
    }
    public void dikdortgenAlan (int x, int y){
        System.out.println("Dikdörtgenin Alanı : " + (x*y));
    }
    public int faktoriyel (int sayi){

        int toplam = 1;
        for (;sayi>1;sayi--){
            toplam = toplam*sayi;
        }
        return toplam;
    }

    public void eHarfi (String kelime){
        int count = 0;
        for (int i = 0;i<kelime.length();i++){
            if(kelime.charAt(i) == 'e' || kelime.charAt(i) == 'E'){
                count++;
            }
        }
        System.out.println(kelime +" Kelimesinde "+count+ " Tane E Harfi Var");
    }

    public double icAci (int kenarSayi){
        double toplam;

        toplam = ((kenarSayi-2)*180) / kenarSayi;
        return toplam;
    }

    public double maasHesapla (double gun){

        double saat = gun * 8;
        double maas = 0;
        if(saat>150){
            double mesaiSaati = saat - 150;
            maas = (40*150)+(mesaiSaati*80);

        }else {
            maas = saat * 40;
        }

        return maas;
    }

    public double otoparkUcreti (double sure){
        double ucret = 0;
        if(sure>1){
            double ekSure= sure - 1;
            ucret = 50+ (ekSure * 10);
        }else{
            ucret = sure*50;
        }

        return ucret;
    }
}
