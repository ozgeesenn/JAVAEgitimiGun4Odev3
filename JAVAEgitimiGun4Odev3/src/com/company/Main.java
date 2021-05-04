package com.company;

public class Main {

    public static void main(String[] args) {


        OyuncuManager oyuncuManager=new OyuncuManager(new KampanyaManager());
        Oyuncu Oyuncu1=new Oyuncu();
        Oyuncu1.firstName="Özge";
        Oyuncu1.lastName="Şen";
        oyuncuManager.kayitOl(Oyuncu1);
        oyuncuManager.bilgiGuncelle(Oyuncu1);
        oyuncuManager.oyunSatisi();
    }
}
