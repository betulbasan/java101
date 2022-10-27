package donguler;

import java.util.Scanner;

public class EbobEkok {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n1,n2,i=1,ebob = 1,ekok=1;
        System.out.print("1.Sayı : ");
        n1=input.nextInt();
        System.out.print("2.Sayı : ");
        n2=input.nextInt();
        
        if(n1<n2){
            while(i<=n1){
                if(n1%i==0 && n2%i==0){
                    ebob=i;
                    ekok=(n1*n2)/ebob;
                }
                i++;
            }
        }else{
            while(i<n2){
                if(n1%i==0 && n2%i==0){
                    ebob=i;
                    ekok=(n1*n2)/ebob;
                }
                i++;
            }
        }
        System.out.println("Ebob : " + ebob);
        System.out.println("Ekok : " +ekok);
    }
}
