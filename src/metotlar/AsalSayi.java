package metotlar;
import java.util.Scanner;
public class AsalSayi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num;
        while (true){
            System.out.print("Sayı: ");
            num = input.nextInt();
            System.out.println(isPrime(num));
        }
    }
    static boolean isPrime(int num){
            for (int i=2; i<num; i++){
                if(num % i == 0){
                    return false;
                }
            }


        return true;
    }
}
