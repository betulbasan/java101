package kosulluIfadeler;

/*
 * Koşullar :
 * Sıcaklık 5'dan küçük ise "Kayak" yapmayı öner.
 * Sıcaklık 5 ve 15 arasında ise "Sinema" etkinliğini öner.
 * Sıcaklık 15 ve 25 arasında ise "Piknik" etkinliğini öner.
 * Sıcaklık 25'ten büyük ise "Yüzme" etkinliğini öner.*/

import java.util.Scanner;
public class EtkinlikOnerme {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double sicaklik;
        System.out.println("Sıcaklık değerini giriniz : ");
        sicaklik = input.nextDouble();
        if(sicaklik<5){
            System.out.println("Kayak yapabilirsiniz");
        }
        else if(5 <= sicaklik && sicaklik<15){
            System.out.println("Sinemaya gidebilirsiniz");
        }
        else if(15 <= sicaklik && sicaklik<25){
            System.out.println("Piknik yapabilirsiniz");
        }
        else if(25<=sicaklik && sicaklik<60){
            System.out.println("Yüzebilirsiniz");
        }
        else{
            System.out.println("Sıcaklık değeri hatalı 60'ın üzerinde sıcaklık olamaz");
        }
    }
}

