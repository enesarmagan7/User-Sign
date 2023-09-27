package Letcode;

import java.util.Scanner;

public class User {
    public static void main(String[] args) {
        String username,password;
       Scanner sc=new Scanner(System.in);
        System.out.println("Kullanıcı Adınız: ");
        username=sc.nextLine();
        System.out.println("Şifreniz: ");
        password=sc.nextLine();
      if(username.equals("patika") && password.equals("kodluyoruz")){
          System.out.println("Bilgileriniz doğru giriş yaptınız");

      }else{
          System.out.println("Bilgileriniz Yanlış.\n1- Şifreyi Sıfırla");
         int choice= sc.nextInt();

         if(choice==1){

             String newPassword;
             System.out.println("Lütfen şifrenizi eski şifrelerinizden farklı olarak giriniz.");
             newPassword=sc.nextLine();
             if (newPassword.equals("kodluyoruz")){
                 System.out.println("Şifre oluşturulamadı Lütfen tekrar deneyiniz");
             }else{
                 System.out.println("Şifre başarılı bir şekilde oluşturuldu.");
             }
         }
      }


    }
}
