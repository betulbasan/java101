package metotlar;
import java.util.Scanner;
public class UsHesabi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true){
            System.out.print("Sayı : ");
            int num = scanner.nextInt();
            System.out.print("Üssü : ");
            int pow = scanner.nextInt();
            System.out.println(pow(num,pow));
        }

    }
    static int pow(int num, int pow){
        int result = 1;
        for(int i =1; i<=pow; i++){
            result *=num;
        }
        return result;
    }
}
