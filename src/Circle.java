import java.util.Scanner;

public class Circle {
    public static void main(String[] args) {

       Scanner input = new Scanner(System.in);

        System.out.println("Lütfen yarıçapı giriniz");

        double r = input. nextDouble();


        double pi = 3.14;

        double Alan= pi* Math.pow(r,2);

        System.out.println("Alan:"+ Alan);
        double cevre = 2 * pi * r ;

        System.out.println("Lütfen dairenin merkez açısını giriniz");

        double acı = input.nextDouble();

        double acı_alan = (pi * Math.pow(r,r)* acı) / 360 ;

        System.out.println("Açısı belli olan dairenin alanı:"+ acı_alan );





    }
}
