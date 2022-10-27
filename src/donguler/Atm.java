package donguler;
import java.util.Scanner;
public class Atm {
    public static void main(String[] args) {
        String userName, password;
        Scanner input = new Scanner(System.in);
        int right=3;
        int balance = 1500;
        int select;
        while (right>0){
            System.out.print("Kullanıcı Adınız : ");
            userName = input.nextLine();
            System.out.print("Parolanız : ");
            password = input.nextLine();
            if(userName.equals("betul")&&password.equals("123")){
                System.out.println("Bankaya Hoşgeldiniz");
                do{
                    System.out.println("1-Para Yatırma\n2-Para Çekme\n3-BakiyeSorgula\n4-Çıkış yap");
                    System.out.print("Yapmak istediğiniz işlemi seçiniz : ");
                    select = input.nextInt();
                    switch(select){
                        case 1:{
                            System.out.print("Para miktarı : ");
                            int price = input.nextInt();
                            balance += price;
                            break;
                        }
                        case 2:{
                            System.out.print("Para miktarı : ");
                            int price = input.nextInt();
                            if(price > balance){
                                System.out.println("Bakiye yetersiz");
                            }else{
                                balance -= price;
                            }
                            break;
                        }
                        case 3:{
                            System.out.println("Bakiyeniz  : " +balance);
                            break;
                        }
                    }
                }while(select != 4);
                System.out.println("Tekrar görüşmek üzere");
                break;
            }else{
                System.out.println("Hatalı Giriş! Kalan Hakkınız : " + --right);
            }
        }

    }
}
