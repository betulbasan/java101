package donguler;
import java.util.Scanner;
public class UsluSayi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n,k,total=1;
        System.out.print("Sayı : ");
        n = input.nextInt();
        System.out.print("Üssü : ");
        k = input.nextInt();
        for(int i=1; i<=k; i++){
            total = total*n;
        }
        System.out.println(total);
    }
}
