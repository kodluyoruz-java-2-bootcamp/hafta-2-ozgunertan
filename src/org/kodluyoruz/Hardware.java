package org.kodluyoruz;

/**
 * Bu sınıf bilgisayar donanımları için hazırlanmış bir üst sınıftır.
 *
 * Her donanım için ortak olan 3 özellik vardır:
 *      - Markası (brand) (String türünde) Örnek: AMD, Intel, Nvidia, Samsung vs.
 *      - Fiyatı (price) (double türünde)
 *      - Çalışırken harcayacağı güç (power) (int türünde) Not: 1 ile 150 arasında bir değer verebilirsiniz.
 *
 * TODO Bu 3 özellik ve bunların metotları için gereken kodları bu sınıfın içine yazın
 */
public class Hardware
{
    public String brand;
    public int power;
    public double price;

    public String getBrand() {
        return brand;
    }

    public int getPower() {
        return power;
    }

    public double getPrice() {
        return price;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
