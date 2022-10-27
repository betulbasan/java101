package temelKavramlarVeDegiskenler;
import java.util.Scanner;
public class NotOrtalamasi {
    public static void main(String[] args) {
        /*
        Not Ortalaması Hesaplayan Program
        Java ile Matematik, Fizik, Kimya, Türkçe, Tarih, Müzik derslerinin sınav puanlarını
        kullanıcıdan alan ve ortalamalarını hesaplayıp ekrana bastırılan programı yazın.
        Ödev
        Aynı program içerisinde koşullu ifadeler kullanılarak,
        eğer kullanıcının ortalaması 60'dan büyük ise ekrana "Sınıfı Geçti" ,
        küçük ise "Sınıfta Kaldı" yazsın.
        Not : If ve Else kullanılmayacak...
        */
        Scanner input = new Scanner(System.in);
        int mat, fiz, kim, turk, tar, muz;
        System.out.println("Matematik notunuzu giriniz ");
        mat = input.nextInt();
        System.out.println("Fizik notunuzu giriniz ");
        fiz = input.nextInt();
        System.out.println("Kimya notunuzu giriniz ");
        kim = input.nextInt();
        System.out.println("Türkçe notunuzu giriniz ");
        turk = input.nextInt();
        System.out.println("Tarih notunuzu giriniz ");
        tar = input.nextInt();
        System.out.println("Müzik notunuzu giriniz ");
        muz = input.nextInt();
        int toplam = mat + fiz + kim + turk + tar + muz ;
        double ort = toplam/6.0;
        System.out.println("Not ortalamanız : " + ort);
        boolean kaldi = true;
        kaldi = ort <60;
        String sonuc = kaldi? "Sınıfta Kaldı" : "Sınıfı Geçti";
        System.out.println(sonuc);
    }
}
