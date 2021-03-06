package org.kodluyoruz;

/**
 * Bu sınıf bir SSD'yi temsil eder.
 * TODO Bu sınıfı Hardware sınıfının alt sınıfı haline getirin.
 *
 * Her SSD'nin Hardware sınıfındakilere ek olarak 1 özelliği vardır:
 *      - Hafıza boyutu, GB cinsinden (memory) (int türünde) Örnek: 500 GB, 750 GB vs.
 *
 * TODO Bu özellik ve metotları için gereken kodları bu sınıfın içine yazın
 */
public class SSD extends Hardware
{

    public int memory;

    public int getMemory() {
        return memory;
    }

    public void setMemory(int memory) {
        this.memory = memory;
        setPrice(price);
    }
    /*
     * Eğer SSD'nin hafızası 750 GB'tan fazlaysa, her 250 GB için fiyatı 275 TL artar.
     * TODO buna göre Hardware sınıfındaki fiyat hesaplayan metodu bu sınıfta yeniden yazın
     */

    @Override
    public void setPrice(double price) {

        if (memory > 750)
        {
            int extraMemory = (memory - 750) / 250;
            price += extraMemory * 275.0;
        }
        super.setPrice(price);
    }
}
