package temelKavramlarVeDegiskenler;

/*
 * Vücut Kitle İndeksi Hesaplama
 * Java ile kullanıcıdan boy ve kilo değerlerini alıp bir değişkene atayın.
 * Aşağıdaki formüle göre kullanıcının "Vücut Kitle İndeks"
 * değerini hesaplayıp ekrana yazdırın.
 * Formül
 * Kilo (kg) / Boy(m) * Boy(m)
 */
import java.util.Scanner;
public class VucutKitleEndeksi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double m, kg,formul;
        System.out.println("Boyunuzu metre cinsinden giriniz : ");
        m = input.nextDouble();
        System.out.println("Kilonuzu giriniz : ");
        kg= input.nextDouble();
        formul= kg/(m*m);
        System.out.println("Vücut kitle endeksiniz : " + formul);
    }
}

