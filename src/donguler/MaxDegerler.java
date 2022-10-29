package donguler;
/*
* Java ile klavyeden girilen N tane sayma sayısından
* en büyük ve en küçük sayıları bulan ve bu sayıları
* ekrana yazan programı yazın.
*/
import java.util.Scanner;
public class MaxDegerler {
    public static void main(String[] args) {
        System.out.print("Kaç tane sayı gireceksiniz : ");
        Scanner input = new Scanner(System.in);
        int n, number,small = 0,big = 0;
        n = input.nextInt();
        for(int i=1; i<=n; i++){
            System.out.print(i+". Sayıyı giriniz : ");
            number=input.nextInt();
            if(i==1){
                small=number;
                big=number;
            }else {
                if(number>big){
                    big=number;
                }else if(number<small){
                    small=number;
                }
            }
        }
        System.out.println("en büyük sayı : " +big);
        System.out.println("en küçük sayı : "+small);
    }
}
