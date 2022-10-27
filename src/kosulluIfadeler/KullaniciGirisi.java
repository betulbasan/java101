package kosulluIfadeler;

/*
 * Ödev
 * Eğer şifre yanlış ise kullanıcıya şifresini
 * sıfırlayıp sıfırlamayacağını sorun,
 * eğer kullanıcı sıfırlamak isterse
 * yeni girdiği şifrenin hatalı girdiği ve
 * unuttuğu şifre ile aynı olmaması gerektiğini kontrol edip ,
 * şifreler aynı ise ekrana "Şifre oluşturulamadı, lütfen başka şifre giriniz."
 *  sorun yoksa "Şifre oluşturuldu" yazan programı yazınız.
 */
import java.util.Scanner;
public class KullaniciGirisi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String username, password,decision,newPassword;
        System.out.println("Kullanıcı Adı : ");
        username= input.nextLine();
        System.out.println("Şifre : ");
        password= input.nextLine();
        if (username.equals("betul") && password.equals("betul123")){
            System.out.println("Giriş Başarılı !");
        }else if(username.equals("betul")){
            System.out.print("Şifre Hatalı! Şifrenizi değiştirmek ister misiniz? yes/no : ");
            decision = input.nextLine();
            if (decision.equals("yes")){
                System.out.print("Yeni Şifreniz : ");
                newPassword = input.nextLine();
                if (newPassword.equals("betul123")) {
                    System.out.println("Şifreniz önceki ile aynı lütfen tekrar deneyiniz.");
                }
                else {
                    System.out.println("Şifre oluşturuldu!");
                }
            }
            else if(decision.equals("no")){
                System.out.println("Şifre değiştirme talebini reddettiniz. Sistemden çıkış yapılıyor.");
            }
            else {
                System.out.println("Hatalı giriş işlem sonlandırıldı. Sistemden çıkış yapılıyor.");
            }
        }else{
            System.out.println("Tüm bilgiler hatalı");
        }
    }
}
