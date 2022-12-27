package Donguler;
import java.util.Scanner;
public class ikiKuvvet {
    public static void main(String[] args) {
        int a, b, tot=1;
        Scanner inp = new Scanner(System.in);
        System.out.println("Sayı giriniz: ");
        a = inp.nextInt();
        System.out.println("Üssü giriniz: ");
        b = inp.nextInt();

        for (int i=1; i<=b; i++){

            tot*=a;

        }
        System.out.println(tot);
    }
}
