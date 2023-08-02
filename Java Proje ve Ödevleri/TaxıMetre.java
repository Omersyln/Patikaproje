package Giris;
import java.util.Scanner;
public class TaxıMetre {
    public static void main(String[] args) {

        double km,total,startTl=10,kmUcret=2.20;

        Scanner girdi=new Scanner(System.in);

        System.out.print("Mesafeyi Giriniz Kilometre Olarak Giriniz  :");

        km=girdi.nextDouble();

        total=(km*kmUcret);

        total +=startTl;

        total=(total<20)? 20 : total;

        System.out.println("Ödenecek Toplam Tutar  :"+ total);


    }
}
