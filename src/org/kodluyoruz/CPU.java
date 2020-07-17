package org.kodluyoruz;

/**
 * Bu sınıf bir işlemciyi temsil eder.
 * TODO Bu sınıfı Hardware sınıfının alt sınıfı haline getirin.
 *
 * Her işlemcinin Hardware sınıfındakilere ek olarak 2 özelliği vardır:
 *      - Çekirdek sayısı (cores) (int türünde)
 *      - Thread sayısı (threads) (int türünde)
 *
 * TODO Bu 2 özellik ve bunların metotları için gereken kodları bu sınıfın içine yazın
 */
public class CPU extends Hardware
{

    public int cores;
    public int threads;

    public int getCores() {
        return cores;
    }

    public int getThreads() {
        return threads;
    }

    public void setCores(int cores) {
        this.cores = cores;
        setPrice(price);
    }

    public void setThreads(int threads) {
        this.threads = threads;
    }

    /*
     * Çekirdek sayısı 6 veya daha fazlaysa CPU'nun fiyatı %30 oranında artar.
     * TODO buna göre Hardware sınıfındaki fiyat hesaplayan metodu bu sınıfta yeniden yazın
     */

    @Override
    public void setPrice(double price) {
        if (cores >= 6)
        {
            price *= 1.3;
        }
        super.setPrice(price);
    }
}
