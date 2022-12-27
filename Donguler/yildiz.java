package Donguler;
import java.sql.SQLOutput;
import java.util.Scanner;
public class yildiz {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int n,i=1;
        System.out.print("sayı giriniz: ");
        n = inp.nextInt();

        while(i<n){
            int k=1;
            while(k<(n-i)) {
                System.out.print(" ");
                k++;
            }
            int p =1;
            while(p<=(2*i-1)) {
                System.out.print("*");
                p++;
            }

            System.out.println();
            i++;

        }

    }
}
