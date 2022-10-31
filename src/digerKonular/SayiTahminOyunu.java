package digerKonular;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;
public class SayiTahminOyunu {
    public static void main(String[] args) {
        Random r = new Random();
        int number = r.nextInt(100);
        Scanner sc = new Scanner(System.in);
        //double number = (int) (Math.random()*100);
        int right = 0;
        int selected ;
        int [] wrong = new int [5];
        boolean isWin = false;
        boolean isWrong = false;
        while(right<5){
            System.out.print("Aklımdan bir sayı tuttum. Bil Bakalım :) 0 ile 100 arasında bir tahmin gir Gülsüm : ");
            selected = sc.nextInt();
            if(selected<0 || selected>100){
                System.out.println("Gülsüm 0 ve 100 arasında bir sayı girmelisin!");
                if(isWrong){
                    right ++;
                    System.out.println("Çok fazla hatalı giriş yaptınız hakkınız azaldı : " + (5-right));
                }
                else {
                    isWrong = true;
                    System.out.println("Bir daha hatalı girişinizde hakkınız azalacak");
                }
                continue;
            }
            if(selected==number){
                System.out.println("Vayy nası bildin! Sayı buydu : " + selected);
                isWin = true;
                break;
            }else {
                wrong[right]=selected;
                right++;
                System.out.println("hahaha bilemedin");
                if(selected > number){
                    System.out.println("Daha küçük bir sayı söylemelisin");
                }else{
                    System.out.println("Daha büyük bir sayı söylemelisin");
                }

                System.out.println("Kalan hakkın : " + (5-right));
            }

        }

        if(!isWin && !isWrong){
            System.out.println("Kaybettiniz !!! HAHAHAHA");
            System.out.println("Tahminleriniz : " + Arrays.toString(wrong));
        }
        System.out.println("Cevap buydu : " +number);
    }
}
