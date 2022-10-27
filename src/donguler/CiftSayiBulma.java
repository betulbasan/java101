package donguler;
import java.util.Scanner;
public class CiftSayiBulma {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num, total = 0, count=0;
        System.out.println("Sayı giriniz : ");
        num = input.nextInt();
        // pratik çift sayı örneği
        //for(int i = 0; i <= num; i+=2 ){
          //  System.out.println(i);
        //}
        //Java döngüler ile 0'dan girilen sayıya kadar olan sayılardan
        // 3 ve 4'e tam bölünen sayıların ortalamasını hesaplayan programı yazınız.
        for(int i = 0; i <= num; i++){
            if(i%3==0 && i%4==0){
                count++;
                total +=i;
            }
        }
        double ort =total/(count-1);
        System.out.println(ort);
    }
}
