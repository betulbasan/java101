package kosulluIfadeler;

import java.util.Scanner;
public class ArtikYil {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int year,mod1,mod2;
        System.out.print("Yıl giriniz : ");
        year=input.nextInt();
        mod1 = year % 4;
        mod2= year %400;
        if(mod1==0 && mod2==0){
            System.out.println(year +" bir artık yıldır");
        }else{
            System.out.println(year +" bir artık yıl değildir");
        }
    }
}

