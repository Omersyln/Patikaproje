package Giris;
import java.util.Scanner;
public class KdvHesaplama {
    public static void main(String[] args) {

        double fiyat, kdvOranı,kdvtutarı,toplamFiyat;

        Scanner inp =new Scanner(System.in);

        System.out.print("Ürünün Fiyatını Giriniz  :");
        fiyat =inp.nextDouble();

        kdvOranı = (fiyat>=1000) ? 0.08 : 0.18;
        kdvtutarı= kdvOranı * fiyat;
        toplamFiyat = kdvtutarı +fiyat;


        System.out.println("KDV'siz Tutar   :"+ fiyat);

        System.out.println("Ürünün KDV Oranı  :"+ kdvOranı);

        System.out.println("Ürünün KDV Tutarı   :" + kdvtutarı );

        System.out.println("Ürününün KDV Dahil Tutarı  :"+ toplamFiyat);









    }
}
