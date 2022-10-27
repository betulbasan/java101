package donguler;
import java.util.Scanner;
public class IkininKuvvetleri {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        System.out.print("Sayı giriniz : ");
        n = scanner.nextInt();
        /*
        for(int i=1; i<=n; i*=2){
            System.out.println(i);
        }
        */
        for(int i=1; i<=n; i*=20){
            System.out.println(i);
        }
    }
}
