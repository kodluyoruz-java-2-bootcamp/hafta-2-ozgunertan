package org.kodluyoruz;

/**
 * Bu sınıf bir RAM'i temsil eder.
 * TODO Bu sınıfı Hardware sınıfının alt sınıfı haline getirin.
 *
 * Her RAM'in Hardware sınıfındakilere ek olarak 2 özelliği vardır:
 *      - Hafıza boyutu (memory) (int türünde) Örnek: 8 GB, 16 GB vs.
 *      - Frekansı (frequency) (int türünde) Örnek: 3200 MHz, 3600 Mhz vs.
 *
 * TODO Bu 2 özellik ve bunların metotları için gereken kodları bu sınıfın içine yazın
 */
public class RAM extends Hardware
{
    public int memory;
    public int frequency;

    public int getMemory() {
        return memory;
    }

    public int getFrequency() {
        return frequency;
    }

    public void setMemory(int memory) {
        this.memory = memory;
        setPrice(price);
    }

    public void setFrequency(int frequency) {
        this.frequency = frequency;
        setPrice(price);
    }

    /*
     * Eğer RAM'in hafızası 16 GB'tan fazlaysa, her 4 GB için fiyatı 100 TL artar.
     * Eğer RAM'in frekansı 3600 MHz'den fazlaysa, her 400 MHz için fiyatı 200 TL artar.
     * TODO buna göre Hardware sınıfındaki fiyat hesaplayan metodu bu sınıfta yeniden yazın
     */

    @Override
    public void setPrice(double price) {
        if (memory > 16)
        {
            int extraMemory = (memory - 16) / 4;
            price += extraMemory * 100.0;
        }

        if (frequency > 3600)
        {
            int extraFrequency = (frequency - 3600) / 400;
            price += extraFrequency * 200;
        }

        super.setPrice(price);
    }
}
