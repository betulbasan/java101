package temelKavramlarVeDegiskenler;
import java.util.Scanner;
/*
 * Dik Üçgende Hipotenüs Bulan Program
 * Java ile kullanıcıdan dik kenarlarının
 * uzunluğunu alan ve hipotenüsü hesaplayan programı yazın.
 * Ödev
 * Üç kenar uzunluğunu kullanıcıdan aldığınız üçgenin
 * alanını hesaplayan programı yazınız.
 * Formül
 * Üç𝑔𝑒𝑛𝑖𝑛 ç𝑒𝑣𝑟𝑒𝑠𝑖 = 2𝑢
 * 𝑢 = (a+b+c) / 2
 * Alan * Alan = 𝑢 * (𝑢 − 𝑎)* (𝑢 − 𝑏) * (𝑢 − 𝑐)*/
public class Hipotenus {
    public static void main(String[] args) {
        /* Pratik Kısmı
        Scanner input = new Scanner(System.in);
        double kenar1,kenar2,hipotenus;
        System.out.println("Üçgenin dik kenar uzunluklarını giriniz : ");
        kenar1 = input.nextDouble();
        kenar2 = input.nextDouble();
        hipotenus = Math.sqrt(kenar1*kenar1 + kenar2*kenar2);
        System.out.println("Hipotenüs kenar uzunluğu : " +hipotenus);
        */
        Scanner input = new Scanner(System.in);
        int kenar1,kenar2,kenar3,u;
        double alan;
        System.out.println("Üçgenin üç kenar uzunluklarını giriniz : ");
        kenar1 = input.nextInt();
        kenar2 = input.nextInt();
        kenar3 = input.nextInt();
        u= (kenar1+kenar2+kenar3)/2;
        alan = Math.sqrt(u*(u-kenar1)*(u-kenar2)*(u-kenar3));
        System.out.println("Kenar uzunluklarını "+kenar1+" "+ kenar2+ " "+ kenar3+ " olarak girdiğiniz üçgenin alanı : " + alan);
    }
}

