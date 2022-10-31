package diziler;
import java.util.Scanner;
import java.util.Arrays;
public class MinMax {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Sayı : ");
        int n = scanner.nextInt();
        int [] list = {15,12,788,1,-1,-778,2,0};
        Arrays.sort(list);
        System.out.println(Arrays.toString(list));
        int min = list[0];
        int max = list[list.length-1];

        for(int i: list){
            if(i<max && i>n){
                max = i;
            }
            if(i>min && i<n){
                min = i;
            }
        }
        System.out.println(max);
        System.out.println(min);
    }
}
