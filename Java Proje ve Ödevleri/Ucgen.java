package Giris;
import java.util.Scanner;
public class Ucgen {
    public static void main(String[] args) {

        double a,b,c;

        Scanner girdi =new Scanner(System.in);

        System.out.print("1. Kenar Uzunluğu  :");

        a=girdi.nextDouble();

        System.out.print("2. Kenar Uzunluğu :");

        b=girdi.nextDouble();

        System.out.print("3. Kenar Uzunluğu  :");

        c=girdi.nextDouble();


        double cevre =a+b+c;

        System.out.println("Üçgenin Çevre Uzunluğu  :" + cevre);

        double u = cevre/2;


        double alan=Math.sqrt(u*(u-a)*(u-b)*(u-c));
        System.out.print("Üçgenin Alanı  :" + alan);


    }
}
