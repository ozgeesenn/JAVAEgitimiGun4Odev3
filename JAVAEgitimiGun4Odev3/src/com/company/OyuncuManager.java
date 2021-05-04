package com.company;

public class OyuncuManager extends Oyuncu implements SatisManager {

    private SatisManager _satisManager;

    public OyuncuManager(SatisManager _satisManager){ this._satisManager=_satisManager;}

    public void kayitOl(Oyuncu oyuncu) {
        System.out.println("Kayit olundu." + oyuncu.firstName + oyuncu.lastName);
    }

    public void bilgiGuncelle(Oyuncu oyuncu) {
        System.out.println("Bilgi güncellendi." + oyuncu.firstName + oyuncu.lastName);
    }

    public void kayitSil(Oyuncu oyuncu) {
        System.out.println("Kayit silindi." + oyuncu.firstName + oyuncu.lastName);
    }

    @Override
    public void oyunSatisi() {

        _satisManager.oyunSatisi();;
    }
}
