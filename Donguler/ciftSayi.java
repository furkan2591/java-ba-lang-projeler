package Donguler;
import java.util.Scanner;
public class ciftSayi {
    public static void main(String[] args) {
        int sayi, a=1, top=0, adet=0, ort;
        Scanner inp =new Scanner(System.in);
        System.out.print("Sayı Giriniz: ");
        sayi = inp.nextInt();

        while (a<sayi){
            if(a%3==0 && a%4==0){
                adet++;
                top += a;
            }
            a++;
        }
        ort = (top/adet);
        System.out.println("Ortalama: " +ort);
    }

}
