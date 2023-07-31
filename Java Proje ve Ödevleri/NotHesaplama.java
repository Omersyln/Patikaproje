import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Değişkebleri oluştur

        int mat, fizik,kimya,turkçe,tarih,muzik;

        // Scanner sınıfımızı tanımladık

        Scanner inp =new Scanner(System.in);

        // Kullanıcı değerlerini al

        System.out.print("Matamatik Notunuzu Giriniz:");
        mat =inp.nextInt();
        System.out.print("Fizik Notunuzu Giriniz:");
        fizik=inp.nextInt();
        System.out.print("Kimya Notunuzu Giriniz:");
        kimya =inp.nextInt();
        System.out.print("Türkçe Notunuzu Giriniz:");
        turkçe =inp.nextInt();
        System.out.print("Tarih Notunuzu Giriniz :");
        tarih = inp.nextInt();
        System.out.print("Müzik Notunuzu Giriniz:");
        muzik=inp.nextInt();

        //Not ortalaması için formul yazıyoruz

        int toplam = (mat+fizik+kimya+turkçe+tarih+muzik);

        double sonuc =toplam / 6.0 ;

        System.out.println("Ortalamanız :"   + sonuc);

        //Not ortalamasına göre geçip kalma durumu

        int kalmanotumax = 60;

        //Koşulumuzu yazıyoruz

        boolean kosul1 = sonuc >=kalmanotumax;

        String str = (kosul1) ? "TEBRİKLER GEÇTİNİZ" : "ÜZGÜNÜZ KALDINIZ";

        System.out.println(str);

                                                                //ömer S. Ptika.dev java dersleri ilk projesidir.

    }

}
