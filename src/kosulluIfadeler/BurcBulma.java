package kosulluIfadeler;
/*
 * Koç Burcu : 21 Mart - 20 Nisan
 * Boğa Burcu : 21 Nisan - 21 Mayıs
 * İkizler Burcu : 22 Mayıs - 22 Haziran
 * Yengeç Burcu : 23 Haziran - 22 Temmuz
 * Aslan Burcu : 23 Temmuz - 22 Ağustos
 * Başak Burcu : 23 Ağustos - 22 Eylül
 * Terazi Burcu : 23 Eylül - 22 Ekim
 * Akrep Burcu : 23 Ekim - 21 Kasım
 * Yay Burcu : 22 Kasım - 21 Aralık
 * Oğlak Burcu : 22 Aralık - 21 Ocak
 * Kova Burcu : 22 Ocak - 19 Şubat
 * Balık Burcu : 20 Şubat - 20 Mart
 */
import java.util.Scanner;
public class BurcBulma {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        int month,day;
        String sign = null;
        boolean isError = false;
        System.out.println("Doğduğunuz ay : ");
        month = input.nextInt();
        System.out.println("Doğduğunuz gün : ");
        day = input.nextInt();

        if(month==1){
            if(day>=1 && day<=31){
                if(day<=21){
                    sign= "Oğlak burcu";
                }else{
                    sign= "Kova burcu";
                }
            }else{
                isError = true;
            }
        }else if(month==2){
            if(day>=1 && day<=29){
                if(day<=19){
                    sign= "Kova burcu";
                }
                else{
                    sign="Balık burcu";
                }
            }else {
                isError = true;
            }
        }else if(month==3){
            if(day>=1 && day<=31){
                if(day<=20){
                    sign= "Balık burcu";
                }
                else{
                    sign="Koç burcu";
                }
            }else {
                isError = true;
            }
        }else if(month==4){
            if(day>=1 && day<=30){
                if(day<=21){
                    sign= "Koç burcu";
                }
                else{
                    sign="Boğa burcu";
                }
            }else {
                isError = true;
            }
        }else if(month==5){
            if(day>=1 && day<=31){
                if(day<=21){
                    sign= "Boğa burcu";
                }
                else{
                    sign="İkizler burcu";
                }
            }else {
                isError = true;
            }
        }else if(month==6){
            if(day>=1 && day<=30){
                if(day<=22){
                    sign= "İkizler burcu";
                }
                else{
                    sign="Yengeç burcu";
                }
            }else {
                isError = true;
            }
        }else if(month==7){
            if(day>=1 && day<=31){
                if(day<=22){
                    sign= "Yengeç burcu";
                }
                else{
                    sign="Aslan burcu";
                }
            }else {
                isError = true;
            }
        }else if(month==8){
            if(day>=1 && day<=31){
                if(day<=22){
                    sign= "Aslan burcu";
                }
                else{
                    sign="Başak burcu";
                }
            }else {
                isError = true;
            }
        }else if(month==9){
            if(day>=1 && day<=30){
                if(day<=22){
                    sign= "Başak burcu";
                }
                else{
                    sign="Terazi burcu";
                }
            }else {
                isError = true;
            }
        }else if(month==10){
            if(day>=1 && day<=31){
                if(day<=22){
                    sign= "Terazi burcu";
                }
                else{
                    sign="Akrep burcu";
                }
            }else {
                isError = true;
            }
        }else if(month==11){
            if(day>=1 && day<=30){
                if(day<=21){
                    sign= "Akrep burcu";
                }
                else{
                    sign="Yay burcu";
                }
            }else {
                isError = true;
            }
        }else if(month==31){
            if(day>=1 && day<=29){
                if(day<=21){
                    sign= "Yay burcu";
                }
                else{
                    sign="Oğlak burcu";
                }
            }else {
                isError = true;
            }
        }else {
            isError = true;
        }
        if(isError){
            System.out.println("Hatalı giriş yaptınız");
        }else {
            System.out.println("Burcunuz : " + sign);
        }
    }
}

