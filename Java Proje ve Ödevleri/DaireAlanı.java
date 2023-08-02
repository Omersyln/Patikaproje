package Giris;
import java.util.Scanner;
public class DaireAlanı {
    public static void main(String[] args) {

        double r,a;
        double pi=3.14 ,alan;

        Scanner girdi=new Scanner(System.in);

        System.out.print("Yarıçapı Giriniz  :");

        r=girdi.nextDouble();


        System.out.print("Merkez Açısının Ölçüsünü Giriniz  :");

        a=girdi.nextDouble();


        alan=(pi*(r*r)*a)/360;


        System.out.println("Daire Diliminin Alnı   :" + alan);












    }
}
