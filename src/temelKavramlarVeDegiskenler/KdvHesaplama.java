package temelKavramlarVeDegiskenler;
import java.util.Scanner;
public class KdvHesaplama {
    public static void main(String[] args) {
        double para,kdv1 = 0.18, kdv2 =0.08, kdvTutari,kdvLi;
        Scanner input = new Scanner(System.in);
        System.out.println("Para değerini giriniz : ");
        para = input.nextDouble();
        System.out.println("KDV'siz Miktar : " + para);
        kdvTutari = 0<para && para<=1000? (para*kdv1):(para*kdv2);
        kdvLi = para + kdvTutari;
        System.out.println("1000 TL'ye kadar KDV oranı : " +kdv1);
        System.out.println("1000 TL'den sonra KDV oranı : " + kdv2);
        System.out.println("KDV Tutarı : " + kdvTutari);
        System.out.println("KDV'li Fiyat : " + kdvLi);
    }
}
