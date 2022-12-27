package Donguler;
import java.util.Scanner;
public class ilkDongu {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int pasw;
        boolean isPaswError =false;


         do {
            System.out.print("Şifreyi Giriniz: ");
            pasw = inp.nextInt();

            if(pasw ==123) {
                System.out.print("Doğru Şifre");
                isPaswError = true;
            } else {
                System.out.println("Yanlış Şifre");
            }
        } while(!isPaswError);
    }
}
