package kosulluIfadeler;

import java.util.Scanner;
public class HesapMakinesi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n1, n2;
        int select;
        System.out.println("HESAP MAKİNESİ");
        System.out.print("İlk sayıyı giriniz : ");
        n1 = input.nextInt();
        System.out.print("İkinci sayıyı giriniz : ");
        n2 = input.nextInt();
        System.out.println("1-Toplama\n2-Çıkarma\n3-Çarpma\n4-Bölme");
        System.out.println("Lütfen seçtiğiniz işlemin numarasını yazınız.");
        select = input.nextInt();

        switch(select){
            case 1:
                System.out.println("Sonuç : " + (n1+n2));
                break;
            case 2:
                System.out.println("Sonuç : " + (n1-n2));
                break;
            case 3:
                System.out.println("Sonuç : " + (n1*n2));
                break;
            case 4:
                switch(n2){
                    case 0:
                        System.out.println("Sayılar sıfıra bölünemez. Hatalı giriş yaptınız.");
                        break;
                    default:
                        System.out.println("Sonuç : " + (n1/n2));
                }
                break;
            default:
                System.out.println("Hatalı işlem kodu girdiniz.");
        }

    }
}

