public class Main {
    public static void main(String[] args) {
        // 1. Temel veri tiplerini tanımlama
        int tamSayi = 10; // Tam sayı veri tipi (integer)
        double ondalikSayi = 3.14; // Ondalık sayı veri tipi (double)
        char karakter = 'A'; // Tek karakter veri tipi (char)
        boolean dogruMu = true; // Mantıksal veri tipi (boolean)

        // 2. Değişkenlerin kullanımı
        // Değişkenlerin değerlerini ekrana yazdırma
        System.out.println("Tam Sayı: " + tamSayi); // Tam sayıyı yazdır
        System.out.println("Ondalık Sayı: " + ondalikSayi); // Ondalık sayıyı yazdır
        System.out.println("Karakter: " + karakter); // Karakteri yazdır
        System.out.println("Doğru mu: " + dogruMu); // Boolean değeri yazdır

        // 3. Değişkenlerin güncellenmesi
        tamSayi = 20; // Tam sayının değerini güncelle
        ondalikSayi = 2.71; // Ondalık sayının değerini güncelle

        // Güncellenmiş değerleri ekrana yazdırma
        System.out.println("Güncellenmiş Tam Sayı: " + tamSayi);
        System.out.println("Güncellenmiş Ondalık Sayı: " + ondalikSayi);

        // 4. Değişkenlerin kullanımı ile hesaplama
        double toplam = tamSayi + ondalikSayi; // İki sayının toplamını hesapla
        System.out.println("Toplam: " + toplam); // Toplamı yazdır.
        System.out.println("Dersimiz burada bitmiştir teşekkürler.");
    }
}