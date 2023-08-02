package Giris;
import java.util.Scanner;
public class KıloBoyEndeks {
    public static void main(String[] args) {

        double kilo,boy,kitle;

        Scanner girdi = new Scanner(System.in);


        System.out.print("Lütfen boyunuzu (metre cinsinden)  giriniz :");

        boy =girdi.nextDouble();


        System.out.print("Kilonuzu giriniz :");

        kilo=girdi.nextDouble();


        kitle = kilo/(boy*boy);

        System.out.println("Vücut Kitle İndeksiniz  : " + kitle);



    }
}
