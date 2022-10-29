package donguler;
import java.util.Scanner;
public class PerfectNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Sayı Giriniz : ");
        int n,total=0;
        n= scanner.nextInt();
        for(int i=1; i<n; i++){
            if(n%i==0){
                total +=i;
            }
        }
        if(total==n){
            System.out.println(n+" Mükemmel sayıdır");
        }else{
            System.out.println(n+" Mükemmel sayı değildir");
        }
    }
}
