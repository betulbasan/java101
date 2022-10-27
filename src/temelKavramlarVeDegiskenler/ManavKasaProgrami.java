package temelKavramlarVeDegiskenler;

/*
 * Manav Kasa Programı
 * Java ile kullanıcıların manavdan almış oldukları ürünlerin
 *  kilogram değerlerine göre toplam tutarını ekrana yazdıran programı yazın.
 * Meyveler ve KG Fiyatları
 * Armut : 2,14 TL
 * Elma : 3,67 TL
 * Domates : 1,11 TL
 * Muz: 0,95 TL
 * Patlıcan : 5,00 TL
 */
import java.util.Scanner;
public class ManavKasaProgrami {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double armutkg= 2.14 ,elmakg=3.67,domateskg=1.11,muzkg=0.95,patlicankg=5.0;
        double armut,elma,domates,muz,patlican, toplam;
        System.out.println("Aldığınız ürünlerin kilogramlarını yazınız : ");
        System.out.println("Armut : " );
        armut = input.nextDouble();
        System.out.println("Elma : " );
        elma = input.nextDouble();
        System.out.println("Domates : " );
        domates = input.nextDouble();
        System.out.println("Muz : " );
        muz = input.nextDouble();
        System.out.println("Patlıcan : " );
        patlican = input.nextDouble();
        toplam = armutkg*armut + elma*elmakg + domates*domateskg+ muz*muzkg+ patlican*patlicankg;
        System.out.println("Toplam tutar : " +toplam);
    }
}
