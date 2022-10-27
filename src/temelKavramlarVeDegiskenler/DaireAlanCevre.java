package temelKavramlarVeDegiskenler;

/*
 * Dairenin Alanını ve Çevresini Hesaplayan Program
 * Java ile yarı çapını kullanıcıdan aldığınız dairenin alanını ve
 * çevresini hesaplayan programı yazın.
 * Alan Formülü : π * r * r;
 * Çevre Formülü : 2 * π * r;
 * Ödev
 * Yarıçapı r, merkez açısının ölçüsü 𝛼 olan daire diliminin alanı bulan programı yazınız.
 * 𝜋 sayısını = 3.14 alınız.
 * Formül : (𝜋 * (r*r) * 𝛼) / 360
 */
import java.util.Scanner;
public class DaireAlanCevre {
    public static void main(String[] args) {
        /* İLK PRATİK
        Scanner input = new Scanner(System.in);
        double r, alan, cevre, pi =3.14;
        System.out.println("Alanını ve çevresini hesaplamak istediğiniz dairenin yarıçapını giriniz : ");
        r = input.nextDouble();
        alan = pi*r*r;
        cevre = 2*pi*r;
        System.out.println("Alanı : " + alan);
        System.out.println("Çevresi : " + cevre);
        */
        Scanner input = new Scanner(System.in);
        int r,a;
        double pi=3.14,alan;
        System.out.println("Dairein yarı çapını giriniz : ");
        r = input.nextInt();
        System.out.println("Dairein merkez açı ölçüsünü giriniz : ");
        a = input.nextInt();
        alan = (pi*r*r*a)/360;
        System.out.println("Alan : " + alan);
    }
}

