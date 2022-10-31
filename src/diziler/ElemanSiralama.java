package diziler;
import java.util.Scanner;
import java.util.Arrays;
public class ElemanSiralama {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Dizi boyutu : ");
        int n = scanner.nextInt();
        System.out.print("Elemanları giriniz : ");
        int [] list = new int[n];
        for(int i=0; i<n; i++){
            list[i]= scanner.nextInt();
        }
        Arrays.sort(list);
        System.out.print(Arrays.toString(list));
    }
}
