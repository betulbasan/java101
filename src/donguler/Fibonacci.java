package donguler;
import java.util.Scanner;
public class Fibonacci {
    public static void main(String[] args) {
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.print("Kaç elemanlı Fibonacci serisi istersiniz : ");
        n= sc.nextInt();
        int a=0,b=1,c;
        for(int i=2;i<n;i++)
        {
            c=a+b;
            System.out.println(a + " + " + b + " = " + c);
            a=b;
            b=c;
        }
        System.out.println();
    }

}
