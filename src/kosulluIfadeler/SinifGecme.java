package kosulluIfadeler;

/*
 * Dersler : Matematik, Fizik, Türkçe, Kimya, Müzik
 * Geçme Notu : 55
 * Ödev
 * Eğer girilen ders notları 0 veya 100 arasında değil
 *  ise ortalamaya katılmasın.
 */
import java.util.Scanner;
public class SinifGecme {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int mat,fiz,turk,kim,muz;
        double ort;
        int dersSayisi=0,toplamnot=0;
        System.out.println("Notlarınızı Girin : ");
        System.out.print("Matematik : ");
        mat = input.nextInt();
        if (mat<0 || mat>100){
            System.out.println("'0' ve '100' aralığında olmayan notlar ortalamaya dehil edilemez.");
        }
        else {
            dersSayisi+=1;
            toplamnot+=mat;
        }
        System.out.print("Fizik : ");
        fiz = input.nextInt();
        if (fiz<0 || fiz>100){
            System.out.println("'0' ve '100' aralığında olmayan notlar ortalamaya dehil edilemez.");
        }
        else {
            dersSayisi+=1;
            toplamnot+=fiz;
        }
        System.out.print("Türkçe : ");
        turk = input.nextInt();
        if (turk<0 || turk>100){
            System.out.println("'0' ve '100' aralığında olmayan notlar ortalamaya dehil edilemez.");
        }
        else {
            dersSayisi+=1;
            toplamnot+=turk;
        }
        System.out.print("Kimya : ");
        kim = input.nextInt();
        if (kim<0 || kim>100){
            System.out.println("'0' ve '100' aralığında olmayan notlar ortalamaya dehil edilemez.");
        }
        else {
            dersSayisi+=1;
            toplamnot+=kim;
        }
        System.out.print("Müzik : ");
        muz = input.nextInt();
        if (muz<0 || muz>100){
            System.out.println("'0' ve '100' aralığında olmayan notlar ortalamaya dehil edilemez.");
        }
        else {
            dersSayisi+=1;
            toplamnot+=muz;
        }
        ort = toplamnot/dersSayisi;
        if(ort<55){
            System.out.println("Sınıfı Geçemediniz!");
        }else {
            System.out.println("Tebrikler! Sınıfı Geçtiniz!");
        }
        System.out.println("Ortlamanız : " + ort);
    }
}

