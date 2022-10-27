package donguler;
import java.util.Scanner;
public class TekSayiToplamlari {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        /*
        Java döngüler ile negatif bir değer girilene kadar
        kullanıcıdan girişleri kabul eden ve girilen değerlerden
        tek sayıları toplayıp ekrana basan programı yazıyoruz.
        */
        /*
        int n, total=0;
        do {
            System.out.println("Sayı Giriniz : ");
            n = input.nextInt();
            if(n%2==1){
                total+=n;
            }
        }while(n>0);
        System.out.println(total);
         */
        /*Java döngüler ile tek bir sayı girilene kadar kullanıcıdan
        girişleri kabul eden ve girilen değerlerden çift ve
        4'ün katları olan sayıları toplayıp ekrana basan programı yazıyoruz.*/
        int n,total=0;
        do{
            System.out.print("Sayı Giriniz : ");
            n = input.nextInt();
            if(n % 4 == 0){
                total+=n;
            }
        }while(n % 2 == 0);
        System.out.print("Toplam : " + total);
    }
}
