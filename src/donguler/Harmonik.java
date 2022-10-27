package donguler;
import java.util.Scanner;
public class Harmonik {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n;
        double total=0;
        System.out.print("Sayı : ");
        n = input.nextInt();
        for(int i=1; i<=n; i++){
            total += 1.0/i;
        }
        System.out.println(total);
    }
}
