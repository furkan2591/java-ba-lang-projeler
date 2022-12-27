package Donguler;
import java.util.Scanner;
public class fibonacci {
    public static void main(String[] args) {
        Scanner inp =new Scanner(System.in);
        System.out.print("eleman sayısı: ");
        int n = inp.nextInt();
        int a=0, b=1, c=0;

        System.out.print(a + ","+ b);
        for(int i=0; i<=n-2;i++) {

            c=a+b;
            System.out.print( ","+c);
            a=b;
            b=c;

            }
        }


}
