package kosulluIfadeler;

import java.util.Scanner;
public class UcakBileti {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int km, age, type;
        double perKm = 0.10, total ,ageDiscount, typeDiscount;
        System.out.println("Gidilecek kilometre : ");
        km = input.nextInt();
        System.out.println("Yaşınız : ");
        age = input.nextInt();
        System.out.println("Yolculuk tipi 1-Tek Yön, 2-Gidiş Dönüş");
        type = input.nextInt();

        if(age<0 || km <0 || (type !=1 && type !=2)){
            System.out.println("Hatalı Veri Girdiniz!");
        }
        else{
            if(age<12){
                ageDiscount=0.5;
            }else if(age>=12 && age<24){
                ageDiscount=0.1;
            }else if(age>65){
                ageDiscount=0.3;
            }else {
                ageDiscount=0.0;
            }

            total = km*perKm;
            double ticket= total - (ageDiscount*total);

            if(type==1){
                typeDiscount = 0.0;
            }else{
                typeDiscount=0.2;
                ticket = ticket*2;
            }

            double endTicket = ticket - (ticket*typeDiscount);
            System.out.println("Tutar : " +endTicket);
        }

    }
}


