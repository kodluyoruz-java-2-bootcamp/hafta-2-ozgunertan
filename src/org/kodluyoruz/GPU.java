package org.kodluyoruz;

/**
 * Bu sınıf bir ekran kartını temsil eder.
 * TODO Bu sınıfı Hardware sınıfının alt sınıfı haline getirin.
 *
 * Her ekran kartının Hardware sınıfındakilere ek olarak 2 özelliği vardır:
 *      - Hafıza boyutu (memory) (int türünde) Örnek: 4 GB, 8 GB vs.
 *      - Renk skalası (bits) (int türünde) Örnek: 128 bits, 256 bits vs.
 *
 * TODO Bu 2 özellik ve bunların metotları için gereken kodları bu sınıfın içine yazın
 */
public class GPU extends Hardware
{
    public int memory;
    public int bits;

    public int getMemory() {
        return memory;
    }

    public int getBits() {
        return bits;
    }

    public void setMemory(int memory) {
        this.memory = memory;
        setPrice(price);
    }

    public void setBits(int bits) {
        this.bits = bits;
        setPrice(price);
    }

    /*
     * Eğer ekran kartının hafızası 8 GB'tan fazlaysa, her 2 GB için fiyatı 250 TL artar.
     * Eğer ekran kartının renk skalası 128 bits'ten fazlaysa, her 64 bits için fiyatı 400 TL artar.
     * TODO buna göre Hardware sınıfındaki fiyat hesaplayan metodu bu sınıfta yeniden yazın
     */

    @Override
    public void setPrice(double price) {
        if (bits > 128)
        {
            int extraBits = (bits - 128) / 64;
            price += extraBits * 400.0;
        }

        if (memory > 8)
        {
            int extraMemory = (memory - 8) / 2;
            price += extraMemory * 250.0;
        }
        super.setPrice(price);
    }
}
