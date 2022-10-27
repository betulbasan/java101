package temelKavramlarVeDegiskenler;

/*
Taksimetre Programı
Java ile gidilen mesafeye (KM) göre taksimetre tutarını
ekrana yazdıran programı yazın.
Taksimetre KM başına 2.20 TL tutmaktadır.
Minimum ödenecek tutar 20 TL'dir.
20 TL altında ki ücretlerde yine 20 TL alınacaktır.
Taksimetre açılış ücreti 10 TL'dir.
*/
import java.util.Scanner;
public class Taksimetre {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double km, kmBasi = 2.20, tutar,sonuc;
        int min =20, acilis =10;
        System.out.println("Gidilen mesafeyi km olarak giriniz : ");
        km = input.nextDouble();
        tutar= km*kmBasi +10;
        sonuc = tutar<min? min:tutar;
        System.out.println("Tutarınız : "+sonuc);
    }
}

