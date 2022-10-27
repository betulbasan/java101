package donguler;
import java.util.Scanner;
public class YildizUcgen {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n;
        System.out.print("Sayı : ");
        n = input.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int k = 1; k <= (n - i); k++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= (2 * i) - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 1; i <= n; i++) {
            for (int k = n; k < (n + i); k++) {
                System.out.print(" ");
            }
            for (int m = 1; m <= ((n - i) * 2) - 1; m++) {
                System.out.print("*");
            }
            System.out.println(" ");

        }

    }
}
