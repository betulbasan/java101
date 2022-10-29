package donguler;
import java.util.Scanner;
public class TersUcgen {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Basamak sayısı : ");
        int n;
        n= scanner.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int k = n; k < (n + i); k++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= ((n - i) * 2) - 1; j++) {
                System.out.print("*");
            }
            System.out.println(" ");

        }

    }
}
