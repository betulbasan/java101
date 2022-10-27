package donguler;
import java.util.Scanner;
public class Faktoriyel {
    public static void main(String[] args) {
        int n,r,total1 = 1,total2 = 1,total3 = 1;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Sayı giriniz : ");
        n=scanner.nextInt();
        /*
        for(int i=1; i<=n; i++){
            total = total * i;
        }
        */
        // Kombinasyon formülü
        //C(n,r) = n! / (r! * (n-r)!)
        System.out.print("Kaçlı kombinaysonunu : ");
        r = scanner.nextInt();
        for(int i=1; i<=n; i++){
            total1 = total1 * i;
        }
        for(int i=1; i<=r; i++){
            total2 = total2 * i;
        }
        int a= n-r;
        for(int i=1; i<=a; i++){
            total3 = total3 * i;
        }
        System.out.println(total1/((total2)*(total3)));
    }
}
