package Donguler;
import java.util.Scanner;
public class atmProjesi {
    public static void main(String[] args) {
        String userName, pasw;
        Scanner inp = new Scanner(System.in);
        System.out.print("kullanıcı adı: ");
        userName = inp.nextLine();
        System.out.print("şifre: ");
        pasw = inp.nextLine();
        int right=2, i=1, select;
        int balance = 1500;
        int tutar;

        while (i<=right) {
            if (!pasw.equals("da123")) {
                System.out.println("tekrar deneyiniz");
                pasw = inp.nextLine();
             if (i==right){
                    System.out.println("bloke oldu");
                }
            } else {
                System.out.println("başarılı giriş");
                do {

                    System.out.println(
                             "1-para çek\n+" +
                             "2-para yatır\n"+
                             "3-bakiye sorgu\n+"+
                             "4-çıkış yap" );
                    System.out.print("yapılacak işlemi seç: ");
                    select = inp.nextInt();
                switch (select) {
                        case 1:
                            System.out.println("tutar gir: ");
                            tutar = inp.nextInt();
                            if (tutar <= balance) {
                                balance -= tutar;
                                System.out.println("yeni bakiyeniz: " + balance);
                            } else {
                                System.out.println("yetersiz bakiye");
                            }
                            break;
                        case 2:
                            System.out.println("tutar gir: ");
                            tutar = inp.nextInt();
                            balance += tutar;
                            System.out.println("yeni bakiyeniz: " + balance);

                            break;

                            default:
                            System.out.println("yanlış seçim");

                }
                } while (select!=4);
                break;
            }
            i++;
            }


    }
}
