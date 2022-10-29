package metotlar;
import java.util.Scanner;
public class Desen {
    static void cikti(int n){
        if (n > 0){
            System.out.print(n + " ");

            cikti(n - 5);
        }System.out.print(n +" ");
    }

    public static void main(String[] args) {
        int result, tempNumber;
        Scanner input = new Scanner(System.in);

        System.out.print("Bir sayı giriniz: ");
        int n = input.nextInt();
        cikti(n);
        System.out.println();
    }
}
