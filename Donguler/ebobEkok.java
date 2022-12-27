package Donguler;
import java.util.Scanner;
public class ebobEkok {
    public static void main(String[] args) {
    Scanner inp = new Scanner(System.in);
    int n1,n2;
        System.out.print("ilk sayı:");
        n1 =inp.nextInt();
        System.out.print("ikinci sayı:");
        n2 =inp.nextInt();
        int ebob=0;
        int ekok =0;

        int c=n1;
        while (c>=1) {
            if (n1%c==0 && n2%c==0) {
                System.out.print("ebob değeri: "+c);
                break;
            }
            c--;
        }

        int d=1;
        while (d<=n1*n2) {
            if (d%n1==0 && d%n2==0) {
                System.out.print("\nekok değeri: "+ d);
                break;
            }

            d++;
        }


/*
        for(int i=1; i<=n1;i++) {
                for (int j=1; j<=n2; j++) {
                    if (n1%i==0 && n2%j==0 && i==j){
                        ebob =i;
                }

            }
        }
        System.out.print("ebob değeri: " + ebob);


        for(int k=1; k<=n1*n2;k++) {
                if (k%n1 ==0 && k%n2==0){
                System.out.print("\nekok değeri: " + k);
                    break;

            }

        }


*/
    }
}
